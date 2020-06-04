package com.kh.chap05_method.part01_overloadingTest;

public class NonStaticMethod {
    // 매개변수 유무와 반환값 유무에 따른 구분
    // 1. 매개변수가 없고, 반환값도 없는 메소드
    public void method1() {
        System.out.println("매개변수와 반환값이 둘 다 없는 메소드 입니다. ");
//        return; 자동으로 해준다 (불필요함)
    }

    // 2. 매개변수가 없고 반환값 있는 메소드
    public String method2() {
//        String str = "매개변수가 없고 반환값이 String 인 메소드 입니다. ";
//        return str;
        return "매개변수가 없고 반환값이 String 인 메소드 입니다. ";
    }

    // 3. 매개변수가 있고 반환값이 없는 메소드
    public void method3(int num1, int num2) {
        // 호출하는 쪽의 괄호에 인자로 넘긴 값을 받기 위해 선언하는 것이 매개변수이며
        // 메소드 선언 시 괄호 안에 변수를 선언하여, 메소드 내에서 사용한다.
        int minus = num1 - num2;
        System.out.println("minus = " +minus);
    }

    public int method4(int num1, int num2) {
        // 호출하는 쪽의 괄호에 인자로 넘긴 값을 받기 위해 선언하는 것이 매개변수이며
        // 메소드 선언 시 괄호 안에 변수를 선언하여, 메소드 내에서 사용한다.
       return num1 - num2;
    }
}
