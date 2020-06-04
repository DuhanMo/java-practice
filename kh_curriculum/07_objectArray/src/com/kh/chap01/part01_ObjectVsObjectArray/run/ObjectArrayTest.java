package com.kh.chap01.part01_ObjectVsObjectArray.run;

import com.kh.chap01.part01_ObjectVsObjectArray.model.vo.Book;

import java.util.Scanner;

public class ObjectArrayTest {
    public static void main(String[] args) {
        // 1. 기본 자료형 배열
        int[] arr = new int[3]; //선언 및 할당

        // 인덱스 이용 초기화
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        System.out.println(arr);        // arr배열 주소값
        System.out.println(arr[0]);     // arr[0]에 들어있는 값 1

        // arr          자료형=> int[]     (참조자료형 == 주소값)
        // arr[index]   자료형=> int       (기본자료형 == 실제값)

        // 2. 객체 배열을 사용
        // 2_1. 선언 및 할당
//        Book[] bk = new Book[3];

        // 2_2. 초기화 --> 인덱스를 이용해서
//        bk[0] = new Book("자바의 정석", "홍길동", "나무", 10000);
//        bk[1] = new Book("C언어의 정석", "박길동", "참나무", 20000);
//        bk[2] = new Book("롤의 정석", "모길동", "상무", 30000);

        // 2_3. 선언 및 할당과 초기화를 동시에
        Book[] bk = {new Book("자바의 정석", "홍길동", "나무", 10000),
                new Book("C언어의 정석", "박길동", "참나무", 20000),
                new Book("롤의 정석", "모길동", "상무", 30000)};
        System.out.println(bk);         //Book[] 주소값
        System.out.println(bk[0]);      //Book 주소값
        System.out.println(bk[0].getPrice());   //Book이 가지고있는 price 값

        // bk               자료형 ==> Book[]  (참조자료형 == 주소값)
        // bk[0]            자료형 ==> Book    (참조자료형 == 주소값)
        // bk[0].getPrice   자료형 ==> int     (기본자료형 == 실제값)

        System.out.println("도서 갯수 : " + bk.length + "개");
        for (int i = 0; i < bk.length; i++) {
            System.out.println(bk[i].information());

        }
        // 도서 검색
        Scanner sc = new Scanner(System.in);
        System.out.print("검색할 책 제목 : ");
        String searchTitle = sc.nextLine();

        for (int i = 0; i < bk.length; i++) {
            if (bk[i].getTitle().equals(searchTitle)) {
                System.out.println(bk[i].information());
            }
        }
    }
}
