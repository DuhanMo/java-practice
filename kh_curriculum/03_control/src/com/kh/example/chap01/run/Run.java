package com.kh.example.chap01.run;

import com.kh.example.chap01.condition.*;

public class Run {

	public static void main(String[] args) {
		A_if a = new A_if();
//		a.method1();
//		a.method2();
//		a.method3();
//		a.method4();

		B_IfElse b = new B_IfElse();
//		b.method1();
		
		C_IfElseIf c = new C_IfElseIf();
//		c.method1();
//		c.method2();
		
		D_Switch d = new D_Switch();
//		d.method1();
//		d.method2();
		
		RockRaperScissors rrs = new RockRaperScissors();
		rrs.method1();
		
	}
}
