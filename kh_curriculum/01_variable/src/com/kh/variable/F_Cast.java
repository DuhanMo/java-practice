package com.kh.variable;

public class F_Cast {

	/*
	 * 
	 * 형변환을 할때는 원래 앞에 바꿀 자료형을 명시해주어야 한다. (바꿀자료형)값 또는 변수 앞에 붙은 (바꿀 자료형)을 cast 연산자 혹은
	 * 형변환 연산자 라고함.
	 * 
	 * 형변환에는 두 가지 종류가 있다. 1. 자동형변환, 묵시적 형변환 2. 강제형변환, 명시적 형변환
	 * 
	 */
	public void rule1() {
		boolean flag = true;
		// flag = 100; boolean자료형은 무조건 true,false만 들어갈 수 있다. (형변환예외)

		int num = 'A'; // -> 출력값 65 유니코드가 인트형으로 형변환됨.
		System.out.println("num: " + num);

		/* 
		 * 유니코드로 저장되는 char 이기 때문에 char는 정수값도 저장가능
		 * 
		 */
		char ch = 97;
		System.out.println("ch: " + ch);

		char ch2 = (char) num;
		System.out.println("ch2: " + ch2);

	}

	public void rule2() {
		// 다른 자료형끼리의 연산은 큰 자료형으로 자동 형변환 후 연산처리된다.

		int inum = 10;
		long lnum = 100l;

//		int isum = inum + lnum;

		// 연산은 큰 자료형으로 자동 형변환 후 연산처리가 되기 때문에 long이 된 상태
		// 방법 1. 수행결과를 int로 강제 형변환

		int isum = (int) (inum + lnum);
		System.out.println("isum: " + isum);

		// 방법 2. long형 값을 int로 강제 형변환 한다.
		int isum2 = inum + (int) lnum;
		System.out.println("isum2: " + isum2);

		// 방법3. long형 자료형으로 받는다.
		long lsum = inum + lnum;
		System.out.println("lsum: " + lsum);
		
		byte bnum = 1;
		short snum = 2;
		
		short sum = (short)(bnum + snum); //byte+short ->int
		System.out.println("sum: " + sum);
		
		//정수는 실수로 자동 형변환이 된다.
		long lnum2 = 100; //->정수 
		float fnum = lnum;
		
		System.out.println("fnum: "+fnum);
		
		//실수는 정수로 변경할 때는 강제 형변환을 해줘야한다.
		double dnum = 10.9;
		int inum3 = (int)dnum;
		System.out.println("inum3: "+inum3);
	}

	
	public void dataLoss() {
		//데이터 손실 테스트
		int inum = 290;
		System.out.println("inum: "+ inum);
		
		byte bnum = (byte)inum;
		System.out.println("bnum: "+ bnum);
	}
}
