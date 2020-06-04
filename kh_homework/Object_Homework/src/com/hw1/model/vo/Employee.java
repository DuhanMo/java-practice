package com.hw1.model.vo;

import java.util.Scanner;

public class Employee {
    private int empNo;
    private String empName;
    private String dept;
    private String job;
    private int age;
    private char gender;
    private int salary;
    private double bonusPoint;
    private String phone;
    private String address;

    public Employee() {
    }

    public Employee(int empNo, String empName, String dept, String job, int age, char gender, int salary, double bonusPoint,
                    String phone, String address) {
        this.empNo = empNo;
        this.empName = empName;
        this.dept = dept;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.bonusPoint = bonusPoint;
        this.phone = phone;
        this.address = address;

    }

    Scanner sc = new Scanner(System.in);

    public void empInput() {

        System.out.print("사원 번호 : ");
        empNo = sc.nextInt();
        sc.nextLine();
        System.out.print("사원 이름 : ");
        empName = sc.nextLine();
        System.out.print("부서 : ");
        dept = sc.nextLine();
        System.out.print("직급 : ");
        job = sc.nextLine();
        System.out.print("나이 : ");
        age = sc.nextInt();
        System.out.print("성별 : ");
        gender = sc.next().charAt(0);
        System.out.print("급여 : ");
        salary = sc.nextInt();
        System.out.print("보너스 : ");
        bonusPoint = sc.nextDouble();
        sc.nextLine();
        System.out.print("전화번호 : ");
        phone = sc.nextLine();
        System.out.print("주소 : ");
        address = sc.nextLine();

        new Employee(empNo, empName, dept, job, age, gender, salary, bonusPoint, phone, address);

    }


    public String empOutput() {
        return "Employee{" +
                "empNo=" + empNo +
                ", empName='" + empName + '\'' +
                ", dept='" + dept + '\'' +
                ", job='" + job + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                ", bonusPoint=" + bonusPoint +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setBonusPoint(double bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
