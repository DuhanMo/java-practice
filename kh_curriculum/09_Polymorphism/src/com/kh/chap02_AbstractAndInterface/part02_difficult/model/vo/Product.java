package com.kh.chap02_AbstractAndInterface.part02_difficult.model.vo;

// 클래스의 멤버로 추상메소드를 가지는 경우에는 class 앞에 abstract 키워드를 표시해야한ek
// 추상클래스는 미완성된 클래스를 말하며, 미완성된 메소드는 반드시 상속을 받아 후손이 완성을 해야한다.

public abstract class Product {

    // 추상클래스에도 생성자를 작성할 수 있다.자 but 객체생성을 못한다.
    // 인터페이스는 생성자도 만들 수 없다.
    public Product() {
    }

    // 추상메소드( 미완성메소드) : 메소드 헤드만 있고 바디는 없는 메소드
    public abstract void abstMethod();

    public void printProduct() {
        System.out.println("Product 클래스의 printProduct() 메소드 실행");
    }

    @Override
    public String toString() {
        return "Product의 toString() 메소드 실행";
    }
}
