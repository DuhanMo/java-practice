package com.kh.dateTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateTest {
    // 1.Date(java.util) , Date(java.util)
    // - Data는 자바 개발할 당시 처음에는 급하게 만들다 보니 완성도가 높지 않았다 --> 다국적으로 쓰기도 부적합.
    // - 날짜 및 시간을 1970년 1월 1일을 기준으로 milliseconds 단위로 계산된다.
    // - Data는 년도+1900, 월은 +1을 해줘야 한다.

    // 2. Calendar(java.util)
    // - Calendar가 Date클래스 후에 나오게 되었는데 Filed number를 통해 같은 메소드로 쉽게 다룰 수 있게 나왔다.
    // - 타임존을 제공하게 된다.
    //

    // 3. GregorianCalendar(java.util)
    // - 윤년을 isLeapYear(int year) 메소드를 통해서 알 수 있다.
    // - 년도가 4의 배수이면서, 100의 배수가 아니거나 400의 배수가 되는 해는 해가 윤년
    //   - 해의 연도가 4의 배수가 아니면 평년으로 2월 28일만 있다
    //   - 만약 연도가 4의 배수면서 100의 배수가 아니면 윤일(2월29일)을 도입
    //   - 만약 연도가 100의 배수이면서 400의 배수가 아닐때에는 평년으로 생각한다.
    //   - 만약 연도가 400의 배수면 윤일(2월 29일)을 도입한다.

    // 4. SimpleDateFormat(java.text)
    // - 날짜와 시간을 원하는 format으로 날짜를 뽑아준다.

    public void testDate(){
        Date date = new Date();
        Date when = new Date(new GregorianCalendar().getTimeInMillis());
        System.out.println("현재 날짜 : " + date);
        System.out.println("1970년도 기준 날짜 : " + when);

        System.out.println("현재까지 흐른 시간 확인 : " + date.getTime());
        System.out.println("1970년도 기준 흐 시간 확인 : " + when.getTime());

//        Calendar today = new Calendar(); // 추상클래스라 바로 객체 못만듦
        Calendar today = new GregorianCalendar();
        System.out.println("오늘날짜 : " + today);

        int year = today.get(Calendar.YEAR);
        int month = today.get(Calendar.MONTH)+1;
        int date1 = today.get(Calendar.DATE);
        int ampm = today.get(Calendar.AM_PM);
        int hour = today.get(Calendar.HOUR);
        int min = today.get(Calendar.MINUTE);
        int sec = today.get(Calendar.SECOND);

        System.out.printf("날짜 확인하기 : %d년 %d월 %d일 \n",year,month,date1);
        System.out.println(hour + " : " + min + " : " + sec);
        System.out.println("AMPM: " + (ampm == Calendar.AM ? "오전" : "오후"));

        // 사용자 정의 날짜 포맷 변경
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd E HH:mm:ss");
        String formatDate = sdf.format(today.getTime());
        System.out.println(formatDate);

        today.set(2020,4,7);
        formatDate = sdf.format(today.getTime());
        System.out.println(formatDate);

    }

    public void testDate2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("특정 년도가 윤년인지 확인하기");
        String result = isLeapYear(sc.nextInt())?"윤년" : "평년";
        System.out.println("입력하신 연도는 " + result + "입니다.");

    }
    public boolean isLeapYear(int year){
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);

    }



}
