package com.kh.emxample.dimension;

public class DimensionalArray {
    public void method1() {

        // 다차원(2차원)배열의 선언
        //          자료형[][] 배열명;
        //          자료형[] 배열명[];
        //          자료형 배열명[][];

        // 2차원 배열 선언
        int[][] iarr1;
        int[] iarr2[];
        int iarr3[][]; // 선언을 하게되면 stack에 레퍼런스 변수 생성

        // 2차원 배열 할당
        // heap 영역에 2차원 배열 할당
        // 배열의 레퍼런스를 보관하는 배열은 반드시 크기를 지정해줘야한다.
        iarr1 = new int[3][5];

        for (int i = 0; i < iarr1.length; i++) {
            for (int j = 0; j < iarr1[i].length; j++) {
                System.out.print(iarr1[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void method2() {
        int arr[] = new int[2]; //선언 및 할당
        arr[0] = 1; //값 초기화
        arr[1] = 2;

        // 값 기록
        // 1. 배열 인덱스에 접근하여 값 기록
        // 정변 배열
        int[][] iarr = new int[2][2];

        iarr[0][0] = 1;
        iarr[0][1] = 2;

        iarr[1][0] = 3;
        iarr[1][1] = 4;

        // 2. 이중for문을 이요하여 값 기록
        int value = 1;
        for (int i = 0; i < iarr.length; i++) {
            for (int j = 0; j < iarr[i].length; j++) {
                iarr[i][j] = value++;
            }
        }
        for (int i = 0; i < iarr.length; i++) {
            for (int j = 0; j < iarr[i].length; j++) {
                System.out.printf("%-2d ", iarr[i][j]);
            }
            System.out.println();
        }

    }

    public void method3() {
        // 가변배열
        // 행은 정해져있으나 각 행에 대한 열이 정해지지 않은 상태
        // 자료형이 같은 1차원 배열 여러개를 하나로 묶은 것이 2차원 배열이기 때문에
        // 묶여있는 1차원 배열의 길이가 꼭 같을 필요는 없다.


        // 가변배열할당
        int[][] iarr = new int[3][];
        //에러 발생 for문
//        for (int i = 0; i < iarr.length; i++) {
//            for (int j = 0; j < iarr[i].length; j++) {
//                System.out.printf("%-2d", iarr[i][j]);
//            }
//            System.out.println();
//        }
        iarr[0] = new int[2];
        iarr[1] = new int[1];
        iarr[2] = new int[3];
        for (int i = 0; i < iarr.length; i++) {
            for (int j = 0; j < iarr[i].length; j++) {
                System.out.printf("%-2d", iarr[i][j]);
            }
            System.out.println();
        }


        // 값 기록
        // 1. 인덱스로 접근하여 값 기록
        iarr[0][0] = 1;
        iarr[0][1] = 2;

        iarr[1][0] = 3;

        iarr[2][0] = 4;
        iarr[2][1] = 5;
        iarr[2][2] = 6;

        // 2. 이중for문을 사용하여 값 기록
        System.out.println("==================");
        int value = 0;
        for (int i = 0; i < iarr.length; i++) {
            for (int j = 0; j < iarr[i].length; j++) {
                iarr[i][j] = ++value;
            }
        }
        for (int i = 0; i < iarr.length; i++) {
            for (int j = 0; j < iarr[i].length; j++) {
                System.out.printf("%-2d", iarr[i][j]);
            }
            System.out.println();
        }
    }

    public void method4() {
        // 다차원 배열도 할당과 초기화 동시에 가능
        // 1. 정변배열
        // int arr[] = new int[]{값, 값, 값, ...} -> 1차원 배열
        // int arr[] = {값, 값, 값, ...} -> 1차원 배열

        int[][] iarr1 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        for (int i = 0; i < iarr1.length; i++) {
            for (int j = 0; j < iarr1[i].length; j++) {
                System.out.printf("%-5d", iarr1[i][j]);
            }
            System.out.println();
        }
        System.out.println("==================================================");
        // 2. 가변 배열
        int[][] iarr2 = {{1, 2, 3}, {4, 5, 6, 7, 8, 9}, {10, 11, 12, 13}};
        for (int i = 0; i < iarr2.length; i++) {
            for (int j = 0; j < iarr2[i].length; j++) {
                System.out.printf("%-5d", iarr2[i][j]);
            }
            System.out.println();
        }
    }

}
