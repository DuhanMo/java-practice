package com.kh.chap01.runtimeException.controller;

import java.util.Scanner;

public class RunExceptionPrac {
    // 1. 에외(Exception) : 소스코드 수정으로 해결 가능한 에러
    //  - 기본적으로 정의된 예외는 그에 해당하는 상황이 되면 예외 상활 발생
    //  - throw : 예외 상황을 인위적으로 발생시킬 수 있다.
    //  - throws : 현재의 예외 상황을 나를 호출하는 대상으로 전달.(책임전가)

    // 2. RuntimeException : ( 런타임 에러로 소스코드 수정으로 해결가능하므로 에외에 들어간다.)
    //                       ( Error를 상속하는 에외클래스만큼 치명적인 예외상황의 표현에 사용하지 않는다.)
    // (입력값이 틀리거나, 배열의 인덱스범위를 벗어나거나, 계산식에 오류가 났거나, 0으로 나누기 정도)
    //  - ArrayIndexOutOfBoundsException : 배열의 접근에 잘못된 인덱스 값을 사용하는 예외상황
    //  - ClassCastException : 허용할 수 없는 형변환 연산을 진행하는 예외상황
    //  - NullPointerException : 참조변수가 null로 초기화된 상황에서 메소드를 호출하는 예외상황
    //    NegativeArraySizeException : 배열선언과정에서 배열의 크기를 음수로 지정하는 예외상

    // 3. 예외처리방법
    //  - if문 : 간단한 예외처리시
    //          장점 - 프로그램이 종료되지 않고 그 예외상황에 있어서는 if문이 실행되거나 실행되지 않게 하여
    //                프로그램의 흐름을 조절할 수 있다.
    //          단점 - 너무 깊이 if문이 적용되면 그것이 예외상황 처리인지 프로그램의 주 흐름인지 명확하지 않아진다.

    /*
     *
     *   try{
     *   ...
     *   }catch(IOException e){
     *   ...
     *   }catch(Exception e){
     *   ...
     *   }
     *
     * */

    //  - try-catch문 : 정상적인 흐름에서 예외상황이  발생할 수 있는 지역에 한해서 예외처리를 해서 예외상황시 어떻게 할지 결정
    //      a. try블록 안은 하나의 일의 단위(트랜잭션)이다.
    //      b. catch블럭의 () 안은 try블록 안에서 발생한 에외 클래스의 인스턴스 참조변수가 넘어온다.

    //        (catch블록은 범위가 작은것부터 써주어야 의미가 있다. 그렇지 않으면 범위가 큰 에외클래스에 의해 모든 에외처리가 해당되므로)
    Scanner sc = new Scanner(System.in);

    public void ArithEx() {
        int ran = 0;
        double result = 0.0;
//        while (true) {
//            System.out.println("제수를 하나의 정수로 입력하시오 : ");
//
//            int inputNum = sc.nextInt();
//            ran = (int) (Math.random() * 10) + 1;
//            result = ran / (double) inputNum;
//            System.out.printf("%d/ %d = %.2f\n", ran, inputNum, result);
//        }



    }
}


