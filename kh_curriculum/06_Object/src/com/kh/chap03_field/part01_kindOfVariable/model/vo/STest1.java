package com.kh.chap03_field.part01_kindOfVariable.model.vo;

public class STest1 {
    // 백화점 : 한정판 가방 판매점
    public static int i = 30;

    public void method1(int j){

        System.out.println(">>>>상품을 " + j + "개 구매합니다.");
        i -= j;
    }
    public void method2(){
        System.out.println(">>>>현재 " + i + "개 남았습니다.");
    }
}
