package com.hw3.controller;

import com.hw3.model.vo.Product;
import sun.nio.ch.sctp.SctpNet;

import java.util.Scanner;

public class ProductController {
    private Product[] proArray = new Product[10];
    public static int count;

    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        do {
            System.out.println("===== 제품 관리 메뉴 =====");
            System.out.println("1. 제품 정보 추가");
            System.out.println("2. 제품 전체 조회");
            System.out.println("3. 제품 전체 삭제");
            System.out.println("4. 제품 수정");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴를 입력해주세요 : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    productInput();
                    break;
                case 2:
                    productPrint();
                    break;
                case 3:
                    proArray = null;
                    break;
                case 4:
                    productModify();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다. ");
                    return;
                default:
                    System.out.println("잘못입력하셨습니다.");
                    break;

            }

        } while (true);

    }

    public void productInput() {
        //public Product(int pId, String pName, int price, double tax)
        for (int i = 0; i < proArray.length; i++) {
            System.out.println("===== 제품 정보 추가 메뉴 =====");
            System.out.print("제품 번호 : ");
            int pId = sc.nextInt();
            sc.nextLine();
            System.out.print("제품명 : ");
            String pName = sc.nextLine();
            System.out.print("제품 가격 : ");
            int price = sc.nextInt();
            System.out.print("제품 세금 : ");
            double tax = sc.nextDouble();
            proArray[count] = new Product(pId, pName, price, tax);

            System.out.print("제품 추가를 계속하시려면 y 또는 Y를 눌러주세요. ");
            char ch = sc.next().charAt(0);
            if (!(ch == 'y' || ch == 'Y')) return;


        }


    }
    public void productPrint() {

        for (int i = 0; i < count; i++) {
            System.out.println(i + 1 + "번째 제품 " + proArray[i].information());
        }

    }

    public void productModify() {
        while (true) {
            System.out.println("===== 제품 정보 수정 메뉴 =====");
            System.out.print("제품 번호를 입력해주세요. : ");
            int pId = sc.nextInt();
            sc.nextLine();
            for (int j = 0; j < count; j++) {
                if (proArray[j].getpId() == pId) {
                    System.out.print("수정할 제품명 : ");
                    String pName = sc.nextLine();
                    proArray[j].setpName(pName);
                    System.out.print("수정할 제품 가격 : ");
                    int price = sc.nextInt();
                    proArray[j].setPrice(price);
                    System.out.print("수정할 제품 세금 : ");
                    double tax = sc.nextDouble();
                    proArray[j].setTax(tax);
                } else {
                    System.out.println("제품 번호를 잘못 입력하셨습니다.");
                    break;
                }

            }
            System.out.print("계속 수정하시려면 y 또는 Y를 눌러주세요. ");
            char ch = sc.next().charAt(0);
            if (!(ch == 'y' || ch == 'Y')) return;

        }
    }



}
