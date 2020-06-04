package com.hw1.model.vo;

public class CookBook extends Book {
    private boolean coupon;
    public CookBook(){}

    public CookBook(String title, String author, String publisher, boolean coupon) {
        super(title, author, publisher);
        this.coupon = coupon;
    }

    @Override
    public String toString() {
        return super.toString() + "CookBook{" +
                "요리학원 쿠폰 유무 = " + coupon +
                '}';
    }





    // getter&setter
    public boolean isCoupon() {
        return coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }
}
