package com.hw2.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class SetDate {
    public SetDate(){}
    public String todayPrint(){
        String today = "";
        GregorianCalendar gc = new GregorianCalendar();
        int year = gc.get(Calendar.YEAR);
        int month = gc.get(Calendar.MONTH)+1;
        int date = gc.get(Calendar.DATE);
        int hour = gc.get(Calendar.HOUR);
        int min = gc.get(Calendar.MINUTE);
        int sec = gc.get(Calendar.SECOND);
        today = year + "년 " + month + "월 " + date +"일 " + hour + "시 " + min + "분 " + sec +"초 ";

        return today;
    }
    public String setDay(){
        Calendar today = new GregorianCalendar();
        today.set(2011,2,21);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
        String formatDate = sdf.format(today.getTime());

        return formatDate;

    }
}
