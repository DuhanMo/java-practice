package com.kh.example.chap02.loop;

import java.util.Scanner;

public class B_While {

	public void method1() {
		int i = 1;
		while (true) {

			System.out.println(i);
			i++;
			if (i == 6)
				break;
		}
	}

	public void method2() {
		int i = 5;
		while (i > 0) {
			System.out.println(i);
			i--;
		}
	}

	public void method3() {
		int i = 1;
		while (i < 10) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
			i++;
		}
	}

	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1부터 9사이의 정수 : ");
		int num = sc.nextInt();
		int i = 1;

		while (i < 10) {
			System.out.printf("%d * %d = %d\n", num, i, num * i);
			i++;
		}

	}

	public void method5() {
		// 1부터 10사이의 임의의 난수를 정해
		// 1부터 난수까지의 정수 합계

//		System.out.println((int)(Math.random()*10 +1));
		// 1단계 0.0 <=Math.random() < 1.0
		// 2단계 0.0 <=Math.random() * 10 < 10.0 ---------->0~9.999999999999
		// 3단계 1.0<= Math.random()*10 + 1) <11 ---------->1~10.99999999999
		// 4단계 (int)형변환 -반내림 1~10

		int random = (int) (Math.random() * 10 + 1);
		int sum = 0;
		int i = 1;
		while (i <= random) {
			sum += i;
			i++;
		}
//		for (int i = 1; i <= random; i++) {
//			sum += i;
//		}
		System.out.printf("1부터 %d 까지의 정수 합계 : %d", random, sum);

	}

	public void method6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();

		System.out.print("정수2 : ");
		int num2 = sc.nextInt();

		int sum = 0;

		int min = 0;
		int max = 0;

		if (num1 > num2) {
			max = num1;
			min = num2;

		} else {
			max = num2;
			min = num1;
		}

		int i = min;
		while (i <= max) {
			sum += i;
			i++;
		}
//		for (int i = min; i <= max; i++) {
//			sum += i;
//		}
		System.out.printf("%d부터 %d까지 합 : %d", min, max, sum);

	}

	public void method7() {

		int i = 2;
		int j = 1;
		while (i < 10) {
			while (j < 10) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
				j++;
			}
			i++;
		}

//		for (int i = 2; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.printf("%d * %d = %d\n", i, j, i * j);
//			}
//		}
	}

	public void method8() {
		// 한줄에 별표문자(*) 입력된 줄수와 칸수 출력
		// 단 줄수와 칸수가 일치하는 위치에는 줄 번호에 대한 정수가 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("행의 수 : ");
		int row = sc.nextInt();
		System.out.print("열의 수 : ");
		int col = sc.nextInt();
		int i = 1;
		while (i < row + 1) {
			int j = 1;
			while (j < col + 1) {
				if (i == j) {
					System.out.print(i); 
				} else {
					System.out.print("*");
				}
				j++;
			}
			System.out.println();
			i++;
		}
		


	}

//		for (int i = 1; i < row+1; i++) {
//			for (int j = 1; j < col+1; j++) {
//				if(i == j) {
//					System.out.print(i);
//				}else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
	
	public void method9(){
		
		Scanner sc = new Scanner(System.in);
		int menuNum = 0;
		while(menuNum != 9) {
			System.out.println("\n\n1. 1~5까지 출력");
			System.out.println("2. 5~1까지 출력");
			System.out.println("3. 1~10까지 홀수 출력");
			System.out.println("9. 종료");
			System.out.print("메뉴 선택");
			menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1: method1(); break;
			case 2: method2(); break;
			case 3: method3(); break;
			case 9: System.out.println("종료합니다."); break; //return.
			default : System.out.println("잘못입력하셨습니다"); 
			
			}
//			if(menuNum == 9) {
//				break;
//			}
			System.out.println("확인용");
		}
	}
}
