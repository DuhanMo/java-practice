package com.kh.chap01_encapsulation.model.vo;

public class Account {
    // 객체란 ?
    // - 사전적 의미 : 독립적으로 존재하는 어떤 것들(무형, 유형, 사물, 개념, ...)
    // 객체지향프로그래밍이란 ?
    // - 현실세계의 객체간 상호작용(의미, 목적을 가지고)--> 프로그래밍을 통해 가상세계로 구현
    // 객체를 그러면 어떻게 만들지?
    // - 클래스를 통해서 객체를 만들어낸다.
    // - 현실세계의 객체 -> 추상화, 캡슐화를 통해 클래스라는 틀로 만듦
    //                      -> 객체 생성(자바에서 클래스에 의해 데이터가 메모리로 들어감) --> "인스턴스화"
    // 학생 ->    Student sc = new Student();    --> 객체를 만들었다.
    //          sc.name = "홍길동:;
    //          sc.age = 19;
    //          sc.classNumber = 1;
    //          sc.studentNumber = 201401566;

    //          Student sc1 = new Student();   --> 객체를 만들었다.
    //          sc1.name = "김영희";
    //          sc1.age = 17;
    //          sc1.classNumber = 3;
    //          ....
    //          Student sc2 = new Student(값, 값, 값, ...);
    // name, age, address, classNumber, studentNumber, ...
    // 클래스의 등장 배경
    // - 자바에서 맨처음 배운 변수 = 실제 값을 저장하기 위한 공간(하나의 자료형, 하나의 값 보관)
    // - 그 다음으로 배운 배열 = 실제 값은 Heap에 있고 그 주소값만 참조하는 참조자료형(하나의 자료형. 여러개의 값 보관)
    // - 구조체와 캡슐화, 메소드 --> 클래스 구현(여러가지 자료형, 여러개의 값 보관)


    //계좌 입출금 관리

    //캡슐화를 적용하기 전
//    public String name = "모두한";
//    public String accNo = "010-2400-2811";
//    public String pwd = "1234";
//    public int bankCode = 20; // 신한은행 20, 국민은행10, ...
//    public int balance = 0; // 잔액

    //캡슐화를 적용한 후
    private String name = "모두한";
    private String accNo = "010-2400-2811";
    private String pwd = "1234";
    private int bankCode = 20; // 신한은행 20, 국민은행10, ...
    private int balance = 0; // 잔액

    // 입금을 위한 메소드
    public void deposit(int money) {
        if (money > 0) {
            balance += money;
            System.out.println(name + "님의 계좌에 " + money + "원이 입금되었습니다.");
        } else {
            System.out.println("잘못된 금액이 입금되었습니다.");
        }
    }

    // 출금을 위한 메소드
    public void withdraw(int money) {
        if (money < balance) {
            balance -= money;
            System.out.println(name + "님의 계좌에 " + money + "원이 출되었습니다.");
        } else {
            System.out.println("잔액이 부족합니다. 잔액을 확인하세요.");
        }
    }

    // 잔액 조회를 위한 메소드
    public void displayBalance() {
        System.out.println(name + " 님의 계좌 잔액은 " + balance + "원 입니다.");
    }

    //getter /setter 메소드
    //private String name

    //getter : 값을 가져올 때
    public String getName() {
        return name;
    }

    // setter : 값을 수정할 때
    public void setName(String name) {
        this.name = name; // this는 new라는 연산자를 통해서 객체 만듦 --> this ==> 객체의 주소값 this.name
    }

    // getter 만들기
    // 접근제한자 반환형 메소드명(){
    //   return 변수명;
    // }
    public String getAccNo() {   // ac.getAccNo();
        return accNo;
    }

    // setter 만들기
    // 접근제한자 void set메소드(변수 타입 수정할 변수명){
    // this.변수명 = 수정할 변수명;
    // }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getBankCode() {
        return bankCode;
    }

    public void setBankCode(int bankCode) {
        this.bankCode = bankCode;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
