package com.kh.variable;

import java.util.Scanner;

public class B_KeyboardInput {

	// java.util package provide
	public void inputScanner1() {
		Scanner sc = new Scanner(System.in);

		// 사용자의 정보를 입력받고 그 값을 출력해보자
		System.out.print("당신의 이름은 무엇입니까 : ");
		String name = sc.nextLine();

		System.out.printf("당신의 나이는 몇살입니까 : ");
		int age = sc.nextInt();

		System.out.print("당신의 키는 몇입니까(소수점 첫째 자리까지 입력하세요.)");
		double height = sc.nextDouble();
 
		System.out.println(name + "님은 " + age + "세 이며, " + height + "cm 입니다.");

		// sc.close(); //알아서 꺼준다.
	}

	public void inputScanner2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("이름: ");
		String name = sc.nextLine();
		
		System.out.print("성별(M/F): ");
		char gender = sc.next().charAt(0);
		
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		sc.nextLine(); //밑에 nextLine이 다 가져올 것를 얘가 미리 처리해줌
		
		

		System.out.print("주소: ");
		String addrress = sc.nextLine();

		System.out.println(name + "님의 성별은 "+gender+"이고 " 
		+ age + "세이며 주소는 " + addrress + "입니다.");
		/*
		 * 
		 * 
		 * sc.nextLine()메소드를 제외한 다른 메소드들은
		 * 엔터까지 읽어오지 않고 해당 값만 읽어온 채 사용자가 입력한 '엔터'는 버퍼에 남아있게된다.
		 * 
		 * 
		 * 하지만 sc.nextLine()메소드는 사용자가 입력한 한 줄에 대한 정보 모두 즉, 엔터까지 모두 읽어온다.
		 * 
		 * sc.nextXXX() 메소드 뒤에 sc.nextLine() 메소드를 사용하게 된다면 
		 * 버퍼에 남아있는 '엔터'를 빼주기 위해 sc.nextLine() 메소드를 중간에 한번 더 써주자
		 * 
		 * 
		 * */
		
	}
}
