package com.kh.example.chap01.condition;

import java.util.Scanner;

public class D_Switch {

	public void method1() {
		// 정수 두개와 연산기호문자 1개를 입력받아서
		// 연산기호문자에 해당하는 계산을 수행하고 출력하세요

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 값 : ");
		int first = sc.nextInt();

		System.out.print("두번째 값 : ");
		int second = sc.nextInt();

		System.out.print("연산자(+,-,*,/) : ");
		char op = sc.next().charAt(0);

		int result = 0;

		switch (op) {
		case '+':
			result = first + second;
			break;

		case '-':
			result = first - second;
			break;

		case '*':
			result = first * second;
			break;

		case '/':
			result = first / second;
			break;

//			try {
//			result = first / second;
//			break;}
//			catch(Exception e){
//				System.out.println(e);
//				
//			}
		}

		System.out.println(first + " " + op + " " + second + " = " + result);

	}

	public void method2() {
		// 1~12월까지 입력받아 해당하는 달의 마지막 날짜를 출력하시오
		Scanner sc = new Scanner(System.in);
		System.out.printf("1월부터 12월까지 중 하나를 입력하세요 : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("입력하신 월은 31일 까지 입니다.");
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("입력하신 월은 30일 까지 입니다.");
			break;

		case 2:
			System.out.println("입력하신 월은 28일 혹은 29일 까지 입니다.");
			break;

		default:
			System.out.println("반드시 1~12월 중에 입력해야 합니다.");
			return;
		}

	}
}
