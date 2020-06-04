package com.kh.chap05_method.part01_overloadingTest;

public class StaticMethod {
    // static 메소드 정적(static)메모리 공간에 프로그램 실행 시 저장된다.
    // 또한 프로그램 종료 시 정적 메모리영역에서 삭제가 된다.

    public static void staticMethod1() {
        int num1 = 10;
        int num2 = 20;
        System.out.println("10과 20의 합은" + (num1 + num2) + "입니다. ");



    }
    public static int staticMethod2() {
        int num1 = 10;
        int num2 = 20;
        return num1 + num2;
    }
    public static void staticMethod3(String name){
        System.out.println(name + " 님의 방문을 환영합니다. ");
    }

    public static String staticMethod4(String name){

        return name + " 님의 방문을 환영합니다.";
    }
}
