package com.kh.emp.model.vo;

public class Employee {
    // 사원 정보 클래스
    // 1. 필드
    private String name;    // 사원명
    private int empNo;      // 사원 번호
    private int age;        // 사원 나이
    private String phone;   // 연락처
    private int salary;     // 월급

    // 2. 생성자
    public Employee() {

    }

    // 3. getter/setter
    public Employee(String name, int empNo, int age, String phone, int salary) {
        this.name = name;
        this.empNo = empNo;
        this.age = age;
        this.phone = phone;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void employeeInfo() {
        System.out.println("사원 명 : " + name);
        System.out.println("사원 번호 : " + empNo);
        System.out.println("나이 : " + age);
        System.out.println("연락처 : " + phone);
        System.out.println("급여 : " + salary);
    }



}
