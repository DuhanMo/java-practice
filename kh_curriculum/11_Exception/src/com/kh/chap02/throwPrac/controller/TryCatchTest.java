package com.kh.chap02.throwPrac.controller;


import java.io.*;

public class TryCatchTest {

    public void ioTest() {

        // 자바 프로그램은 시스템에 따라 어떠한 글을 작성하는 입력자원(System.in)과
        // 화면에 내용을 출력하는 출력자원(System.out)을 직접 사용할 수 없다.
        // 즉, 입출력자원은 운영체제로부터 받기 때문에 사용한 이후에 다시 돌려줘야 한다.
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("test.dat"));

            String s = "";
            do {
                // readLine() 메소드는 주어진 파일에서 엔터값 전까지
                // 한줄 한줄 읽어오는 메소드 이다.
                s = br.readLine();

                if (s != null) {
                    System.out.println(s);
                }
            } while (s != null);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // unchecked Exception
                // 실행할 때 발생할 수도 있는 예외상황으로
                // 무조건 발생하는 것이 아니라
                // 상황에 따라서 발생 여부가 결정되는 런타임에러의 한 종류.
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void ioTest2()  {
        // java 7 버전에서 추가된 기능
        // try with resource 구문
        // try 안에 작성된 입출력 자원(도구)를 직접 close()를 통해 반납하지 않고
        // 해당구문이 종료되었을 때 자동으로 반납하는 예외처리 구문이다.
        // try(반납할 자원 정의){
        // ...
        // }catch(Exception e){
        //...
        //}


        try ( // 입력개체
              BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
              // 출력객체
              BufferedWriter bout = new BufferedWriter(new OutputStreamWriter(System.out));){
            System.out.print("숫자 한개 입력 : ");

            // 무조건 문자열만 받아온다.
            String str = bin.readLine();

            int num = Integer.parseInt(str);

            bout.write("입력한 숫자의 2배의 값 : " + (num*2));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
