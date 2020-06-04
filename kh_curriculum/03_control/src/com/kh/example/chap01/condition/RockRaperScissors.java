package com.kh.example.chap01.condition;

import java.util.Scanner;

public class RockRaperScissors {
	// 컴퓨터와 가위바위보 하는 게임
	// 사용자 이름 받자

	// 게임시작
	// 1. 컴퓨터가 생성하는 가위바위보 구하자
	// 2. 사용자가 입력하는 코드를 생성
	// 3. 컴퓨터와 사용자가 입력된 코드를 비교
	// 3-1 비겼을때
	// 3-2 가위,바위,보 냈을때 사용자가 입력한 값과 비교해서 승부를 처리
	// 3-3 게임에 나가고 싶을 때, 잘못입력했을 때

	// 0<x<1
	// o<x<10 0~9 0,1,2

	public void method1() {

		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.nextLine();

		int count = 0; // 총 몇번 게임했는지
		int win = 0;
		int draw = 0;

		while (true) {

			int comInt = (int) (Math.random() * 3);
			String comStr = null;
			switch (comInt) {
			case 0:
				comStr = "가위";
				break;
			case 1:
				comStr = "바위";
				break;
			case 2:
				comStr = "보";
				break;
			}

			System.out.print("가위, 바위, 보 중 하나를 입력해주세요 : ");
			String userStr = sc.nextLine();

			String result = null;
			String winStr = "이겼습니다.";
			String loseStr = "졌습니다.";

			if (userStr.equals("가위") || userStr.equals("바위") || userStr.contentEquals("보")) {
				if (userStr.equals(comStr)) {
					result = "비겼습니다.";
					draw++;
				} else {
					if (comStr.equals("가위")) {
						// switch
						switch (userStr) {
						case "바위":
							result = winStr;
							win++;
							break;
						case "보":
							result = loseStr;
							break;
						}

					} else if (comStr.equals("바위")) {
						// if~else
						if (userStr.equals("보")) {
							result = winStr;
							win++;
						} else {
							result = loseStr;
						}

					} else {
						// 삼항 연산자
						result = (userStr.equals("가위")) ? winStr : loseStr;
						if (userStr.equals("가위"))
							win++;

					}
				}
				
			} else if (!userStr.contentEquals("exit")) {

				System.out.println("잘못입력하셨습니다.");
				continue ;

			} else {
				break;
			}
			
			count++;
			System.out.println("컴퓨터 : " + comStr);
			System.out.println(name + " : " + userStr);
			System.out.println(result);
			System.out.println();

		}
		// 총전적 출력
		System.out.println("총 진행 횟수 : " + count);
		System.out.println("이긴 횟수 : " + win);
		System.out.println("비긴 횟수 : " + draw);
		System.out.println("진 횟수 : " + (count - win - draw));
		System.out.println(name + "님의 승률은 " + ((double) win / count * 100) + "% 입니다.");

	}
}
