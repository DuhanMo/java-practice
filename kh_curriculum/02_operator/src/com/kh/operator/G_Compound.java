package com.kh.operator;

public class G_Compound {

	//산술대입연산자 : +=, -=, *=, /=, %=
	
	public void method() {
		int num = 12;
		System.out.println("num : " + num);
		
		//num 변수를 3증가
		num = num + 3; //15
		num += 3; //18
		
		num -= 5; //13 
		
		num *= 6;// 78
		
		num /= 2; //39
		
		num %= 3; //0
		
		System.out.println("num : " + num);
	}
	
}
