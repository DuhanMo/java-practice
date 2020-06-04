package com.kh.chap01_inherit.after.model.vo;

public class SmartPhone extends Computer{
    private String mobileAgency;

    public SmartPhone(){super();}

    public SmartPhone(String brand, String pCode, String name, int price, String cpu, int hdd, int ram, String os, String mobileAgency) {
        super(brand, pCode, name, price, cpu, hdd, ram, os);
        this.mobileAgency = mobileAgency;
    }

    public String getMobileAgency() {
        return mobileAgency;
    }

    public void setMobileAgency(String mobileAgency) {
        this.mobileAgency = mobileAgency;
    }

    public String information() {
        return "SmartPhone{" +
                "mobileAgency='" + mobileAgency + '\'' +
                '}';
    }
}

