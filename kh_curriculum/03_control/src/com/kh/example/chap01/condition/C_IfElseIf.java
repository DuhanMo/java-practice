package com.kh.example.chap01.condition;

import java.util.Scanner;

public class C_IfElseIf {

	public void method1() {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("입력하신 숫자는 양수입니다.");
		} else if (num == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		} else {
			System.out.println("입력하신 숫자는 음수입니다.");
		}
	}

	public void method2() {

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

		String str = level + "학년 " + cla + "반 " + num + "번 " + name + " ";

		if (ch == 'M' || ch == 'm') {
			str += "남학생의 성적은 " + grade + "이다.";
		} else if (ch == 'F' || ch == 'f') {
			str += "여학생의 성적은 " + grade + "이다.";
		} else {
//			gender = "성별 오류";
			str = "성별을 잘못입력하셨습니다";
		}
		System.out.println(str);

	}
}
