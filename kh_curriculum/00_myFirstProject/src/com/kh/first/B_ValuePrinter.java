package com.kh.first;

public class B_ValuePrinter {
	int num;

	// print values of various forms
	public void printValue1() {

		// print number
		System.out.println(123); // integer
		System.out.println(1.23); // real number

		// print character
		System.out.println('A');

		// print string
		System.out.println("AAA");

		// operation directly
		System.out.println(123 + 456);

		// character and number
		System.out.println('a' + 1);

		// string and number ->a1
		System.out.println("a");

		// string + string + number
		System.out.println("안녕" + "하세요" + 123);
	}

	public void printValue2(int num) {
		this.num = num;
		// '+' operation of string and number
		System.out.println(9 + 9); // 18
		System.out.println(9 + "9"); // 99
		System.out.println("9" + 9); // 99
		System.out.println("9" + "9"); // 99
		System.out.println(9 + 9 + "9"); // 189
		System.out.println(9 + "9" + 9); // 9+"9" = 문자열 "99" + 9 = 문자열 "999"
		System.out.println("9" + 9 + 9); // 999
		System.out.println("9" + (9 + 9));// 918
		System.out.println(this.num);
	}
}
