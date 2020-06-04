package com.kh.variable;

public class A_Variable {
//	int left, right;
//	public A_Variable(int left, int right) {
//		this.left = left;
//		this.right = right;
//	}
//	public void sum() {
//		System.out.println(this.left + this.right);
//	}
 
	
	public void declareVariable() {
		// 1.논리형

		boolean isTrue;

		// 2. 숫자형
		// 2-1. 정수형
		byte bNum; // 1byte
		short sNum; // 2byte
		int iNum; // 4byte
		long lNum; // 8byte
		// 2-2. 실수형
		float fNum; // 4byte
		double dNum; // 8byte

		// 3. 문자형
		char ch;
		// 4. 문자열(참조형)

		String str;

		/********************************/
		/* Enter values into variables */
		/********************************/

		isTrue = true;

		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L; // l or L 표시해야함
					// 생략읋 해도 자동형변환으로 들어감.
		fNum = 4.0f;
		dNum = 8.0;
		ch = 'a';
		str = "ASFGBVCXqer";

		System.out.println("isTrue의 값: " + isTrue);

		System.out.println("bNum의 값: " + bNum);
		System.out.println("sNum의 값: " + sNum);
		System.out.println("iNum의 값: " + iNum);
		System.out.println("lNum의 값: " + lNum);

		System.out.println("fNum의 값: " + fNum);
		System.out.println("dNUm의 값: " + dNum);

		System.out.println("ch의 값: " + ch);
		System.out.println("str의 값: " + str);

	}

	public void initVariable() {

		// 1.논리형
		boolean isTrue = false;

		// 2. 숫자형
		// 2-1. 정수형
		byte bNum = 1; // 1byte
		short sNum = 2; // 2byte
		int iNum = 4; // 4byte
		long lNum = 8; // 8byte
		// 2-2. 실수형
		float fNum = 4.0f; // 4byte
		double dNum = 8.0f; // 8byte

		// 3. 문자형
		char ch = 97;
		// 4. 문자열(참조형)

		String str ="H pmClass";
		
		
		System.out.println("isTrue의 값: " + isTrue);

		System.out.println("bNum의 값: " + bNum);
		System.out.println("sNum의 값: " + sNum);
		System.out.println("iNum의 값: " + iNum);
		System.out.println("lNum의 값: " + lNum);

		System.out.println("fNum의 값: " + fNum);
		System.out.println("dNUm의 값: " + dNum);

		System.out.println("ch의 값: " + ch);
		System.out.println("str의 값: " + str);
	}

	public void localVariable() {
		int a = 100; //자기 자신의 메소드 안에서는 전역변수
		{
			System.out.println(a); //-->100
			int b = 200;
			System.out.println(b); //-->200
			a = 300;
		}
		System.out.println("=========\n" + a); //--> 300
//		System.out.println(b); //에러생김 'b'가 지역변수로 끝났기때문
		
	}
	
	
	
}
