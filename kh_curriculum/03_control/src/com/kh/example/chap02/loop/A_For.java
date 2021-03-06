package com.kh.example.chap02.loop;

import java.util.Scanner;

public class A_For {

//1부터 5까지 출력 
	public void method1() {
		for (int i = 1; i < 6; i++) {
			System.out.println(i + "번째 반복문");
		}
	}

	public void method2() {
		for (int i = 5; i >= 1; i--) {
			System.out.println(i + "번째 반복문");
		}
	}

	public void method3() {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}

	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1부터 9사이의 정수 : ");
		int num = sc.nextInt();
		if (num > 0 && num < 10) {
			for (int i = 1; i < 10; i++) {
				System.out.println(num + " * " + i + " = " + (num * i));
			}
		// 1부터 10사이의 임의의 난수를 정해
		// 1부터 난수까지의 정수 합계

//		System.out.println((int)(Math.random()*10 +1));
		// 1단계 0.0 <=Math.random() < 1.0
		// 2단계 0.0 <=Math.random() * 10 < 10.0 ---------->0~9.999999999999
		// 3단계 1.0<= Math.random()*10 + 1) <11 ---------->1~10.99999999999
		// 4단계 (int)형변환 -반내림 1~10

		int random = (int) (Math.random() * 10 + 1);
		int sum = 0;
		for (int i = 1; i <= random; i++) {
			sum += i;
		}
		System.out.printf("1부터 %d 까지의 정수 합계 : %d", random, sum);

	

		} else {
			System.out.println("1~9사이의 양수를 입력하여야 합니다.");
		}

	}

	public void method5() {}

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
		for (int i = min; i <= max; i++) {
			sum += i;
		}
		System.out.printf("%d부터 %d까지 합 : %d", min, max, sum);

//		if (num1 > num2) {
//			for (int i = num2; i < num1; i++) {
//				sum += i;
//			}
//			System.out.printf("%d부터 %d까지의 합은 %d", num2, num1, sum);
//
//		} else if (num2 < num1) {
//			for (int j = num1; j < num2; j++) {
//				sum += j;
//			}
//			System.out.printf("%d부터 %d까지의 합은 %d", num1, num2, sum);
//		} else {
//			System.out.printf("%d부터 %d까지의 합은 2*%d = %d", num1, num2, num1, num1 + num2);
//		}

	}

	public void method7() {
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}
	}

	public void method8() {
		// 한줄에 별표문자(*) 입력된 줄수와 칸수 출력
		// 단 줄수와 칸수가 일치하는 위치에는 줄 번호에 대한 정수가 출력
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("행의 수 : ");
		int row = sc.nextInt();
		System.out.print("열의 수 : ");
		int col = sc.nextInt();
		for (int i = 1; i < row+1; i++) {
			for (int j = 1; j < col+1; j++) {
				if(i == j) {
					System.out.print(i);
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
//		System.out.print("2차원 배열 행,열 입력 : ");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int[][] arr = new int[a][b];
//		for(int i = 0; i < a; i++) {
//			for(int j = 0; j < b; j++) {
//				System.out.printf("arr[%d][%d]\n",i,j);
//			}
//		}
	}

}
