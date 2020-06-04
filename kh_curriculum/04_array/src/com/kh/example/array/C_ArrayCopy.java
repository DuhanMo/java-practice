
package com.kh.example.array;

import java.util.Arrays;

public class C_ArrayCopy {

    // 얕은 복사 : 배열의 주소만 복사, 같은 주소를 보고 있어서 서로의 값을 바꾸면 주소의 내용이 바뀌기 때문에 두개의 변수 모두 변경
    // 깊은 복사 : 동일한 새로운 배열을 하나 생성하여 실제 내부 값 복사
    //
    public void method1() {
        int[] originArr = {1, 2, 3, 4, 5};
        // 얖은 복사
        int[] copyArr = originArr;


        String str = "";

        for (int i = 0; i < originArr.length; i++) {
            if (i != originArr.length - 1) {
                str += originArr[i] + ", ";
            } else {
                str += originArr[i];
            }
        }
        System.out.println("originArr : " + str);
        originArr[0] = 999;
        copyArr[2] = 888;
        str = "";

        for (int i = 0; i < copyArr.length; i++) {
            if (i != copyArr.length - 1) {
                str += copyArr[i] + ", ";
            } else {
                str += copyArr[i];
            }
        }
        System.out.println("copyArr : " + str);

        System.out.println("originArr의 hashcode : " + originArr.hashCode());
        System.out.println("copyArr의 hashCode : " + copyArr.hashCode());


    }

    public void method3() {
        int[] originArr = {1, 2, 3, 4, 5};
        int[] copyArr = new int[10];

//         2. arraycopy()을 이용한 복사
//         복사 시작할 인덱스 지정할 수 있다.

//
//        System.arraycopy(src,   srcPos,   dest,  destPos,  length);
//                       원본배열           복사할배열               복사길
//                                 시작위치           시작위치

        System.arraycopy(originArr, 0, copyArr, 1,originArr.length);

        String str = "";

        for (int i = 0; i < originArr.length; i++) {
            if (i != originArr.length - 1) {
                str += originArr[i] + ", ";
            } else {
                str += originArr[i];
            }
        }
        System.out.println("originArr : " + str);
        originArr[0] = 999;
        copyArr[2] = 888;
        str = "";

        for (int i = 0; i < copyArr.length; i++) {
            if (i != copyArr.length - 1) {
                str += copyArr[i] + ", ";
            } else {
                str += copyArr[i];
            }
        }
        System.out.println("copyArr : " + str);

        System.out.println("originArr의 hashcode : " + originArr.hashCode());
        System.out.println("copyArr의 hashCode : " + copyArr.hashCode());
    }

    public void method2() {
        int[] originArr = {1, 2, 3, 4, 5};
        //originArr과 copyArr의 주소값은 서로 다름
        int[] copyArr = new int[5];

        for (int i = 0; i < originArr.length; i++) {
            copyArr[i] = originArr[i];
        }
        String str = "";

        for (int i = 0; i < originArr.length; i++) {
            if (i != originArr.length - 1) {
                str += originArr[i] + ", ";
            } else {
                str += originArr[i];
            }
        }
        System.out.println("originArr : " + str);
        originArr[0] = 999;
        copyArr[2] = 888;
        str = "";

        for (int i = 0; i < copyArr.length; i++) {
            if (i != copyArr.length - 1) {
                str += copyArr[i] + ", ";
            } else {
                str += copyArr[i];
            }
        }
        System.out.println("copyArr : " + str);

        System.out.println("originArr의 hashcode : " + originArr.hashCode());
        System.out.println("copyArr의 hashCode : " + copyArr.hashCode());

    }
    //0520 수업내용
    public void method4() {
        int[] originArr = {1, 2, 3, 4, 5};
        int[] copyArr = new int[10];
        String str = "";

        for (int i = 0; i < copyArr.length; i++) {
            if (i != copyArr.length - 1) {
                str += copyArr[i] + ", ";
            } else {
                str += copyArr[i];
            }

        }
        System.out.println("처음 copy Arr : " + str);

        // 3. Arrays.copuOf() 를 이용한 복사, 깊은 복사, copy가 방이 10개였는데 origin을 카피하면서 5개로 줄었다.

        copyArr = Arrays.copyOf(originArr, originArr.length);
        System.out.println("originArr : " + Arrays.toString(copyArr));
        System.out.println(originArr.hashCode() + " " + copyArr.hashCode());
        System.out.println("copyArr : " + Arrays.toString(copyArr));
    }

    public void method5() {

        int[] originArr = {1, 2, 3, 4, 5};
        int[] copyArr = new int[10];

        System.out.println("준비된 원본 배열의 주소 : " + originArr.hashCode());
        System.out.println("origin 배열의 내용 : " + Arrays.toString(originArr));
        System.out.println("준비된 복사본 배열의 주소 : " + copyArr.hashCode());
        System.out.println("준비된 copy 배열의 내용 : " + Arrays.toString(copyArr));


        // 4.clone()을 이용한 복사
        // 시작 인덱스를 지정할 수 없으며, 원본 배열을 통째로 복사해 새로운 배열 할당
        // 깊은복사
        System.out.println("=========================");
        copyArr = originArr.clone();
        System.out.println("(새롭게생성된)복사본 배열의 주소 : " + copyArr.hashCode());
        System.out.println("(새롭게생성된)복사된 copy 배열의 내용 : " + Arrays.toString(copyArr));
    }
}



