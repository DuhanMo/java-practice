package com.kh.chap01_inherit.before.model.vo;

public class SmartPhone {
    private String brand;
    private String pCode;
    private String pName;
    private int price;

    private String cpu;
    private int hdd;
    private int ram;
    private String os;

    private String mobileAgency; // 통신사

    public SmartPhone(){}

    public SmartPhone(String brand, String pCode, String pName, int price, String cpu, int hdd, int ram, String os, String mobileAgency) {
        this.brand = brand;
        this.pCode = pCode;
        this.pName = pName;
        this.price = price;
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.os = os;
        this.mobileAgency = mobileAgency;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    public String getMobileAgency() {
        return mobileAgency;
    }

    public void setMobileAgency(String mobileAgency) {
        this.mobileAgency = mobileAgency;
    }


    public String information() {
        return "SmartPhone{" +
                "brand='" + brand + '\'' +
                ", pCode='" + pCode + '\'' +
                ", pName='" + pName + '\'' +
                ", price=" + price +
                ", cpu='" + cpu + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", os='" + os + '\'' +
                ", mobileAgency='" + mobileAgency + '\'' +
                '}';
    }
}
