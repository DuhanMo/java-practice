package com.kh.variable;

public class D_Overflow {
	public void overflow() {
//		byte bnum = 128; //error : 범위를 벗어남

		
		//min: -128, max: 127
		byte bnum = 127;
		bnum = (byte)(bnum + 7); //byte + int ->int형으로 딸려감
		
		System.out.println(bnum);
		
		int num = 290;
		byte tmp = (byte)num;
		
		System.out.println(tmp); //강제 형변환으로 인한 데이터 변형
		 

	}
}
