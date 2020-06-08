package com.kh.chap01.runtimeException.controller;

public class RunExceptionPrac {
    // 1. 에외(Exception) : 소스코드 수정으로 해결 가능한 에러
    //      - 기본적으로 정의된 예외는 그에 해당하는 상황이 되면 예외 상활 발생
    //      - throw : 예외 상황을 인위적으로 발생시킬 수 있다.
    //      - throws : 현재의 예외 상황을 나를 호출하는 대상으로 전달.(책임전가)

    // 2. RuntimeException : ( 런타임 에러로 소스코드 수정으로 해결가능하므로 에외에 들어간다.)
    //                       ( Error를 상속하는 에외클래스만큼 치명적인 예외상황의 표현에 사용하지 않는다.)
    // (입력값이 틀리거나, 배열의 인덱스범위를 벗어나거나, 계산식에 오류가 났거나, 0으로 나누기 정도)
    // - ArrayIndexOutOfBoundsException : 배열의 접근에 잘못된 인덱스 값을 사용하는 예외상황
    // - ClassCastException : 허용할 수 없는 형변환 연산을 진행하는 예외상황
    // - NullPointerException : 참조변수가 null로 초기화된 상황에서 메소드를 호출하는 예외상황
}
