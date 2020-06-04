package com.kh.practice2;

import java.util.Scanner;

public class CastingPractice2 {
	public void sumAvg() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("국어: ");
		double num1 = sc.nextDouble();
		System.out.printf("영어: ");
		double num2 = sc.nextDouble();
		System.out.printf("수학: ");
		double num3 = sc.nextDouble();
		
		int sum = (int)(num1+num2+num3);
		int avg = (int)((num1+num2+num3)/3);

		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);

	}
}
