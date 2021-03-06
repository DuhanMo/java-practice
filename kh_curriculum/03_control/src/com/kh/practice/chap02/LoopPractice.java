package com.kh.practice.chap02;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		int i;
		for (i = 1; i < num + 1; i++) {
			sum += i;
			System.out.print(i);
			if (i == num) {
				System.out.print(" = " + sum);
			} else {
				System.out.print(" + ");
			}
		}
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i < num + 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = num; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);

		System.out.print("시작 숫자 : ");
		int num = sc.nextInt();
		System.out.print("공차 : ");
		int d = sc.nextInt();

		for (int i = 0; i < 10; i++) {
			System.out.printf("%d ", num);
			num += d;
		}
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		//강사님 플래그값 이용
//		boolean flag = false;
//		
//		if(num >=2) {
//			for(int i =2; i<num; i++) {
//				if(num % i ==0) {
//					flag = true;
//					break;
//				}
//			}
//			
//			if(flag) {
//				System.out.println("소수가 아닙니다.");
//			}else {
//				System.out.println("소수입니다");
//			}
//		}else{
//			System.out.println("잘못입력하셨습니다");
//		}

		if (num > 1) {
			for (int i = 2; i < num + 1; i++) {
				if (num % i != 0)
					continue;
				else {
					if (num != i) {
						System.out.println("소수가 아닙니다.");
						break;
					} else
						System.out.println("소수입니다.");
				}
			}
		} else
			System.out.println("잘못 입력하셨습니다.");
	}
	
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		for(int i = 1; i < n+1; i++) {//총 줄수 
			for(int j = 0; j < n - i; j++) { //공백 찍기
				System.out.print(" ");
			}
			for(int k = 0; k < 2*i - 1; k++) { //*찍기
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
