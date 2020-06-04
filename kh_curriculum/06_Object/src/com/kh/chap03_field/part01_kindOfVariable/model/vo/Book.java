package com.kh.chap03_field.part01_kindOfVariable.model.vo;

public class Book {
    private String title; //도서명
    private String author; //저자명
    private int price; // 가격
    public static final String publisher = "KH 정보교육원";//출판사 ( 정해져있음 )

    private static int stock = 1000000; // 현재 출판사가 보관하고있는 도서의 총 개수

    public Book() {

    }
    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // getter & setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static String getPublisher() {
        return publisher;
    }

    public static int getStock() {
        return stock;
    }

    public static void setStock(int stock) {
        Book.stock = stock;
    }

    @Override // 어노테이션 부모클래스에 있는 메소드를 재정의했다는 의미를 표시

    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }

//    public String information() {
//        return "Book >>>> title = " + title + ", author = " + author + ", price = " + price + ", stock = " + stock;
//    }
}

