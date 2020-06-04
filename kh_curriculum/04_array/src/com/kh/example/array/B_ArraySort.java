package com.kh.example.array;

import javax.xml.transform.sax.SAXSource;
import java.util.Arrays;
import java.util.Scanner;

public class B_ArraySort {

    public void testSwapLogic() {
        int num1 = 10;
        int num2 = 20;
        int temp = 0;

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);

        int[] arr = {2, 1, 3};

        int temp2 = 0;

        // temp2 = arr[0];
        // arr[0] = arr[1];
        // arr[1] = temp2;
        for (int i = 0; i < arr.length - 1; i++) {
            temp2 = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp2;
        }

    }

    public void testArraySort1() {
        //선택정렬
        int[] array = {6, 2, 4, 1, 3, 5};
        int min;
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            System.out.println("--------- 교환 시작합니다. ----------");
            temp = array[i];
            array[i] = array[min];
            array[min] = temp;
            /*
             *
             * 초기값 6 2 4 1 3 5
             * 1회전 2 6 4 1 3 5
             * 2회전 2 4 6 1 3 5
             * 3회전
             *
             *
             *
             * */

            for (int k = 0; k < array.length; k++) {
                if (k < array.length - 1) {
                    System.out.print(array[k] + ", ");

                } else System.out.print(array[k]);
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(array));
    }

    public void testArraySort2() {
        //버블 정렬 ( bubble sort)
        //인접한 두 개의 값을 비교하여
        //더 큰 값을 우측으로 보내는 정렬 알고리즘
        //이미 정렬이 어느정도 되어있는 데이터에 대한 수행속도가 매우 빠르다.
        //역으로 정렬되어있는 배열을 정렬 할 때에는 시간복잡도가 제곱수 배로 증가하여 효율이 급격히 떨어진다.
        int[] array = {6, 4, 2, 1, 3, 5};

        //4, 6, 2, 1, 3, 5
        //4, 2, 6, 1, 3, 5
        //4, 2, 1, 6, 3, 5
        //4, 2, 1, 3, 6, 5
        //4, 2, 1, 3, 5, 6

        //2, 4, 1, 3, 5, 6
        //2, 1, 4, 3, 5, 6
        //2, 1, 3, 4, 5, 6

        //1, 2, 3, 4, ,5 6
        int temp = 0;
        for (int i = array.length - 1; i > -1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("정렬 후 확인 : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }
}

