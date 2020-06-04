package com.kh.chap03_field.part01_kindOfVariable.run;

import com.kh.chap03_field.part01_kindOfVariable.model.vo.*;

public class Run {

    public static void main(String[] args) {
//    FieldTest1 fd = new FieldTest1();
//    fd.testMethod();

        FieldTest1.testMethod(100);

        FieldTest2 f2 = new FieldTest2();

        // public --> 어디서든 접근 가능
        System.out.println(f2.pubA);

        //default --> 같은 패키지 내에서만 접근가능
//        System.out.println(f2.defB);
        System.out.println(f2.getDefB());

        //private --> 같은 클래스 내에서만 접근 가능
//        System.out.println(f2.priC);
        System.out.println(f2.getPriC());

        //static 메소드이기때문에 굳이 객체 생성 안해도됨
        //static 많이 만들어놓으면 메모리 많이잡아먹음.
        f2.printMethod();
        FieldTest2.printMethod();




        // *static --> 클래스 변수는 프로그램 실행 시 정적 메모리에 할당 되기 때문에 객체 생성 없이 바로 접근 가능하다.
        // public static
        System.out.println(FieldTest2.pubSta);

        //private static
//        System.out.println(FieldTest2.prista); // 바로 접근 불가능
        System.out.println(FieldTest2.getPriSta());

        STest1 st = new STest1();
        st.method2(); // 현재 수량을 확인
        st.method1(10);
        st.method2();
        st.method1(2);
        st.method2();
        STest2 st2 = new STest2();
        st2.method3(10);
        st.method2();

        Book bk1 = new Book();
        bk1.setTitle("자바의 정석");
        bk1.setAuthor("홍길동");
        bk1.setPrice(13000);
//        bk1.setStock(bk1.getStock() + 1);
        Book.setStock(Book.getStock() + 1);
        System.out.println(bk1);

        Book bk2 = new Book();
        bk2.setTitle("자바의 정석_Ver2");
        bk2.setAuthor("홍길동");
        bk2.setPrice(15000);
        Book.setStock(Book.getStock() + 1);
        System.out.println(bk2);

        Book bk3 = new Book("롤의 정석", "박길동", 100000000);
        System.out.println(bk3);



//        System.out.println(bk1.getTitle());
//        System.out.println(bk1.toString());

    }
}
