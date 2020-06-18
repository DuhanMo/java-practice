package com.kh.thread.sync;

import java.util.Random;

public class ProductAndConsumerTest {
    // 스레드의 상태 변경 및 동기화를 확인하기 위한
    // 생산자, 소비자 객체 테스트
    // Producter 는 케익을 만들고
    // Consumer 는 케익을 먹는다

    // Producter 는 케익을 만들어서
    // Desk에 저장하고, 만약 이미 케익이 있다면
    // 팔릴 때 까지 기다린다.

    // Consumer 는 케익이 있다면 케익을 먹고,
    // 케익이 없다면 desk 에 케익이 생길 때 까지 기다린다

    // sleep : 주어진 시간동안 일지 정지
    // yield : Thread.yield() -> 다른 스레드에게 실행 양보 ( 호출한 스레드는 실행대기로 돌아가고
    //                                                동일한 우선순위 또는 높은 우선순위를 갖는 다른 스레드를 실행)
    // join : Thread.join() -> 다른 스레드의 종료를 기다린다.( 다른 스레드가 종료할 때 까지 기다렸다가 실행해야 하는 경우 )
    // notify : wait() 에 의해 일시 정지된 스레드 중 한개를 깨운다.
    // notifyAll : wait() 에 의해 일시 정지된 모든 스레드를 깨운다.

}
/// Productor
class Productor implements java.lang.Runnable{
    private Desk desk;

    public Productor(Desk desk){
        this.desk = desk;
    }

    @Override
    public void run(){
        // 케익을 생산하는 과정
        for(int i = 1; i < 11 ; i++){
            desk.put(i);
            System.out.println(i+"번째 케익이 완성되었습니다!");

            try {

                // 케익을 만들고 대기하는 시간
                Thread.sleep(new Random().nextInt(5) * 500);

            } catch (InterruptedException e) {

                e.printStackTrace();

            }
        }

    }

    public static void main(String[] args) {
        Desk desk = new Desk();

        // 생산자
        new Thread(new Productor(desk)).start();
        // 소비자
        new Thread(new Consumer(desk)).start();
    }
}

class Desk {
    private int index; // 케잌의 순서
    private boolean isEmpty; // 현재 케잌이 비어있는지 확인

    // P : 케잌 생산 후 Desk 에 집어넣는 메소드
    public synchronized void put(int index) {
        while(!isEmpty){
            // 비어있지 않을 때 대기하는 반복문

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isEmpty = false;
        this.index = index;
        notifyAll();
    }

    // C : Desk 에 케잌을 가져오는 메소드
    public synchronized int get() {
        // 케잌 Desk 비어있다면 기다린다
        while (isEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Desk 가 비어있지 않다면
        // index번째 케잌을 꺼내어 먹고
        // 비었다고 표시
        isEmpty = true;
        notifyAll();

        return index;
    }
}

/// Consumer
class Consumer implements java.lang.Runnable{
    private Desk desk;

    public Consumer(Desk desk){
        this.desk = desk;
    }

    @Override
    public void run(){
        for(int i = 1; i < 11 ; i++){
            int index = desk.get();

            System.out.println(index+"번째 케익을 먹었습니다.");

            try {

                Thread.sleep(new Random().nextInt(5) * 500);

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        }
    }
}