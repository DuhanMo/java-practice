package com.kh.chap03_field.part01_kindOfVariable.model.vo;

public class FieldTest1 { // * 클래스 영역의 시작

    /*
     *  클래스 : '필드 ' + 생성자 + 메소드
     *
     * 1. 필드
     *  - 전역변수 : 클래스 영역에 작성하는 변수로 같은 클래스 내에서는 어디서든 호출이 가능하다.
     *  - 지역변수 : 메소드 실행시, 생성자, 제어문 등등 클래스 영역을 제외한 특정한 구역({})
     *            안에 생성되어 그 지역에만 사용할 수 있는 변수
     *
     * 2. 전역변수
     *  - 멤버변수(인스턴스 변수)
     *    생성 : new 를 통해 인스턴스(객체) 생성 시 메모리 할당
     *    소멸 : 객체(인스턴스) 소멸 시 소멸
     *
     *  - 클래스변수(static 변수) : 클래스 영역에서 static이라는 예약어가 붙은 변수(static == 공유의 개념)
     *    생성 : 프로그램 실행 시 static(정적) 메모리 영역에 할당
     *    소멸 : 프로그램 종료 시 소멸
     *
     * 3. 지역변수
     *    생성 : 특정한 구역({}) 실행 시 메모리 영역에 할당 ( ex. 메소드 실행시)
     *    소멸 : 특정한 구역({}) 종료 시 소멸
     *
     * 4. final (상수)
     *  - 하나의 값만 계속 저장해야 하는 변수에 사용
     *
     * 5. static final (= final static)
     *  - 상수이면서 정적메모리에 할당, 여러 객체가 공유할 목적으로 사용
     *
     * */

    //클래스 영역에 작성하는 변수를 필드라고 한다.
    // 1. 전역변수(클래스 전역에서 사용할 수 있는 변수라는 의미)
    private int global;     //멤버변수 == 인스턴스 변수
    private static int classVariable; //클래스변수(static변수)

    public static void testMethod(int num) { // * 메소드 영역의 시작
        // 지역변수(메소드 영역에서 작성하는 변수)
        int local=0;
        // int num : 매개변수 (parameter) ,메소드의 괄호 안에 작성하는 변수 -> 매개변수도 일종의 지역변수로 생각
        System.out.println(num);
        System.out.println(local + num);
// 전역변수 출력 -> 전역변수는 클래스 전역에서 다시 사용가능하고 , 미초기화가 jvm 이 기본값을 부여해준
//        System.out.println(global);

    }// * 메소드 영역의 끝
} // * 클래스 영역의 끝
