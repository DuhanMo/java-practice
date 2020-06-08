package com.kh.chap02.throwPrac.run;

import com.kh.chap02.throwPrac.controller.ThrowTest;

public class Run {
    public static void main(String[] args) throws Exception {

        ThrowTest tt = new ThrowTest();

        try {
            tt.methodA();
            System.out.println("Exception not generated");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception generated and go to catch(){}");
        } finally {
            System.out.println("Here are finally section");
        }
        System.out.println("Program is terminated normally");
    }
}
