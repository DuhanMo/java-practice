package com.kh.variable;

public class C_Constant {

	public void finalConstant() {
		int age; // variable
		final int AGE; // constant 상수명은 보통 대문자로

		age = 20;
		AGE = 20;

		System.out.println("age: " + age);
		System.out.println("AGE: " + AGE);
		
		age = 30;
//		AGE = 30;
		
		System.out.println("=============");
		
		System.out.println("변경 후 age: "+ age);
		System.out.println("변경 후 AGE: "+ AGE);
		 
	}

}
