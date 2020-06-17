package com.kh.thread.test;

public class ThreadTest extends Thread{
    // 스레드를 사용하는 방법 1
    //      Thread 클래스를 상속받아
    //      run() 메소드를 활용하기
    @Override
    public void run(){
        for (int i = 0; i <10 ; i++) {
            System.out.println((i+1)+"번 실행되었습니다.");
        }

    }

    public static void main(String[] args) {
        ThreadTest thread = new ThreadTest();
        thread.start();
    }
}
