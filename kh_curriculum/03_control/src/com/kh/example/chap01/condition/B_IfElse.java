package com.kh.example.chap01.condition;

import java.util.Scanner;

public class B_IfElse {

	// 둘(true/false) 중 한개를 선택하는 조건문
	public void method1() {
		// 키보드로 입력한 숫자가 짝수인지 홀수인지 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("입력하신 숫자는 짝수입니다.");
		} else {
			System.out.println("입력하신 숫자는 홀수입니다.");
		}
	}

	public void method2() {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("입력하신 숫자는 양수입니다.");
		}

		if (num < 0) {
			System.out.println("입력하신 숫자는 음수입니다.");
		}

		if (num == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}

	}

	public void method3() {

		Scanner sc = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("학년(숫자만) : ");
		int level = sc.nextInt();

		System.out.print("반(숫자만) : ");
		int cla = sc.nextInt();

		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();

		sc.hasNextLine();

		System.out.print("성별(M/F) : ");
		char ch = sc.next().charAt(0);

		System.out.print("성적(소수점 아래 둘째자리까지) :");
		double grade = sc.nextDouble();

		String gender = null;
		if (ch == 'M' || ch == 'm') {
			gender = "남학생";
		} else {
			gender = "여학생";
		}
		// M,m,F,f 둘 다 아닐때.
		if (ch != 'M' && ch != 'm' && ch != 'F' && ch != 'f') {
//			gender = "성별 오류";
			System.out.println("성별을 잘못입력하셨습니다.");
		}
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 " + grade + "이다", level, cla, num, name, gender);

	}

	public void method4() {
		Scanner sc = new Scanner(System.in);

		System.out.print("나이 : ");
		int age = sc.nextInt();

		String str = null;
		if (age <= 13) {
			str = "어린이";
		}else {
			str = "청소년";
		}
		if (age > 19) {
			str = "성인";
		}

		System.out.println(str);
	}

}
