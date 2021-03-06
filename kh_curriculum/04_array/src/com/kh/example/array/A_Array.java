package com.kh.example.array;

import java.util.Scanner;

public class A_Array {
	
	public void method1() {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		
		int sum1 = 0;
		sum1 += num1;
		sum1 += num2;
		sum1 += num3;
		sum1 += num4;
		sum1 += num5;
		
		int arr[] = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 10 * (i+1);
		}
		int sum2 = 0;
		for(int i = 0; i < arr.length; i++) {
			sum2 += arr[i];
		}
		System.out.println("sum1 : " + sum1);
		System.out.println("sum2 : " + sum2);
	}

	public void method2() {
		int[] iArr;
		char cArr[];
		// 참조 자료형 변수
		iArr = new int[5];
		cArr = new char[10];
		System.out.println("iArr: " + iArr.hashCode());
		System.out.println("cArr: " + cArr);
		
		//배열을 따로 초기화하지 않더라도 해당 배열 자료형의 기본값으로 초기화가 된다
		// 기본적으로 배열을 선언하고 할당하면 jvm이 지정한 값으로 배열이 초기화된다
		//why? heap영역은 값이 없는공간이 존재할 수 없기 때문에
		//
		for(int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		for(int i = 0; i < cArr.length; i++) {
			System.out.println(cArr[i]);
		}
		//배열의 길이를 알 수 있는 기능을 필드(멤버변수)로 제공
		//String의 문자열의 길이는 메소드로 제공 .length() 로.
		System.out.println("iArr의 길이 : " + iArr.length);
		System.out.println("cArr의 길이 : " + cArr.length);
		
		//Scanner를 통해 입력받은 정수로 배열 길이를 지정하여 배열 할당 가능
		Scanner sc = new Scanner(System.in);

		System.out.print("새로 할당할 배열의 길이를 입력하세요. : ");
		int size = sc.nextInt();

		double[] dArr = new double[size];

		System.out.println("dArr의 hashcode : " +  dArr.hashCode());
		System.out.println("dArr의 길이 : " + dArr.length);


		dArr = new double[30];

		System.out.println("수정 후 dArr의 hashcode : " +  dArr.hashCode());
		System.out.println("수정 후 dArr의 길이 : " + dArr.length);

		dArr = null;

		System.out.println("삭제 후 dArr의 길이 : " + dArr.length);

		
	}
	public void method3(){
		int[] iArr = new int[] {11,22,33,44,55};
		System.out.println("iArr의 길이 : "+ iArr.length);
		//문자열도 배열로 가능
		String[] sArr = {"apple", "banana", "grape", "orange"};
		System.out.println("sArr의 길이: " + sArr.length);
	}
	public void method4(){
		int arr[] = new int[] {10,20,30,40,50};
		arr[3] = 40000;

		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}

	}
	public void method5(){
		String str = "The String class represents character strings.";



		char[] arr_ch = str.toCharArray();
		arr_ch[17] = 'R';

		for(int i = 0; i<arr_ch.length; i++){
			System.out.printf("%c\n", arr_ch[i]);
		}
		System.out.println("arr_ch의 갯수 : "+arr_ch.length);
		System.out.println("10번째 문자 : "+arr_ch[9]);

		int LCNT = 0;
		int UCNT = 0;

		for(int i = 0; i<arr_ch.length; i++){
			if(Character.isLowerCase(arr_ch[i])){
				LCNT++;
			}else if(Character.isUpperCase(arr_ch[i])){
				UCNT++;
			}
		}System.out.println("대문자의 개수 : " + UCNT + " 소문자의 개수 : " + LCNT);
	}
	
}

























