package com.kh.chap01_inherit.before.run;

import com.kh.chap01_inherit.before.model.vo.Desktop;
import com.kh.chap01_inherit.before.model.vo.SmartPhone;
import com.kh.chap01_inherit.before.model.vo.Tv;

public class Run {
    public static void main(String[] args) {
        // 제조사, 상품번호, 상품명, 가격, cpu, hdd, ram, 운영체제, 일체여부
        Desktop d = new Desktop("삼송","s-01","울트라",200000,"interl", 500, 8, "Windows 10", true);

        // 제조사, 상품번호, 상품명, 가격, cpu, hdd, ram, 운영체제, 통신사
        SmartPhone s = new SmartPhone("애플","a-04","아이폰5s",1300000,"긱벤치",1024,4,"ios","SKT");

        // 제조사, 상품번호, 상품명, 가격, 인치
        Tv t = new Tv("LG", "l-11","lg티비",1500000,56);

        // 세 클래스가 공통적으로 가지고 있는 필드 >> 제조사, 상품번호, 상품명, 가격     -> Product
        // 두 클래스가 공통적으로 가지고 있는 필드 >> cpu, hdd, ram, os           -> Computer
        System.out.println(d.information());
        System.out.println(s.information());
        System.out.println(t.information());
    }
}
