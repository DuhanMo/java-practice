package com.hw3.model.vo;

public class Person extends Status implements CommonInter {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println(age + "세 " + name + "씨가 밥을 먹음");
        int num = age / 10;
        switch (num) {
            case 1:
                happiness += 10;
                energy += 20;
                hunger -= 20;
                break;
            case 2:
                happiness += 8;
                energy += 16;
                hunger -= 16;
                break;
            case 3:
                happiness += 5;
                energy += 10;
                hunger -= 10;
                break;
            default:
                happiness += 3;
                energy += 6;
                hunger -= 6;
                break;
        }
        printStatus();
    }

    @Override
    public void sleep() {
        System.out.println(age + "세 " + name + "씨가 잠을 잠");
        int num = age / 10;
        switch (num) {
            case 1:
                happiness += 10;
                energy += 20;
                hunger += 5;
                break;
            case 2:
                happiness += 8;
                energy += 16;
                hunger += 4;
                break;
            case 3:
                happiness += 5;
                energy += 10;
                hunger += 3;
                break;
            default:
                happiness += 3;
                energy += 6;
                hunger += 2;
                break;
        }
        printStatus();
    }

    @Override
    public void playing() {
        System.out.println(age + "세 " + name + "씨가 논다.");
        int num = age / 10;
        switch (num) {
            case 1:
                happiness += 10;
                energy -= 20;
                hunger += 15;
                break;
            case 2:
                happiness += 8;
                energy -= 16;
                hunger += 10;
                break;
            case 3:
                happiness += 5;
                energy -= 10;
                hunger += 6;
                break;
            default:
                happiness += 3;
                energy -= 6;
                hunger += 4;
                break;
        }
        printStatus();
    }

    @Override
    public void printStatus() {
        System.out.println("----- " + name + "의 -----");
        System.out.println("행복수치 : " + happiness + ", 에너지 : " + energy + ", 배고픔 : " + hunger);
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
}
