package com.kh;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("게임시작");



        do {
            System.out.println("한개 입");

            String input = sc.nextLine();

            System.out.println("당신은" + input);

            int random = (int) (Math.random() * 3);
            String computer = "";

            switch (random) {
                case 0:
                    computer = "가위";
                    break;

                case 1:
                    computer = "바위";
                    break;
                case 2:
                    computer = "보";
                    break;
            }
            System.out.println("컴퓨터는 " + computer);
            if (computer.equals(input)) {
                System.out.println("비김, 다시시작");
            } else {

                boolean win = false;
                if (computer.equals("가위")) {
                    if (input.equals("바위")) {
                        win = true;
                    }
                } else if (computer.equals("바위")) {
                    if (input.equals("보")) {
                        win = true;
                    }
                } else {
                    if (input.equals("가위")) {
                        win = true;
                    }
                }

                if(win) {
                    System.out.println("당신이 이겼습니다 ");
                    break;
                }else{
                    System.out.println("당신이 졌습니다 !!");
                    break;
                }

            }
        } while (true);
    }

}
