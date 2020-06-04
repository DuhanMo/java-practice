package com.hw1.model.vo;

public class AniBook extends Book {

    private int accessAge;
    public AniBook(){};

    public AniBook(String title, String author, String publisher, int accessAge) {
        super(title, author, publisher);
        this.accessAge = accessAge;
    }

    @Override
    public String toString() {
        return super.toString() + "AniBook{" +
                "제한나이 = " + accessAge +
                '}';
    }



    // getter&setter
    public int getAccessAge() {
        return accessAge;
    }

    public void setAccessAge(int accessAge) {
        this.accessAge = accessAge;
    }
}
