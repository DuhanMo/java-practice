package com.kh.chap02.throwPrac.controller;


public class ThrowsTest {
    // throws : 예외가 발생하면 예외 클래스의 참조변수를 호출한 곳으로 넘기게 되고 에외처리는 하지 않는 것이다.
    //        : 계속 throws로 넘기다가 Main 함수에서 마저도 jvm으로 throws를 할 수 있다.
    //          -jvm 까지 throws로 넘겼을 때
    //          a. getMessage 메소드를 호출한다.( 에외클래스의 생성자에서 super()를 처리한 문자열이 출력)
    //          b. 에외상황이 발생해서 전달되는 일련의 과정을 출력해준다.(printStackTrace메소드의 결과와 동일)
    //          c. 프로그램을 종료한다.
    public void methodA() throws Exception {
        System.out.println("methodA() call");
        methodB();
        System.out.println("methodA() terminate");
    }
    public void methodB()throws Exception{
        System.out.println("methodB() call");
        methodC();
        System.out.println("methodB() terminate");
    }
    public void methodC() throws Exception {
        System.out.println("methodC() call");
        //throw : 강제로 에러상황을 발생시키기 위한 구문작성
//        throw new Exception();
    }
}
