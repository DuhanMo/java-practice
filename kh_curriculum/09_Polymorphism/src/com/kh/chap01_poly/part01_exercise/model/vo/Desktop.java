package com.kh.chap01_poly.part01_exercise.model.vo;

public class Desktop extends Electronic {
    private String cpu;
    private String graphic;

    public Desktop(){
    }

    public Desktop(String brand, String name, int price, String cpu, String graphic) {
        super(brand, name, price);
        this.cpu = cpu;
        this.graphic = graphic;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGraphic() {
        return graphic;
    }

    public void setGraphic(String graphic) {
        this.graphic = graphic;
    }

    @Override
    public String toString() {
        return super.toString()+"Desktop{" +
                "cpu='" + cpu + '\'' +
                ", graphic='" + graphic + '\'' +
                '}';
    }
}
