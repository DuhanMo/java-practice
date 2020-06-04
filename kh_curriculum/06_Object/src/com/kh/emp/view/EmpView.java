package com.kh.emp.view;

import com.kh.emp.model.vo.Employee;

import java.util.Scanner;

public class EmpView {
    private Employee emp = null;

    public static void empView() {
        Scanner sc = new Scanner(System.in);
        EmpView ev = new EmpView();
        do{
            System.out.println("-------- 000's 사원 관리 프로그램 ----------");
            System.out.println("1. 사원 정보 입력 ");
            System.out.println("2. 사원 정보 수정 ");
            System.out.println("3. 사원 정보 삭제 ");
            System.out.println("4. 사원 정보 조회 ");
            System.out.println("9. 프로그램 종료 ");
            System.out.println("---------------------------------------");
            System.out.print("메뉴를 입력하세요 : ");
            int select = sc.nextInt();
            switch (select){
                case 1: ev.empInsert();break;
                case 2: ev.empUpdate();break;
                case 3: ev.empDelete();break;
                case 4: ev.printEmployee();break;
                case 9:
                    System.out.println("프로그램 종료");
                    return;
                default:
                    System.out.println("다시 입력하세요.");

            }
        }while(true);
    }

    public void empInsert() {
        Scanner sc = new Scanner(System.in);

        System.out.println("사원 정보 입력 페이지 입니다. ");

        System.out.print("이름 입력 : ");
        String name = sc.next();

        System.out.print("사번 입력 : ");
        int empNo = sc.nextInt();

        System.out.print("나이 : ");
        int age = sc.nextInt();

        System.out.print("연락처 : ");
        String phone = sc.next();

        System.out.print("급여 : ");
        int salary = sc.nextInt();
        emp = new Employee(name, empNo, age, phone, salary);
    }

    public void printEmployee() {
        emp.employeeInfo();
    }
    public void empUpdate() {
        printEmployee();
        Scanner sc = new Scanner(System.in);

        System.out.print("변경할 급여 : ");
        emp.setSalary(sc.nextInt());

        System.out.println("변경이 완료되었습니다. ");
    }
    public void empDelete() {
        emp = null;
        System.out.println("회원 정보가 삭제되었습니다. ");
    }
}
