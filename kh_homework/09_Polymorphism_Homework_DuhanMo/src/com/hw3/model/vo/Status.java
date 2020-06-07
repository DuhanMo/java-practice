package com.hw3.model.vo;

public abstract class Status {
    protected int energy;
    protected int happiness;
    protected int hunger;

    public Status(){
        this.energy = 50;
        this.happiness = 50;
        this.hunger = 50;
    }

    public Status(int energy, int happiness, int hunger) {
        this.energy = energy;
        this.happiness = happiness;
        this.hunger = hunger;
    }
     public abstract void printStatus();
}
