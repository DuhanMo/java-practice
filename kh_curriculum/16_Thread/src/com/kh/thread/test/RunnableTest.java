package com.kh.thread.test;

public class RunnableTest implements Runnable {
    // 스레드를 사용하는 방법2
    //  Runnable 인터페이스를 상속받아
    //  run() 메소드를 구현하여 사용
    private String threadName;

    public RunnableTest() {

    }

    public RunnableTest(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
//        for (int i = 0; i <10 ; i++) {
//            System.out.println((i+1)+"번 실행되었습니다.");
//        }
        for (int i = 0; i < 10; i++) {
            System.out.println(threadName + " : " + i);
        }
    }

    public static void main(String[] args) {
        // Runnable 인터페이스를 통해
        // 스레드를 실행 시킬 경우
        // 반드시 runnable 로 생성된 객체를
        // 매개변수로하는 Thread 객체를 생성하여 실행하여야 한다.

        // Runnable 은 구현하기 위한 Thread 가 있어야만 start 할 수가 있다.

        // 단일스레드 경우
//        Runnable myRunnable = new RunnableTest();
//        Thread myThread = new Thread(myRunnable);
//        myThread.start();

        // 멀티스레드의 경우
        Runnable runnable1 = new RunnableTest("thread_1");
        Runnable runnable2 = new RunnableTest("thread_2");

        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable2);

        t1.start();
        t2.start();

        // 스레드의 우선순위 확인
        // getPriority() : 우선순위를 가져오는 메소드 ( 기본값은 5 : 범위 1 ~ 10)
        System.out.println("t1의 우선순위 : " + t1.getPriority());
        System.out.println("t2의 우선순위 : " + t2.getPriority());

        // 실행순서가 매번 다른 이유는 각각의 스레드가 모두
        // 같은 우선순위를 지니고 있기 때문에
        // 운영체제(OS)에서 직접 임의의 스레드를 한번씩 호출하며 출력하기 떄문이다.

        t1.setPriority(10);     // 가장 높은 값은 10
        t2.setPriority(1);      // 가장 낮은 단위
        System.out.println("t1의 우선순위 : " + t1.getPriority());
        System.out.println("t2의 우선순위 : " + t2.getPriority());
        t1.start();
        t2.start();
    }
}
