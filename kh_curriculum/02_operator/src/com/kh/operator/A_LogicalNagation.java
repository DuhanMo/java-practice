package com.kh.operator;

import java.util.Scanner;

public class A_LogicalNagation {

	// 논리부정 연산자 : !
	// 논리값을 반대로 바꾸는 연산
	public void method1() {
		System.out.println("true의 부정: " + !true);
		System.out.println("false의 부정: " + !false);
	}

	public void method2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 하나 입력: ");
		int num = sc.nextInt();

		System.out.println("입력한 정수가 양수인가? " + (num > 0));
		System.out.println("입력한 정수가 양수인가? " + !(num < 0));

	}
}
