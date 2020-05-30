package com.hw1.run;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        Student[] stArr = new Student[3];
        //  public Student(String name, int age, double height, double weight, int grade, String major)
        stArr[0] = new Student("홍길동",20,178.2,70.0,1,"정보시스템공학과");
        stArr[1] = new Student("김말똥",21,187.3,80.0,2,"경영학과");
        stArr[2] = new Student("강개순",23,167.0,45.0,4,"정보통신공학과");
        for (Student value : stArr){
            System.out.println(value.information());
        }
        // public Employee(String name, int age, double height, double weight, int salary, String dept)
        Employee[] empArr = new Employee[10];
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(true){
            System.out.print("사원 이름 : ");
            String name = sc.nextLine();
            System.out.print("사원 나이 : ");
            int age = sc.nextInt();
            System.out.print("사원 신장 : ");
            double height = sc.nextDouble();
            System.out.print("사원 몸무게 : ");
            double weight = sc.nextDouble();
            System.out.print("사원 급여 : ");
            int salary = sc.nextInt();
            sc.nextLine();
            System.out.print("사원 부서 : ");
            String dept = sc.nextLine();

            empArr[count] = new Employee(name, age, height, weight, salary, dept);
            count++;
            System.out.print("계속 추가하시려면 y 또는 Y를 입력해주세요 : ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            if(!(ch == 'y' || ch == 'Y')) break;


        }
        for (int i = 0; i < count; i++){
            System.out.println(empArr[i].information());
        }


    }
}
