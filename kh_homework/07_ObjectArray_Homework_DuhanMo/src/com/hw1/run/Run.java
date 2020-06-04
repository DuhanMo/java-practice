package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {
    public static void main(String[] args) {
        Employee[] emp = new Employee[3];
        emp[0] = new Employee();
        emp[1] = new Employee(1, "모두한", 26, 'M', "010-2400-2811", "인천시");
        //public Employee(int empNo, String empName, String dept, String job,
        //                    int age, char gender, int salary, double bonusPoint, String phone, String address)
        emp[2] = new Employee(2, "홍길동", "웹개발", "대리",
                29, 'M', 2800000, 3.0, "010-2431-1234", "서울시");
        for (int i = 0; i < emp.length; i++) {
            System.out.println("emp[" + i + "] : " + emp[i].information());
        }
        System.out.println("===============================================================");
        emp[0].setEmpNo(0);
        emp[0].setEmpName("김김김");
        emp[0].setDept("인사과");
        emp[0].setJob("과장");
        emp[0].setAge(40);
        emp[0].setGender('W');
        emp[0].setSalary(4000000);
        emp[0].setBonusPoint(10.0);
        emp[0].setPhone("010-2444-2111");
        emp[0].setAddress("충북제천");
        System.out.println(emp[0].information());
        emp[1].setDept("백엔드");
        emp[1].setJob("사원");
        emp[1].setBonusPoint(5.0);
        emp[1].setSalary(3200000);
        System.out.println(emp[1].information());
        int sum = 0;
        for (int i = 0; i < emp.length; i++) {
            sum += (int) ((emp[i].getSalary() + emp[i].getSalary() * emp[i].getBonusPoint()) * 12);
            System.out.println(emp[i].getEmpName() + "의 연봉 : " + (int) ((emp[i].getSalary() + emp[i].getSalary() * emp[i].getBonusPoint()) * 12));
        }
        System.out.println("===============================================================");
        System.out.println("직원들의 연봉의 평균 : " + (sum / 3));
    }
}
