package com.kh.example.chap03.branch;

public class B_continue {
	// continue문 : 반복문 내에서만 사용할 수 있다.
	// if(조건식) continue;
	// continue문 아래의 내용을 실행하지말고
	// 증감식 또는 다음값으로 건너뛰라는 의미

	public void method1() {
		// 1~100까지 정수들의 합계
		// 단, 4의 배수는 빼고 계산
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 4 == 0)
				continue;
			sum += i;
		}
		System.out.println(sum);
	}

	public void method2() {
		// 짝수단, 짝수 수는 뺀 구구단 출력
		
		for (int dan = 2; dan < 10; dan++) {
			
			System.out.println("========="+dan+"========");
			for (int su = 1; su < 10; su++) {
				if (dan % 2 == 0 || su % 2 == 0) continue;
				
				System.out.println(dan + " * " + su + " = " + (dan*su));
			}
			System.out.println();
		}
	}
}
