package com.kh.chap01_poly.part01_exercise.model.vo;

public class NoteBook extends Electronic{
    private String cpu;
    private int usbPort;

    public NoteBook(){}

    public NoteBook(String brand, String name, int price, String cpu, int usbPort) {
        super(brand, name, price);
        this.cpu = cpu;
        this.usbPort = usbPort;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getUsbPort() {
        return usbPort;
    }

    public void setUsbPort(int usbPort) {
        this.usbPort = usbPort;
    }

    @Override
    public String toString() {
        return super.toString() + "NoteBook{" +
                "cpu='" + cpu + '\'' +
                ", usbPort=" + usbPort +
                '}';
    }
}

