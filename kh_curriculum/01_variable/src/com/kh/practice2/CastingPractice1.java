package com.kh.practice2;

import java.util.Scanner;

public class CastingPractice1 {
	public void casting() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("문자: ");
		char ch = sc.next().charAt(0);
		
		int uni = (int)ch;
		System.out.println(ch +" unicode: "+ uni);
		
	}
}
