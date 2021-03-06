package com.kh.variable;

public class G_Printf {
	
	// printf 포맷
	// Sytem.out.printf("포맷",값(혹은변수)...); 의 형태로 사용한다.
	// 정해져 있는 형식에 맞춰서 그 형식에 맞는 값(변수)를 줄바꿈 하지 않고 출력함
	
	//포맷문자
	//%d : 정수형
	//%f : 실수(소수점 아래 6자리)
	//%e : 지수표현식
	//%c : 문자
	//%s : 문자열
	//%b : 논리형
	//%5d :  5칸을 확보하고 오른쪽 정렬
	//%-5d :  5칸을 확보하고 왼쪽 정렬
	//%.2f :  소수점 아래 2자리까지만 표시
	
	//특수문자(escape 문자)
	//tab		: \t  	정해진공간만큼 띄어쓰기
	//new line	: \n 	출력하하고 다음라인으로 옮
	//역슬래쉬		: \\	특수문자(\)사용
	//작은 따옴표	: \'	특수문자(')사용
	//큰 따옴표	: \"	특수문자(")사용
	
	
	
	public void printMethid() {
		System.out.println('a'); // 문자 a 출력
		System.out.printf("%c\n",'a'); // 문자 a 출력
		
		String name = "홍길동";
		int age = 20;
		String address = "주소";
		
		System.out.printf("%s님은 %d세 이며 주소는 %s 입니다\n",name,age,address);
		System.out.printf("%3s님은 %5d세 이며 주소는 %s입니다\n",name,age,address);
		System.out.printf("표시할 수 있는 글자: %20s%f %10.2f \n","@",10.95,10.974);
		
	}

}
