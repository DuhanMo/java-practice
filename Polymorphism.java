package com.kh.practice;

abstract class Animal {
    abstract void cry();
}
class Cat extends Animal {
    void cry() {
        System.out.println("냐옹냐옹 ");
    }
}

class Dog extends Animal {
    void cry() {
        System.out.println("멍멍 !");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Cat a = new Cat();
        Dog b = new Dog();

        a.cry();
        b.cry();

    }
}