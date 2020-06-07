package com.hw3.model.vo;

public class Pet extends Status implements CommonInter {

    private String species;
    private double weight;
    public Pet(){}
    public Pet(String species, double weight){
        this.species = species;
        this.weight = weight;
    }

    @Override
    public void eat() {
        System.out.println(weight + "kg " + species + "가 밥을 먹음 ");
        if(weight >= 30){
            happiness += 10;
            energy += 20;
            hunger -=20;
        }else if(weight >= 20){
            happiness += 8;
            energy += 16;
            hunger -=16;
        }else if(weight >= 10){
            happiness += 5;
            energy += 10;
            hunger -=10;
        }else{
            happiness += 3;
            energy += 6;
            hunger -=6;
        }
        printStatus();
    }

    @Override
    public void sleep() {
        System.out.println(weight + "kg " + species + "가 잠을 잔다. ");
        if(weight >= 30){
            happiness += 11;
            energy += 18;
            hunger +=20;
        }else if(weight >= 20){
            happiness += 10;
            energy += 16;
            hunger +=16;
        }else if(weight >= 10){
            happiness += 5;
            energy += 10;
            hunger +=10;
        }else{
            happiness += 3;
            energy += 6;
            hunger +=6;
        }
        printStatus();
    }

    @Override
    public void playing() {
        System.out.println(weight + "kg " + species + "가 논다");
        if(weight >= 30){
            happiness += 15;
            energy -= 18;
            hunger +=20;
        }else if(weight >= 20){
            happiness += 10;
            energy -= 16;
            hunger +=16;
        }else if(weight >= 10){
            happiness += 5;
            energy -= 10;
            hunger +=10;
        }else{
            happiness += 3;
            energy -= 6;
            hunger +=6;
        }
        printStatus();
    }

    @Override
    public void printStatus() {
        System.out.println("----- " + species + "의 -----");
        System.out.println("행복수치 : " + happiness + ", 에너지 : " + energy + ", 배고픔 : " + hunger);

    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
