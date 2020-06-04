package com.hw1.run;

import com.hw1.model.vo.Employee;

import java.util.Scanner;

public class EmpTest {
    public static void main(String[] args) {

        mainMenu();

    }

    public static void mainMenu() {
        Employee emp = new Employee();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("======== 메뉴 ========");
            System.out.println("1. 새 사원 정보 입력");
            System.out.println("2. 사원 정보 수정");
            System.out.println("3. 사원 정보 삭제 ");
            System.out.println("4. 사원정보 출력 ");
            System.out.println("9. 끝내기 ");
            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    emp.empInput();
                    break;
                case 2:
                    modifyMenu(emp);
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println(emp.empOutput());
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다. ");
                    return;
                default:
                    System.out.print("잘못입력하셨습니다. ");
                    break;
            }
        }
    }

    public static void modifyMenu(Employee e) {
        Employee emp = e;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("======== 수정 메뉴 ========");
            System.out.println("1. 이름 변경 ");
            System.out.println("2. 급여 변경 ");
            System.out.println("3. 부서 변경  ");
            System.out.println("4. 직급 변경 ");
            System.out.println("5. 이전 메뉴로 이동 ");
            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt();

            switch (menu){
                case 1:
                    sc.nextLine();
                    System.out.print("변경할 이름 : ");
                    String empName = sc.nextLine();
                    emp.setEmpName(empName);
                    break;
                case 2:
                    System.out.print("변경할 급여 : ");
                    int salary = sc.nextInt();
                    emp.setSalary(salary);
                    break;
                case 3:
                    sc.nextLine();
                    System.out.print("변경할 부서 : ");
                    String dept = sc.nextLine();
                    emp.setDept(dept);
                    break;
                case 4:
                    sc.nextLine();
                    System.out.print("변경할 직급 : ");
                    String job = sc.nextLine();
                    emp.setJob(job);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다. ");
                    break;
            }
        }
    }
}
