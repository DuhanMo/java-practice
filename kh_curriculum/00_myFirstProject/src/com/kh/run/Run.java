package com.kh.run;

import com.kh.first.*;

//실행을 위한 클래스
public class Run {

	// 실행에 필요한 main 메소드
	public static void main(String[] args) {
//		A_MethodPrinter ap = new A_MethodPrinter();
//		ap.methodA();
//		ap.methodB();

		B_ValuePrinter bv = new B_ValuePrinter();
//		bv.printValue1();
		bv.printValue2(0);
		

	}
}
