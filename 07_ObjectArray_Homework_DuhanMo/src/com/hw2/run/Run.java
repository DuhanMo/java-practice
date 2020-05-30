package com.hw2.run;

import com.hw2.model.vo.Student;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Student[] sArray = new Student[10];
        Scanner sc = new Scanner(System.in);

        int count = 0;

        //public Student(int grade, int classroom, String name, int kor, int eng, int math)
        while (true) {
            for (int i = 0; i < sArray.length; i++) {
                System.out.print("학년 : ");
                int grade = sc.nextInt();
                System.out.print("반 : ");
                int classroom = sc.nextInt();
                sc.nextLine();
                System.out.print("이름 : ");
                String name = sc.nextLine();
                System.out.print("국어점수 : ");
                int kor = sc.nextInt();
                System.out.print("영어점수 : ");
                int eng = sc.nextInt();
                System.out.print("수학점수 : ");
                int math = sc.nextInt();

                sArray[i] = new Student(grade, classroom, name, kor, eng, math);
                count++;
                if (count == 10) break;

                System.out.print("계속 추가하시려면 y 또는 Y를 눌러주십시오. ");
                char ch = sc.next().charAt(0);
                if(!(ch == 'y' || ch == 'Y')) break;
            }
           break;
        }
        int[] avg = new int[count];
        for (int i = 0; i < count; i++) {
            avg[i] = (sArray[i].getKor() + sArray[i].getEng() + sArray[i].getMath()) / 3;
            System.out.println("학생"+(i+1)+"의 정보 : " + sArray[i].information() + " 평균 = " + avg[i] + "}");
        }

    }
}
