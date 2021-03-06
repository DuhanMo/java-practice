package com.kh.practice;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();

		String result = (num > 0) ? "양수다." : "양수가 아니다.";
		System.out.println(result);

	}

	public void practice2() {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();

		String result = (num > 0) ? "양수다." : (num == 0) ? "0이다." : "음수다.";
		System.out.println(result);
	}

	public void practice3() {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();

		String result = (num / 2 == 0) ? "짝수다." : "홀수다.";
		System.out.println(result);
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);

		System.out.print("인원 수 : ");
		int i = sc.nextInt();
		System.out.print("사탕 수 : ");
		int k = sc.nextInt();

		System.out.println("1인당 사탕 개수 : " + (k / i));
		System.out.println("남은 사탕 개수 : " + (k % i));

	}

	public void practice5() {

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
		String gender = (ch == 'M') ? "남학생" : "여학생";

		System.out.print("성적(소수점 아래 둘째자리까지) :");
		double grade = sc.nextDouble();

		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다", level, cla, num, name, gender, grade);

	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("나이 : ");
		int age = sc.nextInt();

		String str = (age <= 13) ? "어린이" : (age <= 19) ? "청소년" : "성인";
		System.out.println(str);

	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		System.out.print("국어 : ");
		int kor = sc.nextInt();

		System.out.print("영어 : ");
		int eng = sc.nextInt();

		System.out.print("수학 : ");
		int math = sc.nextInt();

		int sum = kor + eng + math;
		double avg = sum / 3;

		String result = (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) ? "합격" : "불합격";
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println(result);

	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);

		System.out.print("주민번호를 입력하세요 : ");
		String str = sc.nextLine();

//		String gender = (str.charAt(7) == '1') ? "남자" : (str.charAt(7) == '3') ? "남자" : "여자";
		String gender = (str.charAt(7) == '1' || str.charAt(7) == '3')? "남자" : "여자"; //강사님코드, 깔끔

		System.out.println(gender);

	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력 : ");
		int num3 = sc.nextInt();

//		boolean result = (num3 <= num1 || num3 > num2) ? true : false;
//		System.out.println(result);
		
		System.out.println((num3 <= num1) || num3 > num2); // 강사님코드, 깔끔
	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);

		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();

//		boolean result = (num1 == num2) && (num2 == num3);
//		System.out.println(result);
		
		System.out.println((num1 == num2) && (num2 == num3));
	}
}
