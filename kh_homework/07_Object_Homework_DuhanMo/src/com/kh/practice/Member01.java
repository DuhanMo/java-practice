package com.kh.practice;

class Field {
    static int classVar = 10; // 클래스 변수 선언
    int instanceVar = 20;     // 인스턴스 변수 선언
}

public class Member01 {
    public static void main(String[] args) {

        int var = 30;                   // 지역 변수 선언
        System.out.println(var + "\n"); // 지역 변수 참조 //30

        Field myField1 = new Field();   // 인스턴스 생성
        Field myField2 = new Field();   // 인스턴스 생성

        System.out.println(Field.classVar); // 클래스 변수 참조 //10
        System.out.println(myField1.classVar); //10
        System.out.println(myField2.classVar + "\n"); //10

        myField1.classVar = 100;            // 클래스 변수의 값을 변경 --> 인스턴스를 통해 클래스변수 변경 가능.--> 어디서호출하든 변경된 값 호출됨.

        System.out.println(Field.classVar); // 클래스 변수 참조 //100
        System.out.println(myField1.classVar); //100
        System.out.println(myField2.classVar + "\n"); //100

        System.out.println(myField1.instanceVar); // 인스턴스 변수 참조 //20
        System.out.println(myField2.instanceVar + "\n"); //20

        myField1.instanceVar = 200;               // 인스턴스 변수의 값을 변경

        System.out.println(myField1.instanceVar); // 인스턴스 변수 참조 // 200
        System.out.println(myField2.instanceVar); // 20
    }
}
