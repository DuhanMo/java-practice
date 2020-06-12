package com.kh.list.sort;

public class Book {
    private String title;
    private int price;
    private double discountrate;

    public Book() {}

    public Book(String title, int price, double discountrate) {
        this.title = title;
        this.price = price;
        this.discountrate = discountrate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getDiscountrate() {
        return discountrate;
    }

    public void setDiscountrate(double discountrate) {
        this.discountrate = discountrate;
    }

    @Override
    public String toString() {
        return "name=" + title + ", price=" + price + ", discountrate=" + discountrate;
    }
}
