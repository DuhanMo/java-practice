package com.kh.chap02_class.defaultClassTest.model.vo;

// 클래스에 선언할 수 있는 접근 제한자는 public,(default)
// default 라고 명시하게 되면 에러 발생

public class DefaultClass {
    //기본 생성자 (명시해주지않으면 자동으로 jvm에서 실행해줌)
    public DefaultClass(){


    }


    public void test(){
        System.out.println("DefaultClass 클래스 내의 test() 호출함");

    }
}

//class DefaultClass1{
//    public void test(){
//        System.out.println("DefaultClass1 클래스 내의 test() 호출함");
//
//    }
//}
