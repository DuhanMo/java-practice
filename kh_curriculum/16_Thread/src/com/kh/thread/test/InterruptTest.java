package com.kh.thread.test;

import javax.swing.*;

public class InterruptTest {
    // 현재 실행 중인 스레드를 중간에 정지시키고
    // 다른 스레드를 동작시킬때 사용하는 기법
    // ex) 토스트를 굽고 커피를 내리고 있을때
    //  중간에 토스트가 탄다면, 커피내리는 작업을 중단하고
    //  바로 토스트를 꺼낸다.
    public static void main(String[] args) {
        InterruptTest inter = new InterruptTest();
        inter.test1();
    }
    public void test1(){
        CountThread cnt = new CountThread();
        cnt.start();

        String answer = JOptionPane.showInputDialog("10초 안에 아무 과일이나 입력하세요.");
        System.out.println(answer + " 과일을 입력하셨습니다.");

        // 10초 안에 입력했을 경우 초세기를 중단
        cnt.interrupt();
        System.out.println("isInterrupted() : " + cnt.isInterrupted());
        System.out.println("getState() : " + cnt.getState());

    }

}

// 시간 10초 세는 스레드
class CountThread extends Thread{
    @Override
    public void run() {
        int i = 10;

        // isInterrupted() 메소드는
        // 반복을 수행하는 중간에 중단 요청이 들어왔는지
        // 체크하는 메소드(중단 요청이 왔을 경우 true)
        while(i > -1 && !this.isInterrupted()){
            System.out.println((i--) + " : 현재 상태 = " + this.getState());
            System.out.println("중단 요청 확인 = " + isInterrupted());

            // 강제로 1초단위로 sleep()
//            for(long l = 0; l < 2000000000L ; l++);

            // sleep()
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        }
    }
}
