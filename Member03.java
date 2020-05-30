package com.kh.practice;

class Car {
    private String modelName;
    private int modelYear;
    private String color;



    private int maxSpeed;
    private int currentSpeed;
    {//인스턴스 초기화 블록
        this.currentSpeed = 0;
    }
    Car() {}
    Car(String modelName, int modelYear, String color, int maxSpeed, int currentSpeed){
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    @Override
    public String toString() {
        return "Car{" +
                "modelName='" + modelName + '\'' +
                ", modelYear=" + modelYear +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", currentSpeed=" + currentSpeed +
                '}';
    }
    public String getModelName(){
        return modelName;
    }
    public void setModelName(String modelName){
        this.modelName = modelName;
    }
    public int getCurrentSpeed() {
        return currentSpeed;
    }
    public void setCurrentSpeed(int currentSpeed){
        this.currentSpeed = currentSpeed;
    }
}

public class Member03 {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car car01 = new Car("Mohave",2019,"black", 200, 0);
        System.out.println(myCar.toString()); // 기본생성자 이용..
        System.out.println(car01.toString()); // 명시적생성자 이용..
//        System.out.println(Car.modelName); private변수 modelName 불러올 수 없음 .
        System.out.println("설정 전 myCar의 속력" + myCar.getCurrentSpeed());
        myCar.setCurrentSpeed(250);
        System.out.println("새로 설정한 myCar의 속력" +myCar.getCurrentSpeed());
        System.out.println("설정 전 car01의 이름 : " + car01.getModelName());
        car01.setModelName("두한차");
        System.out.println("새로 설정한 car01의 이름 : " + car01.getModelName());
        System.out.println(car01.toString());





    }
}
