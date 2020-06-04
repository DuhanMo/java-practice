package silsub7.run;

import silsub7.model.vo.Employee;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {


//        Employee emp1 = new Employee("모두한","인사과",26,'M',3000000,"010-2400-2811","인천광역시 연수구");
//        Employee emp2 = new Employee("홍길동","유지보수과",30,'M',2400000,"010-0000-3333","서울특별시 강서구");
//        Employee emp3 = new Employee();


//        System.out.println(emp1.intformation());
//        System.out.println(emp2.intformation());
//        System.out.println(emp3.intformation());

        Employee emp1 = null;
        Employee emp2 = null;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.print("사원명 : ");
            String empName = sc.nextLine();
            System.out.print("부서명 : ");
            String dept = sc.nextLine();
            System.out.print("나이 : ");
            int age = sc.nextInt();
            System.out.print("성별 : ");
            char gender = sc.next().charAt(0);
            System.out.print("급여 : ");
            int salary = sc.nextInt();

            sc.nextLine();

            System.out.print("전화번호 : ");
            String phone = sc.nextLine();
            System.out.print("주소 : ");
            String address = sc.nextLine();

            if (i == 0) {
                emp1 = new Employee(empName, dept, age, gender, salary, phone, address);
            } else {
                emp2 = new Employee(empName, dept, age, gender, salary, phone, address);
            }
        }
        System.out.println(emp1.intformation());
        System.out.println(emp2.intformation());
    }



}

