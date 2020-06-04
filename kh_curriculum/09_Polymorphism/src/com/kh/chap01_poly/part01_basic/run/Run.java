package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Child2;
import com.kh.chap01_poly.part01_basic.model.vo.Parent;

public class Run {
    public static void main(String[] args) {

        // 1. 부모타입 레퍼런스로 부모객체를 다룰 때 --> p1 레퍼런스로 Parent에만 접근 가능
        System.out.println("== 1. 부모타입 레퍼런스로 부모 객체 다루는 경우 ==");
        Parent p1 = new Parent();
        p1.printParent();

        // 2. 자식타입 레퍼런스로 자식객체를 다룰 때 --> c1래퍼런스로 Child1,Parent 둘다 접근 가능
        // (Parent 접근 시 자동으로 형변환 된 채로 진행 된다 ==> 형변환 생략 가능)
        System.out.println("== 2. 자식타입 레퍼런스로 자식 객체 다루는 경우 ==");
        Child1 c1 = new Child1();
        ((Parent) c1).printParent();    // 업캐스팅: 자식타입 --> 부모타입(생략가능)
        c1.printParent();
        c1.printChild1();

        // 3. 부모타입 래퍼런스로 자식 객체를 다룰 때
        System.out.println("== 3. 부모타입 레퍼런스로 자식 객체 다루는 경우 ==");
        Parent p2 = new Child2();       // 업캐스팅 : 자식타입 --> 부모타입(생략가능)
        p2.printParent();
        ((Child2) p2).printChild2();     // 다운캐스팅 : 부모타입 --> 자식타입(생략불가)
        ((Child2) p2).printParent();

        // 4. 자식 타입레퍼런스로 부모객체를 다룰 때
//        Child2 c2 = new Parent();       // 컴파일 에러: 소스상의 문법 오류
//        Child2 c2 = (Child2) (new Parent());
//        System.out.println(c2);         // 런타임에러: 컴파일 에러는 없지만 프로그램 실행할 때 형변환관련 예외 발생 ClassCastException

        System.out.println("=== 간단한 예제 ===");
        //다형성의 정의 : 부모타입으로부터 파생된 여러가지 타입의 자식 객체를 부모 클래스 타입 하나로 다룰 수 있는 기술

        Parent[] pArr = new Parent[4];
        pArr[0] = new Child1();
        pArr[1] = new Child2();
        pArr[2] = new Child2();
        pArr[3] = new Child1();
        for (int i = 0; i < pArr.length; i++)
            // instanceof : 현재 참조형 변수가 어떤 클래스 형의 객체 주소를 참조하고있는지 확인할 때 사용
            // 클래스타입이 일치하면 true, 불일치하면 false를 반환.
//            if

        pArr[i].print();
        // 동적바인딩 : 프로그램이 실행되기전에 컴파일이 되면서 모든 메소드는 정적 바인딩이 되는데
        //          컴파일시 정적바인딩된 메소드를 실행할 당시의 객체 타입을 기준으로 바인딩되는것을 동적 바인딩이라고한다.
        //          상속관계로 이루어져 다형성이 적용된 경우, 메소드 오버라이딩이 되어있으면
        //          정적 바인딩 된 메소드코드보다
    }
}
