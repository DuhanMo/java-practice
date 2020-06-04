package com.kh.chap05_method.part01_overloadingTest;

public class OverloadingTest {

    // 오버로딩의 조건
    // 자료형의 타입, 순서, 갯수 가 달라야함.
    // 반환형,접근제한자가 다르다고 해서 오버로딩이 적용되진 않는다.
    // 오직 메소드명과 메소드 시그니처만 상관함.

   public int test() {
       return 0;
   }
   public int test(int a) {
       return 0;
   }
   public int test(String s) {
       return 0;
   }
   public int test(int a, String s){
       return 0;
   }
   public int test(String s, int a) {
       return 0;
   }
   public int test(int a, int b) {
       return a*b;
   }

//   public int test(int b, int a){
//       return 0;
//   }

    public int test(int b, int a, String s){
       return 0;
    }
//    public String test(int b, int a, String s){
//       return "";
//    }
//    private int test(int b, int a, String s){
//       return 0;
//    }


}
