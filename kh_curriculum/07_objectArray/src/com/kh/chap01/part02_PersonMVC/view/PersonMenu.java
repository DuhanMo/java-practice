package com.kh.chap01.part02_PersonMVC.view;

import com.kh.chap01.part02_PersonMVC.controller.PersonController;

import java.util.Scanner;

public class PersonMenu {
    public void mainMenu() {
        Scanner sc = new Scanner(System.in);
        PersonController pc = new PersonController();

        while (true) {
            System.out.println("======== 메뉴 ========");
            System.out.println("1. 회원 추가");
            System.out.println("2. 회원 전체 조회");
            System.out.println("3. 회원 재산 조회");
            System.out.println("4. 회원 이름으로 검색");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    pc.insertPerson();
                    break;
                case 2:
                    pc.printPerson();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("다시 입력해 주세요.");
                    break;
            }
        }
    }
}
