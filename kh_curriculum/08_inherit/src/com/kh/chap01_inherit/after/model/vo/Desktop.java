package com.kh.chap01_inherit.after.model.vo;

//
public class Desktop extends Computer {

    private boolean allInOne; // 일체형 여부

    public Desktop(){
        super();
    }

    public Desktop(String brand, String pCode, String name, int price, String cpu, int hdd, int ram, String os, boolean allInOne) {
        super(brand, pCode, name, price, cpu, hdd, ram, os);
        this.allInOne = allInOne;

    }

    public boolean isAllInOne() {
        return allInOne;
    }

    public void setAllInOne(boolean allInOne) {
        this.allInOne = allInOne;
    }

    public String information() {
        return "Desktop{" +
                "allInOne=" + allInOne +
                '}';
    }

}
