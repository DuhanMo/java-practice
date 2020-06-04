package com.kh.operator;

import java.util.Scanner;

public class F_Triple {

	// 항목이 3개임 : (조건식)? 참일 때 사용할 값 : 거짓일 때 사용할 값
	// 조건식은 반드시 결과가 true / false 로 나오게 작성
	// 중첩도 가능하다.

	public void method1() {
		// 사용자가 입력한 정수값이 양수인지를 판단해보자

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();

		String result = (num > 0) ? "양수다." : (num == 0) ? "0이다." : "음수다.";
		System.out.println("입력된 수는 " + result);
	}

}
