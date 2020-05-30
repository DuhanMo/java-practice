package com.kh.practice;

class Parent {

    void display() {
        System.out.println("부모 클래스의 display() 메소드 입니다.");
    }

}

class Child extends Parent {

    void display() {
        System.out.println("자식 클래스의 display() 메소드 입니다. ");
    }

    void display(String str) {
        System.out.println(str);
    }
}

public class Inheritance {
    public static void main(String[] args) {
       Child ch = new Child();
       ch.display();
       ch.display("오버로딩된 display() 메소드 입니다");

    }
}
