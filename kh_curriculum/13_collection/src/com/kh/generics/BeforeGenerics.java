package com.kh.generics;


import java.util.ArrayList;

// 하나의 파일 안에 여러개의 클래스를
// 작성할 수 있는데 이 때에는
// 해당파일을 대표하는 클래스 반드시 선언하여야 한다.
// 해당 파일을 대표하는 클래스는 class 옆에 public을 사용하고,
// 하나의 파일에 반드시 한개만 public class로 선언할 수 있다.
public class BeforeGenerics {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add(new String("12345"));
        list.add(new Book());
        list.add(new Student());
        list.add(new Car());
        System.out.println("저장된 객체 수 : " + list.size());

        // 책만 꺼내고 싶어요
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if(obj instanceof Book){
                System.out.println("책 객체 : " + obj);
            }
        }

    }
}

class Book {
    private String bNo;

    public Book() {
    }

    public Book(String bNo) {
        this.bNo = bNo;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bNo='" + bNo + '\'' +
                '}';
    }
}

class Student {
    private String stuNo;

    public Student() {
    }

    public Student(String stuNo) {
        this.stuNo = stuNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNo='" + stuNo + '\'' +
                '}';
    }
}

class Car {
    private String mode;

    public Car() {
    }

    public Car(String mode) {
        this.mode = mode;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mode='" + mode + '\'' +
                '}';
    }
}