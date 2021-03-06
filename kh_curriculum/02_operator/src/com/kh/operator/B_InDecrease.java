package com.kh.operator;

public class B_InDecrease {

	// ++ : 1씩 증가 ++값(전위연산자), 값++(후위연산자)
	// -- : 1씩 감소 --값(전위연산자), 값--(후위연산자)

	public void method1() {
		// 전위 증감 연산자 테스트
		int num1 = 10;
		System.out.println("증감연산자 적용 전: " + num1); // 10
		System.out.println("++num1을 1회 수행 후 결과: " + ++num1); // 11(11)
		System.out.println("++num1을 2회 수행 후 결과: " + ++num1); // 12(12)
		System.out.println("++num1을 3회 수행 후 결과: " + ++num1); // 13(13)
		System.out.println("증감연산자 적용 후: " + num1); // 13

		// 후위 증감 연산자 테스트

		System.out.println("=========후위증감 연산=======");
		System.out.println("num++1을 1회 수행 후 결과: " + num1++); // 13(14)
		System.out.println("num++1을 2회 수행 후 결과: " + num1++); // 14(15)
		System.out.println("num++1을 3회 수행 후 결과: " + num1++); // 15(16)
		System.out.println("증감연산자 적용 후: " + num1); // 16

	}

	public void method2() {
		int age = 20;
		System.out.println("현재 나이는? " + age); // 20

		System.out.println("++age는? " + ++age); // 21

		System.out.println("age++는? " + age++); // 21(22)

		System.out.println("--age는? " + --age); // 21(21)

		System.out.println("age--는? " + age--); // 21(20)

		System.out.println("현재 나이는? " + age); // 20
	}

	public void method3() {
		int num1 = 20;

		int result = num1++ * 3;

		System.out.println("result : " + result); // 60
		System.out.println("num1 : " + num1); // 21

		int result2 = ++num1 * 3;

		System.out.println("result2 : " + result2); // 66
		System.out.println("num1 : " + num1); // 22
	}

	public void method4() {
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.println(a++); // 10(11)

		System.out.println((++a) + (b++)); // 12(12) + 20(21) = 32

		System.out.println((a++) + (--b) + (--c)); // 12(13) + 20(20) + 29(29) = 61

		System.out.println("a = " + a); // 13
		System.out.println("b = " + b); // 20
		System.out.println("c = " + c); // 29
	}
}
