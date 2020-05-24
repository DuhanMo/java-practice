package com.kh.practice;

import java.util.Scanner;

public class DimentionalArray {
    public void method1() {
        //3행 3열짜리 문자열 배열을 선언 및 할당하고
        //인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은 형식으로 저장 후 출력하세요.
        //=== 실행 결과 ===
        // (0, 0)(0, 1)(0, 2)
        // (1, 0)(1, 1)(1, 2)
        // (2, 0)(2, 1)(2, 2)
        String[][] array = new String[3][3];
        array[0][0] = "(0, 0)";
        array[0][1] = "(0, 1)";
        array[0][2] = "(0, 2)";
        array[1][0] = "(1, 0)";
        array[1][1] = "(1, 1)";
        array[1][2] = "(1, 2)";
        array[2][0] = "(2, 0)";
        array[2][1] = "(2, 1)";
        array[2][2] = "(2, 2)";

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    public void method2() {
        //4행 4열짜리 정수형 배열을 선언 및 할당하고
        //1) 1 ~ 16까지 값을 차례대로 저장하세요.
        //2) 저장된 값들을 차례대로 출력하세요.
        //=== 실행 결과 ===
        //1 2 3 4
        //5 6 7 8
        //9 10 11 12
        //13 14 15 16

        int[][] iarr = new int[4][4];
        int sum = 1;
        for (int i = 0; i < iarr.length; i++) {
            for (int j = 0; j < iarr[i].length; j++) {
                iarr[i][j] = sum++;
                System.out.printf("%5d", iarr[i][j]);
            }
            System.out.println();
        }
    }

    public void method3() {
        //4행 4열짜리 정수형 배열을 선언 및 할당하고
        //1) 16 ~ 1과 같이 값을 거꾸로 저장하세요.
        //2) 저장된 값들을 차례대로 출력하세요.
        //=== 실행 결과 ===
        //16 15 14 13
        //12 11 10 9
        //8 7 6 5
        //4 3 2 1
        int[][] iarr = new int[4][4];
        int sum = 16;
        for (int i = 0; i < iarr.length; i++) {
            for (int j = 0; j < iarr[i].length; j++) {
                iarr[i][j] = sum--;
                System.out.printf("%5d", iarr[i][j]);
            }
            System.out.println();
        }
    }

    public void method4() {
        //String[][] strArr = new String[][] {{"여", "수", "습", "진", "되"}, {"러", "고", "니", "개", "시"}, {"분",
        //"많", "다", "발", "기"}, {"정", "이", "! ", "자", "를"}, {"말", "했", "멋", "가", "♥ "}};
        //위의 초기화되어 있는 배열을 가지고 아래의 ‘[그림] 실습문제4 흐름’과 같은 방식으로 출력하세요.
        //단, print()를 사용하고 값 사이에 띄어쓰기(“ “)가 존재하도록 출력하세요.

        String[][] strArr = new String[][]{{"여", "수", "습", "진", "되"}, {"러", "고", "니", "개", "시"}, {"분",
                "많", "다", "발", "기"}, {"정", "이", "! ", "자", "를"}, {"말", "했", "멋", "가", "♥ "}};

        for (int j = 0; j < strArr.length; j++) {
            for (int i = 0; i < strArr[j].length; i++) {
                System.out.print(strArr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void method5() {
        //사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 열의 크기도 받아
        //문자형 가변 배열을 선언 및 할당하세요.
        //그리고 각 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.
        //=== 실행 결과 예시 ===
        //행의 크기 : 4
        //0열의 크기 : 2
        //1열의 크기 : 6
        //2열의 크기 : 3
        //3열의 크기 : 5
        //a b
        //c d e f g h
        //i j k
        //l m n o p
        Scanner sc = new Scanner(System.in);

        System.out.print("행의 크기 : ");
        char[][] arr = new char[sc.nextInt()][];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + "열의 크기 : ");
            arr[i] = new char[sc.nextInt()];
        }
        char ch = 'a';
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = ch++;
                System.out.printf("%-3c", arr[i][j]);
            }
            System.out.println();
        }


    }

    //강사님 코드
    public void method6_v1() {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[5][5]; // char형 5행 5열 2차원 배열 생성

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }

        char rowLine = 48;
        char colLine = 48;

        for (int i = 0; i < board.length; i++) {
            board[0][i] = rowLine;
            board[i][0] = colLine;

            rowLine++;
            colLine++;
        }

        System.out.print("행 인덱스 입력 : ");
        int row = sc.nextInt();

        System.out.print("열 인덱스 입력 : ");
        int column = sc.nextInt();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i == row && j == column) { // 사용자가 입력한 행과 열의 인덱스 값이 같을 때
                    board[i][j] = 'X';
                }
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 내 코드
    public void method6_v2() {
        char[][] cArr = new char[5][5];

        for (int i = 0; i < cArr.length; i++) {
            for (int j = 0; j < cArr[i].length; j++) {
                cArr[i][j] = ' ';
            }
        }
        char ch1 = '0';
        char ch2 = '0';
        for (int i = 0; i < 5; i++) {
            cArr[0][i] = ch1++;
            cArr[i][0] = ch2++;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("행 인덱스 입력 : ");
        int row = sc.nextInt();
        System.out.print("열 인덱스 입력 : ");
        int col = sc.nextInt();

        cArr[row][col] = 'X';

        for (int i = 0; i < cArr.length; i++) {
            for (int j = 0; j < cArr[i].length; j++) {
                System.out.print(cArr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public void method7() {
        //실습문제6과 내용을 do~while을 통해 반복을 하고 행 입력 시 99가 입력되면 종료되도록 구현하세
        //요.
        //=== 실행 결과 예시 ===
        //행 인덱스 입력 >> 2
        //열 인덱스 입력 >> 2
        //0 1 2 3 4
        //0
        //1
        //2 X
        //3
        //4
        //행 인덱스 입력 >> 3
        //열 인덱스 입력 >> 1
        //0 1 2 3 4
        //0
        //1
        //2 X
        //3 X
        //4
        //행 인덱스 입력 >> 99
        //프로그램 종료

        char[][] cArr = new char[5][5];

        for (int i = 0; i < cArr.length; i++) {
            for (int j = 0; j < cArr[i].length; j++) {
                cArr[i][j] = ' ';
            }
        }
        char ch1 = '0';
        char ch2 = '0';
        for (int i = 0; i < 5; i++) {
            cArr[0][i] = ch1++;
            cArr[i][0] = ch2++;
        }
        Scanner sc = new Scanner(System.in);
        int row = 0;
        int col = 0;
        do {
            System.out.print("행 인덱스 입력 : ");
            row = sc.nextInt();

            if (row != 99) {
                System.out.print("열 인덱스 입력 : ");
                col = sc.nextInt();


                for (int i = 0; i < cArr.length; i++) {
                    for (int j = 0; j < cArr[i].length; j++) {
                        if (i == row && j == col) cArr[i][j] = 'X';
                        System.out.print(cArr[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        } while (row != 99);
        System.out.println("프로그램을 종료합니다.");
    }
}

