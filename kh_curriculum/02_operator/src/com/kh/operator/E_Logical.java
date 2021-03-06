package com.kh.operator;

import java.util.Scanner;

public class E_Logical {

	public void method1() {
		// 입력한 정수 값이 1~100 사이의 숫자인지 확인
		Scanner sc = new Scanner(System.in);

		System.out.printf("정수 하나 입력 : ");
		int num = sc.nextInt();

		System.out.println("1부터 100 사이인지 확인: " + (num >= 1 && num <= 100));

	}

	public void method2() {
		// 입력한 문자 값이 대문자인지 확인

		Scanner sc = new Scanner(System.in);

		System.out.print("문자 하나 입력 : ");
		char ch = sc.next().charAt(0);
		// ch>=65&&ch<=90
		System.out.println("엉어 대문자인지 확인 : " + (ch >= 'A' && ch <= 'Z'));

		// || : 여러값을 제시하고 그 중에 하나라도 맞는게 있는지 물어볼때 사용

		System.out.print("계속 하시려면 y 혹은 Y 를 입력하세요 : ");
		char ch2 = sc.next().charAt(0);

		System.out.println("영문자 y 인지 또는 Y 인지를 확인 : " + (ch2 == 'y' || ch2 == 'Y'));

	}

	public void method3() {
		int num = 10;
		boolean result1 = false && ++num > 0; // AND 조건 앞에 값이 false라 뒤에는 실행 x
		System.out.println("result1 을 확인 : " + result1 + " " + num);

		boolean result2 = true || ++num > 0; // OR 조건 앞에 값이 true면 뒤에는 실행 x
		System.out.println("result2 을 확인 : " + result2 + " " + num);
	}
}
