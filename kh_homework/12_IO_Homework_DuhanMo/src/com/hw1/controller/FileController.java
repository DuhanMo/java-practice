package com.hw1.controller;

import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class FileController {
    Scanner sc = new Scanner(System.in);

    public FileController() {
    }

    public void fileSave() {
        StringBuilder sb = new StringBuilder();
        String content = null;
        System.out.println("파일에 저장할 내용을 입력하시오(\\\"exit\\\"을 입력하면 내용 입력 끝) ");
        while (true) {
            content = sc.nextLine();

            if (content.equalsIgnoreCase("exit")) break;
            else {
                sb.append(content);
                sb.append("\n");
            }
        }

        System.out.print("저장하시겠습니까? (y/n) : ");
//        String save =

        if (sc.next().equalsIgnoreCase("y")) {
            BufferedWriter bw = null;
            try {
                sc.nextLine();
                System.out.print("제목을 입력해주세요 : ");
                String title = sc.nextLine();
                bw = new BufferedWriter(new FileWriter(title + ".txt"));
                bw.write(sb.toString());
                System.out.println("입력받은 파일명.txt 파일에 성공적으로 저장하였습니다.");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        } else {
            System.out.println("다시 메뉴로 돌아갑니다");
        }


    }

    public void fileOpen() {
        System.out.println("열기 할 파일명 : ");
        String title = sc.nextLine();
        BufferedReader br = null;
        String content = null;
        try {

            br = new BufferedReader(new FileReader(title + ".txt"));
            while ((content = br.readLine()) != null) {
                System.out.println(content);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public void fileEdit() {
        BufferedReader br = null;
        BufferedWriter bw = null;
        System.out.print("수정 할 파일명 : ");
        String title = sc.next();
        sc.nextLine();
        String content;
        String add;
        StringBuilder sb = new StringBuilder();

        try {
            br = new BufferedReader(new FileReader(title + ".txt"));
            bw = new BufferedWriter(new FileWriter(title + ".txt",true));
            while((content = br.readLine())!=null){
                System.out.println(content);
            }
            System.out.print("파일에 추가할 내용을 입력하시오(\\\"exit\\\"을 입력하면 내용 입력 끝) : ");

            while(true){
                add = sc.nextLine();

                if(add.equalsIgnoreCase("exit")){
                    break;
                }else{
                    sb.append(add);
                    sb.append('\n');
                }

            }
            System.out.print("변경된 내용을 파일에 추가하시겠습니까?(y/n)");

            String save = sc.nextLine();
            if(save.equalsIgnoreCase("y")){
                bw.write(sb.toString());
                System.out.println(title + ".txt 파일의 내용이 변경되었습니다.");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                br.close();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }




    }


}
