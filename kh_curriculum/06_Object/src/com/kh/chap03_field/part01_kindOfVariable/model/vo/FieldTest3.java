package com.kh.chap03_field.part01_kindOfVariable.model.vo;

public class FieldTest3 {

    //final - 선언과 동시에 초기화 할 필요는 없지만 초기화 블럭이나 생성자에서 반드시 초기화가 있어야 오류가 없다.
    private final int NUM ;

    /*
    *
    * static final (상수 필드)
    * - public 접근제한자에 static과 final 예약어를 함께 사용하는 것을 상수필드라고 한다. (static과 final 순서는 상관이 없다)
    * - 반드시 선언과 동시에 초기화 되어야 한다.
    * - why?? 프로그램 실행시 static 키워드가 붙은 멤버는 전부 클래스 영역(static 공간)에 저장되기 때문에
    *         프로그램 시작 시 값이 저장되면 변경되지 않고 사용할 목적으로 사용한다.
    *
    * */
    public static final int STATIC_NUM = 1;
//    public final static int STATIC_NUM = 1;
    public FieldTest3() {
        this.NUM = 10;
    }
    public void nonStaticMethod(){
        //지역변수에서는 static 키워드 사용 불가능
        //non-static 메소드는 객체가 생성되어야만 접근 가능하기 때문에 static 키워드가 올 수 없다.
    }
    public static void staticMethod(){
//        static int localStaticNum;

        //static 메소드 내에서도 stataic 변수 사용이 불가능하다.
        //지역 변수는 메소드가 호출될 때 stack에 생기기 때문에 메모리에 생성되는 위치 자체가 다르다.

    }
//    public void setNUM(int NUM){ final은 한번에 초기화가 안되기 때문에 다음과 같이 setter메소드가 필요없다.
//        this.NUM = NUM;
//    }

    public static int getStaticNum(){
        return STATIC_NUM;
    }

    //pName
}
