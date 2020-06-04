package com.kh.practice;

class Method {
    int a = 10, b = 20;                            // 인스턴스 변수
    int add() {
        return a + b; }                    // 인스턴스 메소드
    static int add(int x, int y) {
        return x + y; } // 클래스 메소드
}

public class Member02 {
    public static void main(String[] args) {
        System.out.println(Method.add(20, 30)); // 클래스 메소드의 호출
        Method myMethod = new Method();         // 인스턴스 생성
        System.out.println(myMethod.add());     // 인스턴스 메소드의 호출
    }
}