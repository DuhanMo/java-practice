package com.kh.operator;

public class C_Arithmetic {

	// 계산할 때 쓰이는 연산자
	public void method1() {
		int num1 = 10;
		int num2 = 3;

		System.out.println("num1 + nume2 = " + (num1 + num2)); // 13
		System.out.println("num1 - nume2 = " + (num1 - num2)); // 7
		System.out.println("num1 * nume2 = " + (num1 * num2)); // 30
		// 나누었을 때 몫을 구하는 연산자
		System.out.println("num1 / nume2 = " + (num1 / num2)); // 3
		// 나누었을 때 나머지를 구하는 연산자
		System.out.println("num1 % nume2 = " + (num1 % num2)); // 1

		// 값 % 배수 == 0
		// 짝수니 ? 값 % 2 == 0 or 값 % 2 != 1
		// 홀수니 ? 값 % 2 == 1 or 값 % 2 != 0

	}

	public void method2() {
		double a = 35;
		double b = 10;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		double add = a + b;
		System.out.println("a + b = " + add);

		double sub = a - b;
		System.out.println("a - b = " + sub);

		double mul = a * b;
		System.out.println("a * b = " + mul);

		double div = a / b;
		System.out.println("a / b = " + div);

		double mod = a % b;
		System.out.println("a % b = " + mod);

		// 우선 순위 역시 일반 수학과 동일하게 적용

		int c = 27;
		System.out.println("c = " + c);
		double result = a + a * b % c - a / b; //
		// 1. 35.0 * 10.0 = 350.0
		// 2. 350.0 % 27 = 26.0
		// 3. 35.0 / 10.0 = 3.5
		// 4. 35+26.0-3.5 = 27.5

		System.out.println("result = " + result);

	}

	public void method3() {
		int a = 5; //6 (7)
		int b = 10; //9
		int c = (++a) + b; //16->15
		int d = c / a; // 16/6 = 2(1)
		int e = c % a; // 16%6 = 4(5)->6
		int f = e++; //  4
		int g = (--b) + (d--); // 9 + 2 = 11(10)
		int h = 2;
		int i = a++ + b / (--c / f) * (g-- - d) % (++e + h);
		/*
		 * 1. 15/4=3
		 * 2. 11-1 = 10
		 * 3. 6+2 = 8
		 * 4. 6 + 9/3 * 10 % 8
		 * 5. 6 + 30 % 8 = 6 + 6 =12
		 * 
		 */

		System.out.println("a : " + a); // 7
		System.out.println("b : " + b); // 9
		System.out.println("c : " + c); // 15
		System.out.println("d : " + d); // 1
		System.out.println("e : " + e); // 6
		System.out.println("f : " + f); // 4
		System.out.println("g : " + g); // 10
		System.out.println("h : " + h); // 2
		System.out.println("i : " + i); // 12

	}
}
