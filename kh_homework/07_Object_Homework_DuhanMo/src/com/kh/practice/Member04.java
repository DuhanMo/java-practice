package com.kh.practice;

class InitBlock {
    public static int classVar; // 클래스 변수
    int instanceVar; // 인스턴스 변수

    static{ // 클래스 초기화 블록을 이용한 초기화
        classVar = 10;
    }
}

public class Member04 {
    public static void main(String[] args) {
        System.out.println(InitBlock.classVar); // 클래스 변수에 접근
    }
}
