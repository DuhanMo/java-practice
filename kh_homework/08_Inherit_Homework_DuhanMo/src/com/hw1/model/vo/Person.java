package com.hw1.model.vo;

public class Person {
    protected String name;
    private int age;
    private double height;
    private double weight;

    public Person() {}

    public Person(int age, double height, double weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String information() {
        return "{" +
                "이름 = '" + name + '\'' +
                ", 나이 = " + age +
                ", 키 = " + height +
                ", 몸무게 = " + weight ;
    }
}
