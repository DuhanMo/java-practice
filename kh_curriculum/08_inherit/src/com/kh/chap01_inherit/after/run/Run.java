package com.kh.chap01_inherit.after.run;

import com.kh.chap01_inherit.after.model.vo.Desktop;
import com.kh.chap01_inherit.after.model.vo.SmartPhone;
import com.kh.chap01_inherit.after.model.vo.Tv;

public class Run {
    public static void main(String[] args) {
        // 제조사, 상품번호, 상품명, 가격, cpu, hdd, ram, 운영체제, 일체여부
        Desktop d = new Desktop("삼송", "s-01", "울트라", 200000, "interl", 500, 8, "Windows 10", true);

        // 제조사, 상품번호, 상품명, 가격, cpu, hdd, ram, 운영체제, 통신사
        SmartPhone s = new SmartPhone("애플", "a-04", "아이폰5s", 1300000, "긱벤치", 1024, 4, "ios", "SKT");

        // 제조사, 상품번호, 상품명, 가격, 인치
        Tv t = new Tv("LG", "l-11", "lg티비", 1500000, 56);

        // 세 클래스가 공통적으로 가지고 있는 필드 >> 제조사, 상품번호, 상품명, 가격     -> Product
        // 두 클래스가 공통적으로 가지고 있는 필드 >> cpu, hdd, ram, os           -> Computer
        System.out.println(d.information());
        System.out.println(s.information());
        System.out.println(t.information());

        // 상속의 장점
        // - 보다 적은 양의 코드로 새로운 클래스 작성 가능
        // = 코드를 공통적으로 관리하기 때문에 코드의 추가나 변경에 용이
        // - 코드의 중복을 제거하여 프로그램의 생산성과 유지보수에 크게 기여

        // 상속의 특징
        // - 명시되어있지는 않지만 모든 클래스는 Object 클래스의 후손이다
        // --> Object 클래스가 제공하는 메소드들을 오버라이딩하여 메소드 재구현 가능하다.
        // 부모클래스의 생성자, 초기화 블록은 상속이 안된다. (자식 클래스 생성시, 부모클래스 생성자 먼저 실행)
    }
}
