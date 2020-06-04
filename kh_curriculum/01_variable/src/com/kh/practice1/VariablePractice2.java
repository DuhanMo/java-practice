package com.kh.practice1;

import java.util.*;

public class VariablePractice2 {
	public void operation() {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("첫 번째 정수: ");
		int num1 = sc.nextInt();
		System.out.printf("두 번째 정수: ");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과: "+(num1+num2));
		System.out.println("빼기 결과: "+(num1-num2));
		System.out.println("곱하기 결과: "+(num1*num2));
		System.out.println("나누기 몫 결과: "+(num1/num2));

		
	}
}
