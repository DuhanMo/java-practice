package com.kh.chap03_field.part01_kindOfVariable.model.vo;

public class STest2 {
    // 해외직구
    public void method3(int num){
        System.out.println(">>>>해외에서 상품을 " + num + "개 구매합니다. ");

        STest1.i -= num;
    }

}


