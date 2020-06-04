package com.kh.chap02_voerride.run;

import com.kh.chap02_voerride.model.vo.Book;

public class Run {
    public static void main(String[] args) {

        Book bk1 = new Book("자바의 정석", "나자바", 100);
        Book bk2 = new Book("칭찬은 고래도 춤추게 한다", "고래", 300);
        System.out.println(bk1.information());
        System.out.println(bk2.information());


        // 1. Object의 toString 메소드를 사용
        // - 오버라이딩 전 : 풀패키지명 + @ + 객체의 해쉬코드의 16잔수 값이 출력

        // toString 메소드는 객체 호출 시 자동으로 JVM에 의해 뒤에 생성된다.
        // print,println() 을 작성시 toString 명시적으로 안해도 자동으로 호출

        System.out.println(bk1);
        System.out.println(bk2);
        // 2.
        String str = "홍깅동";
        String str1 = "홍깅동";
        String str2 = new String("홍깅동");
        System.out.println(str == str1);
        System.out.println(str1 == str2);
        System.out.println(str.equals(str2));
        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());
        Book bk3 = new Book("자바의 정석", "나자바", 100);
        System.out.println("bk1과 bk3 동일한가? : " + bk1.equals(bk3));

        System.out.println(bk1.hashCode());
        System.out.println(bk2.hashCode());
        System.out.println(bk3.hashCode());
        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());

    }
}
