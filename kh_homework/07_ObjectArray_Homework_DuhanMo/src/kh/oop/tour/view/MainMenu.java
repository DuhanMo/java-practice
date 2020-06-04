package kh.oop.tour.view;

import kh.oop.tour.controller.TourController;

import java.util.Scanner;

public class MainMenu {
    Scanner sc = new Scanner(System.in);
    TourController tc = new TourController();

    {
        System.out.println("******KH항공사에 오신 고객님 환영합니다******");
    }

    public MainMenu() {
    }


    public void mainMenu() {
        System.out.println("현재 보유 금액 : " + tc.bringMyMoney()); // “현재 보유 금액: “TourController의 bringMyMoney() 호출
        System.out.println("현재 보유 마일리지 : " + tc.bringMyMile()); //   “현재 보유 마일리지: “TourController의 bringMyMile() 호출
        System.out.println("번호     목적지       가격       마일리지");
        System.out.println(" 1      미국행     300000      3000");
        System.out.println(" 2      중국행     200000      2000");
        System.out.print("목적지 선택(번호입력) : ");
        int num = sc.nextInt();
        int change = 0;
        int mile = 0;
        switch (num) {

            case 1:
                change = tc.bringMyMoney() - tc.bringFare();
                mile = tc.bringMyMile() + tc.bringMile();
                break;
            case 2:
                change = tc.bringMyMoney() - tc.bringFare1();
                mile = tc.bringMyMile() + tc.bringMile1();
                break;
            default:
                System.out.println("번호를 잘못입력하셨습니다. ");
                break;
        }
        tc.setMyMoney(change);
        tc.setMyMile(mile);

        System.out.println("타케팅 후 잔액은 :" +tc.bringMyMoney());
        System.out.println("타케팅 후 마일리지는 :" + tc.bringMyMile());


//        번호 목적지 가격 마일리지
//        1 미국행 300000 3000
//        2 중국행 200000 2000 목적지 선택(번호입력) :
    }

}
