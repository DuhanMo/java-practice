package com.kh.generics;

import java.util.*;
import java.util.Map.Entry;
public class TestGenerics1 {
    public static void main(String[] args) {
        //맵에 제네릭 적용하기
        HashMap<String, Book> hmap = new HashMap<>();

        inputMap(hmap);
        outputMap(hmap);
    }
    public static void inputMap (HashMap<String, Book> hmap){

        hmap.put("1", new Book("갈매기의 꿈"));
        hmap.put("2", new Book("나의라임오렌지나무"));
        hmap.put("3",new Book("헬렌켈러 위인전"));
        hmap.put("4",new Book("자바에서 살아남기"));

        System.out.println("총 " + hmap.size() + "권의 책이 저장되었습니다.");

    }
    public static void outputMap(HashMap<String, Book> hmap){
        // 매개벼수로 hashMap을 받아
        // 목록화하여 키와 값을 한개씩 꺼내는 메소드

        // 1. KeySet() 메소드를 사용하는 방법

        // 2. values() 메소드를 사용하는 방법

        // 3. entrySet() 메소드를 사용하는 방법
        Set<Entry<String, Book>> entrySet = hmap.entrySet();

        Iterator<Entry<String, Book>> eIter = entrySet.iterator();

        while(eIter.hasNext()){
            Map.Entry<String, Book> entry = eIter.next();
            String key = entry.getKey();
            Book value = entry.getValue();

            System.out.println(key + " : " + value);
        }
    }
}
