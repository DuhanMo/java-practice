package com.hw1.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SpaceUpper {
    Scanner sc = new Scanner(System.in);


    public SpaceUpper() {
    }

    public void spaceToUpper() {
        System.out.println("영어를 입력하시오(띄어쓰기 포함) ");
        StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
        String[] arr = new String[st.countTokens()];
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < arr.length; i++){
            arr[i] = st.nextToken();
            arr[i] = arr[i].substring(0,1).toUpperCase() + arr[i].substring(1).toLowerCase();
            sb.append(arr[i]);
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
