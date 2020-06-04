package com.kh.chap01.part01_ObjectVsObjectArray.run;

import com.kh.chap01.part01_ObjectVsObjectArray.model.vo.Book;

import java.util.Scanner;

public class ObjectTest {
    public static void main(String[] args) {
        Book bk1 = new Book("자바의 정석", "홀길동", "나무", 10000);
        Book bk2 = new Book("C언어의 정석", "모길동", "소나무", 20000);
        Book bk3 = new Book("롤의 정석", "김길동", "상무", 30000);

        // 도서들 출력
        System.out.println(bk1.information());
        System.out.println(bk2.information());
        System.out.println(bk3.information());

        // 도서 검색
        Scanner sc = new Scanner(System.in);
        System.out.print("검색할 책 제목 : ");
        String searchTitle = sc.nextLine();

        if(bk1.getTitle().equals(searchTitle)){
            System.out.println(bk1.information());
        }else if(bk2.getTitle().equals(searchTitle)){
            System.out.println(bk2.information());
        }else if(bk3.getTitle().equals(searchTitle)){
            System.out.println(bk3.information());
        }

        }


}
