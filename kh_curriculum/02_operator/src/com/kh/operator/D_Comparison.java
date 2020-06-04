package com.kh.operator;

public class D_Comparison {

	// @ 관계 연산자(비교연산자)
	// -> 두 개의 변수의 관계를 따지는 연산자
	// -> 관계연산자(비교연산자)는 조건을 만족하면 true, 만족하지 않으면 false를 반환
	/*
	 * 
	 * a < b a가 b	보다 작은가?
	 * a > b a가 b 보다 큰가?
	 * a == b a와 b가 같은가?
	 * a != b a와 b가 다른가?
	 * a <= b  a가 b보다 작거나 같은가? 이하 
	 * a >= b a가 b보다 큰가? 이상
	 * 
	 * 
	 * */
	
	public void method() {
		int a = 10;
		int b = 25;
		boolean result1;
		boolean result2;
		boolean result3;
		
		result1 = (a == b); //false
		result2 = (a <= b); //true
		result3 = (a > b); //false
		
		System.out.println("b가 짝수인가? "+ (b%2 == 0));
		System.out.println("a가 홀수인가? "+ (a%2 != 0));
		
		
	}
}
