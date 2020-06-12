package com.kh.test.fruit.controller;

import com.kh.test.fruit.model.vo.Fruit;

import java.util.ArrayList;
import java.util.Arrays;

public class FruitTest {
    public static void main(String[] args) {
        ArrayList<Fruit> list = new ArrayList<Fruit>();
        list.add(new Fruit("사과", " 달콤"));
        list.add(new Fruit("오렌지", " 상콤"));
        list.add(new Fruit("키위", " 상콤"));
        System.out.println("값 삽입 : " + list);


        list.remove(1);
        System.out.println("값 삭제 : " + list);

        for (int i = 0; i <list.size() ; i++) {

        }
//        list.remove(list(i).);
        System.out.println("값 삭제2 : " + list);

    }
}
