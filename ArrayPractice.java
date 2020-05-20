package com.kh.practice;

import java.io.*;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public void method1() {
        //길이가 10인 배열선언 후 1부터 10까지의 값을 반복문을 이용하여 순서대로 배열 인덱스에 넣은 후 그 값을 출력
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.printf("%d ", arr[i]);
        }

    }

    public void method2() {
        //길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후 배열 인덱스를 활용해서 귤을 출력하세요.
        String[] sArr = {"사과", "귤", "포도", "복숭아", "참외"};
        System.out.println(sArr[1]);
    }

    public void method3() {
        //문자열을 하나 입력 받아 배열에 넣고 문자 하나를 입력 받아 입력한 문자가 문자열에 몇 개 들어가 있는지 개수를 출력하세요.

        Scanner sc = new Scanner(System.in);
        System.out.print("입력 값 : ");
        String str = sc.nextLine();
        //toCharArray string값을 문자로 배열에 저장해줌.
        char[] arr_ch = str.toCharArray();

        System.out.print("검색 값 : ");
        char ch = sc.next().charAt(0);

        int count = 0;
        for (int i = 0; i < arr_ch.length; i++) {
            if (arr_ch[i] == ch) count++;
        }
        System.out.printf("입력하신 문자열 “%s”에서 찾으시는 문자 ‘%c’은 %d개입니다.", str, ch, count);


    }

    public void method4() {
        //주민등록번호 성별자리 이후부터 *로 가리고 출력하세요. 단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요
        Scanner sc = new Scanner(System.in);
        //(-)포함, 미포함 동일하게 암호화됨.
        System.out.print("주민등록번호 입력 : ");

        String str = sc.nextLine();
        // 문자열을 문자형배열에 저장
        char[] arr_ch = str.toCharArray();
        // 새로운 문자형배열 copy 생성.
        char[] copy = new char[arr_ch.length];
        // arr_ch를 copy에 복사
        System.arraycopy(arr_ch, 0, copy, 0, arr_ch.length);

        System.out.print("출력된 주민등록번호 : ");
        for (int i = 0; i < copy.length; i++) {
            if (copy.length - i < 7) System.out.print("*");
            else System.out.print(copy[i]);
        }
    }

    public void method5() {
        //홀수인 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
        // 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
        Scanner sc = new Scanner(System.in);
        System.out.print("홀수 입력 : ");
        int odd = sc.nextInt();
        int[] arr = new int[odd];
        int sum = 0;
        if (odd % 2 != 0) {
            for (int i = 0; i < arr.length; i++) {

                if (i <= odd / 2) sum++;
                else sum--;

                arr[i] = sum;
                System.out.print(arr[i] + " ");
            }


        } else {
            System.out.println("홀수를 입력해주세요.");
        }
    }

    public void method6() {
        //로또 번호 자동 생성기 프로그램을 작성하세요.
        //단, 중복 값 없이 오름차순으로 정렬하여 출력하세요.
        //Random 클래스 사용 혹은 Math.random() 메소드를 사용하시면 편합니다.
        int[] lotto = new int[7];

        for (int i = 0; i < lotto.length; i++) {
            int num = (int) (Math.random() * 45 + 1);
            lotto[i] = num;

            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
        }

//        int temp = 0;
//        for (int i = lotto.length - 1; i > -1; i--) {
//            for (int j = 0; j < i; j++) {
//                if (lotto[j] > lotto[j + 1]) {
//                    temp = lotto[j];
//                    lotto[j] = lotto[j + 1];
//                    lotto[j + 1] = temp;
//                }
//            }
//        }
        Arrays.sort(lotto);
//        System.out.println(Arrays.toString(lotto));
        for (int i = 0; i < lotto.length; i++) {
            if (i < 6) System.out.print(lotto[i] + " ");
            else System.out.print("bonus : " + lotto[i]);
        }
    }
}


