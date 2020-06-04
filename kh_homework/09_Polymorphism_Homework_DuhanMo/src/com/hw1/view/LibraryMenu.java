package com.hw1.view;

import com.hw1.controller.LibraryManager;
import com.hw1.model.vo.Book;
import com.hw1.model.vo.Member;

import java.util.Scanner;

public class LibraryMenu {
    private LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("나이 : ");
        int age = sc.nextInt();
        System.out.print("성별 : ");
        char gender = sc.next().charAt(0);

        Member mem = new Member(name, age, gender);
        lm.insertMember(mem);

        while (true) {
            System.out.println("====== 메뉴 =====");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("0. 프로그램 종료하기");
            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println(lm.myInfo());
                    break;
                case 2:
                    selectAll();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    rentBook();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다. ");
                    return;
                default:
                    System.out.println("잘못된 번호입니다.");
                    return;
            }


        }
    }

    public void selectAll() {
        Book[] bList = lm.selectAll();
        for (int i = 0; i < bList.length; i++) {
            System.out.println(i + "번 도서 : " + bList[i]);
        }
    }

    public void searchBook() {
        System.out.print("검색할 제목 키워드 : ");
        String keyword = sc.next();
        Book[] searchList = lm.searchBook(keyword);
        for (Book value : searchList) {
            System.out.println(value);
        }
    }

    public void rentBook() {
        selectAll();
        System.out.print("대여할 도서 번호 선택 : ");
        int index = sc.nextInt();
        int result = lm.rentBook(index);
        switch (result) {
            case 0:
                System.out.println("성공적으로 대여되었습니다.");
                break;
            case 1:
                System.out.println("나이 제한으로 대여 불가능입니다.");
                break;
            case 2:
                System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.\n" +
                        "마이페이지를 통해 확인하세요.");
                break;
        }
    }


    // getter&setter
    public LibraryManager getLm() {
        return lm;
    }

    public void setLm(LibraryManager lm) {
        this.lm = lm;
    }
}
