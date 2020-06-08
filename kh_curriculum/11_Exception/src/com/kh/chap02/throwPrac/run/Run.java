package com.kh.chap02.throwPrac.run;

import com.kh.chap02.throwPrac.controller.ThrowsTest;
import com.kh.chap02.throwPrac.controller.TryCatchTest;

public class Run {
    public static void main(String[] args) throws Exception {

        ThrowsTest tt = new ThrowsTest();

//        try {
//            tt.methodA();
//            System.out.println("Exception not generated");
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("Exception generated and go to catch(){}");
//        } finally {
//            System.out.println("Here are finally section");
//        }
//        System.out.println("Program is terminated normally");
        TryCatchTest tc = new TryCatchTest();
//        tc.ioTest();
        tc.ioTest2();
    }
}
