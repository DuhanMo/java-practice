package com.kh.example.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {

	public void method1() {
		Scanner sc = new Scanner(System.in);
		String str = null;

		do {
			System.out.print("문자열 입력 : ");
			str = sc.next();
			System.out.println("str : " + str);
		} while (!str.equals("exit") && !str.equals("EXIT")  );

	}

	public void method2() {
		Scanner sc = new Scanner(System.in);
		String str = null;

		do {
			System.out.print("문자열 입력 : ");
			str = sc.next();
			System.out.println("str : " + str);
			if (str.contentEquals("exit")) {
				break;
			}
		} while (true);
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. test1 ");
			System.out.println("2. test2 ");
			System.out.println("3. test3 ");
			System.out.println("9. 종료 ");
			System.out.print("메뉴 선택 : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1: System.out.println(1); break;
			case 2: System.out.println(2); break;
			case 3: System.out.println(3); break;
			case 9: System.out.println("종료합니다."); return;
			default : System.out.println("잘못입력하셨습니다.");
			
			}
			if(menuNum == 9) {
				break;
			}
		}while(true);
	}

}
