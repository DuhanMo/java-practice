package com.kh.chap01_inherit.after.model.vo;

public class Computer extends Product{
    // 두 클래스가 공통적으로 가지고 있는 필드 >> cpu, hdd, ram, os           -> Computer
    private String cpu;
    private int hdd;
    private int ram;
    private String os;

    public Computer(){super();}

//    public Computer(String cpu, int hdd, int ram, String os) {
//
//        super(brand, pCode, pName, price );
//        this.cpu = cpu;
//        this.hdd = hdd;
//        this.ram = ram;
//        this.os = os;
//    }


    public Computer(String brand, String pCode, String name, int price, String cpu, int hdd, int ram, String os) {
        super(brand, pCode, name, price);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.os = os;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String information() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", os='" + os + '\'' +
                '}';
    }
}

