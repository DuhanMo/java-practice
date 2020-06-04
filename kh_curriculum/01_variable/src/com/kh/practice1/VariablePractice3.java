package com.kh.practice1;

import java.util.*;

public class VariablePractice3 {
	public void square() {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("가로: ");
		double num1 = sc.nextDouble();
		System.out.printf("세로: ");
		double num2 = sc.nextDouble();
		
		System.out.println("면적: "+(num1*num2));
		System.out.println("둘레: "+(num1+num2)*2);

		
	}
}
