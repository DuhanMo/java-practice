package com.kh.chap03_field.part02_initBlock.model.vo;

import com.sun.org.apache.xml.internal.security.Init;

public class InitTest { //객체를 생성할때나 프로그램실행할 때 무조건 한번은 실행.
    // 객체 필드를 초기화하는 방법
    // 1. JVM이 명시한 초기값을 사용한 경우
    private int num1;
    // 2. 필드 생성과 동시에 직접 초기화를 대입하여
    //      사용자 명시적 초기화를 수행
    private int num2 = 10;

    // 3. 초기화 필드를 선언하여 값을 초기화 할 경우
    { // 인스턴스 블럭 - 인스턴스 변수를 초기화 시키는 블럭으로 객체 생성 시 마다 초기화 된다.
        num1 = 1000;
        num2 = 20000;
        num3 = 300;
        //인스턴스 블럭에서는 static필드도 초기화 할 수 있다.//
        //하지마 static 초기화 블럭은 프로그램 시작시에 초기화를 하기 때문에
        // 객체 생성 이후 값을 초기화하는 인스턴스 초기화 블럭의 값으로 덮어쓰게 된다.

    }

    //static 필드의 경우
    private static int num3;
    static { //static블럭 : 클래스변수를 초기화 시키는 블럭으로 프로그램 시작 시 단 한번만 초기화
        num3 = 10;
    }
    // 4. 생성자를 통해 객체를 생성하여 초기화를 수행한 경우
    // ** 이전에 어떤 값이 들어있는지 간에 생성자를 통해 수행한 초기화가 가장 마지막
    //     으로 발생하여 생성자를 통해 수행한 초기화 값이 해당 필드 변수에 대입이 된다.
    public InitTest() {
        num1 = 1;
        num2 = 10;
    }
    //매개변수가 있는 생성자
    public InitTest(int num1) {
        this.num1 = num1;
    }



    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public static int getNum3(){
        return num3;
    }
    public static void setNum3(int num3){
        InitTest.num3 = num3;
    }
}
