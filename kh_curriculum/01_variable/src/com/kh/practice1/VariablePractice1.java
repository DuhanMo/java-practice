package com.kh.practice1;

import java.util.*;

public class VariablePractice1 {
	public void printinfo() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별을 입력하세요(남/여): ");
		char ch = sc.next().charAt(0);
		
		System.out.print("키를 입력하세요(cm): ");
		double height = sc.nextDouble();

		System.out.println("키 "+height+"cm인 "+age+"살 "+ch+"자 "+name+"님 반갑습니다^^");
	}
}
