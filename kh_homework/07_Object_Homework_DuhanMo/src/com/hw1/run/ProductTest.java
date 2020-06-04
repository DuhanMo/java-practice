package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProductTest {

    public static void main(String[] args) {
        //public Product(String productId, String productName, String productArea, int price, double tax)
        Product pr1 = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
        Product pr2 = new Product("lgxnote5", "lg스마트폰5", "경기도 평택", 780000, 0.7);
        Product pr3 = new Product("ktsnote3", "kt스마트폰3", "서울시 강남", 250000, 0.3);
        System.out.println(pr1.information());
        System.out.println(pr2.information());
        System.out.println(pr3.information());
        System.out.println("==============================================");

        pr1.setPrice(1200000);
        pr1.setTax(0.05);
        pr2.setPrice(1200000);
        pr2.setTax(0.05);
        pr3.setPrice(1200000);
        pr3.setTax(0.05);
        System.out.println(pr1.information());
        System.out.println(pr2.information());
        System.out.println(pr3.information());
        System.out.println("==============================================");

        System.out.println("상품명 = " + pr1.getProductName());
        System.out.println("부가세 포함 가격 = " + (int)(pr1.getPrice() * pr1.getTax() + pr1.getPrice()) + "원");
        System.out.println("상품명 = " + pr2.getProductName());
        System.out.println("부가세 포함 가격 = " + (int)(pr2.getPrice() * pr2.getTax() + pr2.getPrice()) + "원");
        System.out.println("상품명 = " + pr1.getProductName());
        System.out.println("부가세 포함 가격 = " + (int)(pr3.getPrice() * pr3.getTax() + pr3.getPrice()) + "원");

        System.out.println("부가세 포함 가격 = " + pr1.getPrice() + (pr1.getPrice()*pr1.getTax()));


    }
}
