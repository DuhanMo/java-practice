package com.hw3.run;

import com.hw3.model.vo.Person;
import com.hw3.model.vo.Pet;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person person = new Person("홍길동", 19);
        Pet pet = new Pet("고양이", 5.5);

        System.out.println("현재 수치 ");
        person.printStatus();
        pet.printStatus();

        while (true) {
            System.out.println("===== 사람 =====");
            System.out.println("1. 먹기    2. 잠자기     3. 놀기");
            System.out.println("===== 애완동물 =====");
            System.out.println("4. 먹기    5. 잠자기     6. 놀기");
            System.out.println("9. 프로그램 종료");
            System.out.print("입력 : ");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    person.eat();
                    break;
                case 2:
                    person.sleep();
                    break;
                case 3:
                    person.playing();
                    break;
                case 4:
                    pet.eat();
                    break;
                case 5:
                    pet.sleep();
                    break;
                case 6:
                    pet.playing();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다. ");
                    return;
                default:
                    System.out.println("번호를 잘못 입력하셨습니다.");
                    break;

            }
        }

    }
}
