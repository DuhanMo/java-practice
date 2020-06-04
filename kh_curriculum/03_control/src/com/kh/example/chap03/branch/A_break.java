package com.kh.example.chap03.branch;

import java.util.Scanner;

public class A_break {
	
	//break문 가장 가까운 반복문을 나간다.
	
	public void method1() {
		//문자열을 입력받아 글자 갯수 출력하는 반복 프로그램 
		//단, "end"가 입력되면 반복을 종료한다.
		//do~while문 사용
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("문자열 입력 : ");
			String str = sc.next();
			
			if(str.equals("end")) {
				break; //do while 탈출 
			}
			
			System.out.println("글자 갯수 : " + str.length());
		}while(true);
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		
//		for(int i = 0; ; i++ ) {
//			sum +=i;
//
//			if(i == num) break;
//			
//		}
		
		int i = 0;
		while (true) {
			sum += i;
			i++;
			
			if(i > num) {
				break;
			}
		}
		System.out.println("1부터" + num + "까지의 합은 " + sum + "입니다");
	} 
}
