package com.kh.practice;



class InitBlock2 {
    static int classVar = 10; // 클래스 변수의 명시적 초기화
    int instanceVar = 10; // 인스턴스 변수의 명시적 초기화

    static {
        classVar = 20; // 클래스 초기화 블록을 이용한 초기화
    }

    {
        instanceVar = 20; // 인스턴스 초기화 블록을 이용한 초기화
    }

    {InitBlock.classVar = 123123;}

}

public class Member05 {
    public static void main(String[] args) {
        System.out.println(InitBlock.classVar);
    }

}
