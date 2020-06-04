package com.kh.chap01_inherit.after.model.vo;

public class Product {
    // 세 클래스가 공통적으로 가지고 있는 필드 >> 제조사, 상품번호, 상품명, 가격

    public static String year;
    private String brand;
    private String pCode;
    protected String name;
    private int price;

    public Product(){}
    public Product(String brand, String pCode, String name, int price) {
        this.brand = brand;
        this.pCode = pCode;
        this.name = name;
        this.price = price;
        System.out.println("부모 생성자 호출");
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String information() {
        return "Product{" +
                "brand='" + brand + '\'' +
                ", pCode='" + pCode + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
