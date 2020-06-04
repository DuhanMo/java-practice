package com.kh.chap01.part02_PersonMVC.model.vo;

public class Person {

    private String name;
    private int age;
    private int wealth;

    public Person(){}

    public Person(String name, int age, int wealth){
        this.name = name;
        this.age = age;
        this.wealth = wealth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWealth() {
        return wealth;
    }

    public void setWealth(int wealth) {
        this.wealth = wealth;
    }

    public String information() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", wealth=" + wealth +
                '}';
    }
}

