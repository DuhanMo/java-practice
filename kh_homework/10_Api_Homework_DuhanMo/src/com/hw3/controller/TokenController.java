package com.hw3.controller;

import java.util.StringTokenizer;

public class TokenController {
    public String afterToken(String str){
        StringTokenizer stk = new StringTokenizer(str," ");
        StringBuilder stb = new StringBuilder();
        while(stk.hasMoreTokens()) {
           stb.append(stk.nextToken());
        }
        return stb.toString();
    }

    public String firstCap(String input){

        return input.substring(0,1).toUpperCase() + input.substring(1);
    }
    public int findChar(String input, char one){
        int count = 0;
        char[] cArr = input.toCharArray();
        for (int i = 0; i < cArr.length; i++){
            if(cArr[i] == one) count++;
        }

        return count;
    }
}
