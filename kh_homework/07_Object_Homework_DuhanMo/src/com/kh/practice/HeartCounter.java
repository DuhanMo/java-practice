package com.kh.practice;

public class HeartCounter {

//    int count ;
    static int count;

    public HeartCounter(){
        HeartCounter.count++;
        System.out.println("좋아요 갯수 : " + HeartCounter.count);
    }
    public static int getCount() {
        return count;
    }
    public static void main(String[] args){
        HeartCounter hc1 = new HeartCounter();
        HeartCounter hc2 = new HeartCounter();

        System.out.println("총 count " + HeartCounter.getCount());
    }
}
