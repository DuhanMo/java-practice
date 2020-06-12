package com.kh.generics;

import java.util.ArrayList;

public class TestGenerics {
    public static void main(String[] args) {
        // 제네릭스란, 여러가지 자료형을 받을 수 있는 컬렉션에
        // 저장할 자료형을 한 가지로 제한함으로써 객체를 꺼내어 사용할 때
        // 객체에 대한 형변환을 생략하게 하는 기술이다.

        // 사용방법
        // 컬렉션클래스 변수명<제한할 자료형명>

        // 기본 리스트
        ArrayList list = new ArrayList();
        list.add(new Book());
        list.add(new Car());

        // 책만 받기위한 리스트
        ArrayList <Book> list1 = new ArrayList<>();
        list1.add(new Book());
//        list1.add(new Car());

        //Book만 받도록 한정지은 컬렉션 객체
        for(Book bk : list1){
            System.out.println(bk);
        }

        // 기존의 일반 컬렉션 객체
        for (Object obj : list
             ) {
            if(obj instanceof Book){
                Book bk = (Book)obj;
                System.out.println(bk);
            }
        }
    }
}
