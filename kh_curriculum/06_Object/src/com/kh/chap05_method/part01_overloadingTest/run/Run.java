package com.kh.chap05_method.part01_overloadingTest.run;

import com.kh.chap05_method.part01_overloadingTest.*;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

public class Run {
    public static void main(String[] args){
//        OverloadingTest ov = new OverloadingTest();


        NonStaticMethod ns = new NonStaticMethod();
        // 1. 매개변수와 반환값이 없는 메소드 호출
        ns.method1();

        // 2. 매개변수가 없고 반환값이 있는 메소드 호출의 경우
        // 리턴타입과 일치하는 자료형의 변수에 메소드 수행 결과를 담아서 사용한다.
        String str = ns.method2();
        System.out.println(str);
        System.out.println(ns.method2());

        // 3. 매개변수가 있고 반환값이 없는 메소드 호출의 경우
        // 반드시 인자로 매개변수의 타입과 순서와 갯수가 일치하는 값을 넘겨줘야한다.
        ns.method3(10,8);

        // 4. 매개변수가 있고 반환값도 있는 메소드
        int result = ns.method4(100,1);
        System.out.println("result : "+result);

        // StaticMethod test
        StaticMethod.staticMethod1();
        System.out.println("10과 20의 합은 " + StaticMethod.staticMethod2()+ "입니다.");
        StaticMethod.staticMethod3("모두한");

        String result2 = StaticMethod.staticMethod4("모두한마음");
        System.out.println(result2);

        System.out.println(StaticMethod.staticMethod4("모두한마음"));
    }

}
