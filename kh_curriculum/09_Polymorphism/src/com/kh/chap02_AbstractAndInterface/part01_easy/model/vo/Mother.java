package com.kh.chap02_AbstractAndInterface.part01_easy.model.vo;

public class Mother extends Family implements Basic, Basic2{

    private String babyBirth;

    public Mother() {
    }

    public Mother(String name, double weight, int health, String babyBirth) {
        super(name, weight, health);
        this.babyBirth = babyBirth;
    }

    @Override
    public void eat() {
        super.setWeight(super.getWeight() + 10);
        super.setHealth(super.getHealth() - 5);
    }
    public void eat2(){}

    @Override
    public void sleep() {
        super.setHealth(super.getHealth() + 10);
    }
    public void sleep2(){}

    public String getBabyBirth() {
        return babyBirth;
    }

    public void setBabyBirth(String babyBirth) {
        this.babyBirth = babyBirth;
    }

    @Override
    public String toString() {
        return super.toString() + "Mother{" +
                "babyBirth='" + babyBirth + '\'' +
                '}';
    }
}
