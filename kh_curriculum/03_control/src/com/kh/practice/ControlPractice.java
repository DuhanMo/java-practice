package com.kh.practice;

import java.util.Scanner;

public class ControlPractice {

	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		if (num >= 1 && num <= 10) {
			if (num % 2 == 0) {
				System.out.println("짝수입니다.");
			}
			if (num % 2 != 0) {
				System.out.println("홀수입니다.");
			}
		} else {
			System.out.println("반드시 1~10 사이의 정수를 입력하세요.");
		}
	}

	public void method2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("키 : ");
		double cm = sc.nextDouble();

		System.out.print("몸무게 : ");
		double kg = sc.nextDouble();

		double bmi = kg / ((cm / 100) * (cm / 100));

		if (bmi < 20) {
			System.out.println("저체중");
		} else if (bmi >= 20 && bmi < 25) {
			System.out.println("정상체중");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("과체중");
		} else {
			System.out.println("비만");
		}

	}

	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 값 : ");
		int first = sc.nextInt();

		System.out.print("두번째 값 : ");
		int second = sc.nextInt();

		System.out.print("연산자(+,-,*,/,%) : ");
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
		case '%':
			result = first % second;
			break;
		default:
			System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다");
			return;
		}
		System.out.println(first + " " + op + " " + second + " = " + result);

	}

	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("과일이름(사과, 바나나, 복숭아, 키위)을 입력하세요. : ");
		String fruit = sc.nextLine();

		int price = 0;
		switch (fruit) {
		case "사과":
			price = 1000;
			break;
		case "바나나":
			price = 3000;
			break;
		case "복숭아":
			price = 2000;
			break;
		case "키위":
			price = 5000;
			break;
		}
		System.out.println(fruit + "의 가격은 " + price + "입니다.");

	}

	public void method5() {

		Scanner sc = new Scanner(System.in);

		System.out.print("국어 : ");
		int kor = sc.nextInt();

		System.out.print("영어 : ");
		int eng = sc.nextInt();

		System.out.print("수학 : ");
		int math = sc.nextInt();

		double avg = (kor + eng + math) / 3.0;

		// 강사님 코드, 각 과락마다 출력해줌.
		if(kor >= 40 && eng >= 40 && math >=40) {
			if(avg >= 60) System.out.println("합격입니다.");
			else System.out.println("평균 점수 미달로 불합격입니다.");
		}else {
			if(kor < 40) {
				System.out.println("국어 점수 미달입니다.");
			}
			if(eng < 40) {
				System.out.println("영어 점수 미달입니다.");
			}
			if(math < 40) {
				System.out.println("수학 점수 미달입니다.");
			}
		}
		
		// 과락이 여러개면 과락과목을 출력하지않음. 무조건 평균수미달로 출력.-->출제의도와 다름.
//		if (avg < 60) {     
//			System.out.println("평균 점수 미달로 불합격입니다.");
//		} else if (kor < 40) {
//			System.out.println("국어과목의 점수 미달로 불합격입니다.");
//		} else if (eng < 40) {
//			System.out.println("영어과목의 점수 미달로 불합격입니다.");
//		} else if (math < 40) {
//			System.out.println("수학과목의 점수 미달로 불합격입니다.");
//		} else {
//			System.out.println("합격입니다.");
//		}
	}

	public void method6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("월 급여 입력 : ");
		int month = sc.nextInt();
		
		System.out.print("매출액 입력 : ");
		int sale = sc.nextInt();
		
		double brate = 0;
		int bonus = 0;
		
		switch(sale/10000000) { 
		case 0:
			break;
		case 1:
		case 2:
			brate = 0.01;
			break;
		case 3:
		case 4:
			brate = 0.03;
			break;
		default : 
			brate = 0.05;
			break;
		}
		bonus = (int)(sale * brate);
		System.out.println("====================");
		System.out.println("매출액 : " + sale);
		System.out.println("보너스율 : " + brate+"%");
		System.out.println("월 급여 : " + month);
		System.out.println("보너스 금액 : " + bonus);
		System.out.println("====================");
		System.out.println("총 급여 : " +(month + bonus));
		
	}
}
