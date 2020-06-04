package com.kh.chap01.part02_PersonMVC.controller;


import com.kh.chap01.part02_PersonMVC.model.vo.Person;

import java.util.Scanner;

public class PersonController {
    private Person[] people = new Person[2];

    Scanner sc = new Scanner(System.in);

    public PersonController(){ }

    // 회원 추가
    public void insertPerson() {
        for (int i = 0; i < people.length; i++){
            System.out.println("====== 회원 정보 입력 ======");
            System.out.print("이름 : ");
            String name = sc.nextLine();
            System.out.print("나이 : ");
            int age = sc.nextInt();
            System.out.print("재산 : ");
            int wealth = sc.nextInt();
            sc.nextLine();
            people[i] = new Person(name, age, wealth);
        }
    }
    // 회원 전체 조회
    public void printPerson() {
        for (int i = 0; i < people.length; i++){
            System.out.println(people[i].information());
        }
    }
}
