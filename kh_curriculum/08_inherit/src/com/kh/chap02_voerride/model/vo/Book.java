package com.kh.chap02_voerride.model.vo;
// 오버라이딩
// - 자식클래스가 상속받은 부모 클래스의 메소드를 재정의(재작성) 하는 것
// - 부모가 제공하는 기능을 자식이 일부 고쳐 사용하겠다는 의미로 자식 객체를 통한 실행 시 자식 메소드가 우선권을 가진다.
//

// @Override 어노테이션
// - 이 메소드가 부모의 메소드를 오버라이딩 했다는 개념으로 표시
// - 라이브러리 업데이트 되거나 부모클래스에서 메소드명이나 기타등등이 수정됐을 때 바로 오류 발생
// --> 쉽게 문제점을 찾을 수 있다.

import java.util.Objects;

// 오버라이딩 하기 위해서는 부모 클래스에 선언된 메소드 헤드
public class Book {

    //모든 클래스는 Object 클래스의 후손이다
    //API에서 Object 클래스의 메소드들을 확인

    private String title;
    private String author;
    private int price;

    public Book() {
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

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

    public String information() {
        return "{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public String toString() {
        return "{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        // 1. 객체의 주소가 같으면 실제 값들을 비교할 필요도 없이 바로 true
        if (this == o) return true;
        // 주소값 같으면 아래 내용을 실행할 필요없이 바로 true로 나가게 된다.


        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o; //다운캐스팅.
        return price == book.price &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        // 1번 방법 멤거밧들의 해쉬코드 값들을 더해서 나타내주자.
        return Objects.hash(title, author, price);
    }
}
