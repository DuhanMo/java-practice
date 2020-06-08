package com.kh.chap03.myException.controller;


import com.kh.chap03.myException.exception.MyException;

import java.util.Scanner;

public class MyExceptionTest {
    public void inputAge() {
        // 나이를 입력받아 19세 이상이면 성인입니다.
        // 19세 미만이라면 예외를 발생시키는 코드를 작성
        System.out.print("나이 입력 : ");
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        try {
            checkAge(age);
        } catch (MyException e) {

            // 1. 사용자에게 에러명만 보여주는 경우
            System.out.println(e.getMessage());

            // 2. 에러의 근원지와 어떤 경로로 이어지는지 확인이 필요한경우.(개발자가 필요로함)
            e.printStackTrace();
        }

    }
public void checkAge(int age) throws MyException {
        if (age > 18){
            System.out.println("성인입니다.");
        }else{
            throw new MyException("청소년은 이용할 수 없습니다. ");
        }
}

}
