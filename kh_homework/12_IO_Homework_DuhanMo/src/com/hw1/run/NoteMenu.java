package com.hw1.run;

import com.hw1.controller.FileController;

import java.util.Scanner;

public class NoteMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileController fc = new FileController();

        while (true) {
            System.out.println("1. 노트 새로 만들기");
            System.out.println("2. 노트 열기");
            System.out.println("3. 노트 열어서 수정하기");
            System.out.println("4. 끝내기");
            System.out.print("번호를 입력하세요 : ");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    fc.fileSave();
                    break;
                case 2:
                    fc.fileOpen();
                    break;
                case 3:
                    fc.fileEdit();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다.");
                    break;

            }
        }
    }
}
