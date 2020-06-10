package com.kh.io.subStream.objectStream.model.vo;

import java.io.Serializable;

// MVC 패턴 : Model View Controller
// Model : 데이터, 객체선언 및 데이터 저장, 읽기 등을 담당하는 클래스를 가진 패키지
//      VO(Value Object) : 실제 저장, 읽기에 쓰이는 객체
// 			- DTO(Data Transfer Object)
// 			- Domain Object, Bean,Entity
//      DAO(Data Access Object) : VO를 저장하고, 읽고, 수정하는 기능을 담당하는 클래스
//      Service : 하나의 서비스에 대한 기능을 담당하는클래스
// View : 사용자 화면을 담당하는 객체
//     - java : 메뉴 출력 메소드
//     - Web : jsp / html
// controller : 사용자화면과 Service기능을 연결해주는 클래스
//     - java : Manager클래스
//     - Web : Servlet

public class Member implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 3799235693248447677L;

    // VO조건
    // 1. 모든 필드가 private 이어야 한다.
    // 2. 직렬화 처리를 반드시 해야한다.
    // 3. 기본 생성자와 Getter & Setter를 반드시 포함해야한다.

    // 직렬화 목적
    // 객체를 다른 프로그램, 컴퓨터에 전달할 때
    // 여러 필드들을 한줄로 구성하여 처리함으로써
    // 서로 다른 컴퓨터 구조라도 해당 객체를 올바르게 인식할 수 있게 해주는 기술

    // 직렬화<Serialization>
    // : 클래스에 적용함
    // --> 클래스가 객체 생성하고, 그 객체를 Object 입/출력에 사용할 경우, 바이트스트림이므로
    //     객체 상태로 그대로 스트림으로 전송할 수 없다.
    // ---> 직렬화를 적용한 클래스 로
    //      바이트 스트림 크기에 맞춰서, 객체 가진 필드들을 기록된 순서대로 바이트 단위로 길게 연속으로 나열 처리를 한다. = 직렬화
    // -----> 읽어 들일 때에는 역직렬화가 자동으로 처리된다.
    //        ** 바이트 단위로 나열된 값들을 다시 각 자료형별 필드값으로 바꾸는 것

    // 직렬화 처리 방법
    // 직렬화를 적용할 클래스 헤더에 java.io.Serializable 인터페이스 상속 처리함
    //   class 클래스명 implements Serializable {}

    private String name;
    private int age;
    private String address;
    private String phone;

    // transient : 해당 필드는 직렬화하지 않겠다. 라는 예약어
    private /* transient */ double height;
    private double weight;

    public Member() {

    }

    public Member(String name, int age, String address, String phone, double height, double weight) {
        super();
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Member [name=" + name + ", age=" + age + ", address=" + address + ", phone=" + phone + ", height="
                + height + ", weight=" + weight + "]";
    }




}









