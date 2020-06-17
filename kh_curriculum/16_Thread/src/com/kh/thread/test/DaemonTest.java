package com.kh.thread.test;

public class DaemonTest {
    // 데몬 스레드
    //      일반 스레드와 달리
    //      스스로 작업을 수행하는 스레드를 말한다
    //      일반 스레드의 작업을 돕는 보조적인 역할을 수행하는 스레드
    //      가비지 컬렉터, 자동저장, 화면자동갱신 등에 사용되며 일반스레드가 종료되면 데몬스레드도 같이 종료된다.
    //      무한루프와 조건문을 이용해서 실행 후 대기하다가 특정 조건이 만족되면 작업 수행하고 다시 대기하도록
    //      작성된다.
    //      데몬스레드는 프로세스를 실행하기 전에 반드시 등록을 해두어야 한다.

    // 자동 저장 옵션
    public static boolean autoSave = true;

    public static void main(String[] args) {
        DaemonThread dt = new DaemonThread();

        // 데몬 스레드로 등록하여 자동으로 동작하게 설정
        dt.setDaemon(true);
        dt.start();;

        for (int i = 0; i <10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i + "초가 경과하였습니다.");
            if(i == 5){
                autoSave=false;
            }
        }
    }
}

class DaemonThread extends Thread{

    @Override
    public void run(){

        while(true){
            if(DaemonTest.autoSave){
                autoSave();

                try {
                    // 천분의 1초 기준 잠시 일시정지 시키는 메소드
                    Thread.sleep(3000);

                } catch (InterruptedException e) {

                    e.printStackTrace();

                }
            }
        }
    }

    public void autoSave(){
        System.out.println("자동 저장 됩니다~");
    }
}