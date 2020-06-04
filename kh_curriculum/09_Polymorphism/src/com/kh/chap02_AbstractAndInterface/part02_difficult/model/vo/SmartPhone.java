package com.kh.chap02_AbstractAndInterface.part02_difficult.model.vo;

public class SmartPhone extends Product {

    public SmartPhone(){}

    public void printSmartPhone(){
        System.out.println("SmartPhone클래스의 printSmartPhone() 메소드 실행");

    }

    //상속받은 부모의 추상메소드는 반드시 오버라이딩 해야한다.
    @Override
    public void abstMethod() {

    }

    @Override
    public String toString() {
        return "SmartPhone 클래스의 toString() 메소드 실행";
    }
}
