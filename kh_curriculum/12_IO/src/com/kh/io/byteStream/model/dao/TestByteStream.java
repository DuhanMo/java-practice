package com.kh.io.byteStream.model.dao;


import java.io.*;
import java.util.Arrays;

public class TestByteStream {
    // 특정 데이터를 바이트(Byte)단위로 읽고 쓸 수 있는
    // 바이트 입출력 스트림 객체
    // 입력 : InputStream 바이트로 들어온걸 바이트
    // 출력 : OUtputStream 바이트로 입력된걸 바이트로

    public void fileOpen() {
        // 특정 파일로부터 데이터를 byte 단위로 읽어오는 스트림
        FileInputStream fin = null;

        try {
            // 읽어오려는 파일이 없으면
            // fileNotFoundException이 발생한다.
            // 따라서 해당 예외를 반드시 처리해야 한다.
            fin = new FileInputStream("test.dat");


            // 파일 사이즈 확인하기
            int fileSize = (int) (new File("test.dat").length());
            System.out.println(fileSize);
            System.out.println("fileSize :" + fileSize);


//            byte[] readData = new byte[fileSize];
//            //배열에 굳이 넣는다?? 그냥 read랑 비교해보기
//            fin.read(readData);
//            System.out.println(Arrays.toString(readData));
//            for(int i =0; i < fileSize; i++){
//                System.out.print((char)readData[i] + " ");
//
//            }

            int value;
            // 프로그램이 파일의 끝을 확인할 때 마지막까지 데이터를 읽고
            // 그 이후 데이터가 없다면 -1울 반환하는데 그 값을 파일의 끝으로 사용할 수 있다.
            while ((value = fin.read()) != -1) {
                System.out.print((char) value + " ");

            }
            // 한글 데이터는 바이트 스트림으로 읽어올 떄
            // 글자가 깨지는 것을 확인할 수 잇고,
            // 그 뜻은 바이트 스트림이 1byte씩 읽기 때문에
            // 2byte인 한글은 되돌릴 수 없다


        } catch (FileNotFoundException e) {
            System.out.println("test.dat 파일이 없습니다.");
        } catch (Exception e) {
            System.out.println("파일을 읽어오는 중에 에러가 발생했습니다.");
        } finally {
            try {
                fin.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void fileOpen2() {
        //try ~ with ~ resource를 사용한 경우
        try (
                FileInputStream fin = new FileInputStream("test.dat");

        ) {
            int fileSize = (int)new File("test.dat").length();

            byte[] readData = new byte[fileSize];

            fin.read(readData);

            for(int i = 0; i<fileSize; i++){
                System.out.print((char)readData[i] + " ");
            }

        } catch (FileNotFoundException e) {
            System.out.println("파일이 존재하지 않습니다.");
        } catch (IOException e) {
            System.out.println("파일을 읽는 중 에러가 발생했습니다. ");
        }
    }

    public void fileSave() {
        // 특정 내용을 작성하여
        // 파일로 해당 내용을 출력하고(저장하고)

        FileOutputStream fout = null;

        try {
            // 만약 파일이 없을 경우 새로운 파일로 만들어 저장하고
            // 파일이 이미 존재할 경우 덮어쓰기를 통해 파일을 저장한다.
            fout = new FileOutputStream("test.dat"); // 덮어쓰기
            // 매개변수로 true값을 주면 덮어쓰기가 아닌 이어쓰기로 동작한다.

//            fout = new FileOutputStream("test.dat",true);// 이어쓰기
            fout.write(97);
            fout.write(98);
            fout.write(99);
            fout.write('C');

            byte[] writeData = {10, 20, 30, 40, 50};
            fout.write(writeData);
            fout.write(writeData, 0, 3);

        } catch (FileNotFoundException e) {
            System.out.println("file has not founded");
        } catch (IOException e) {
            System.out.println("입력 도중 에러 발생");
        } finally {
            try {
                fout.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    public void fileSave2(){
        try(
                FileOutputStream fout = new FileOutputStream("test1.dat");
                ) {
            fout.write(97);
        }
        // 파일이 없다면 자동으로 생성하기 때문에 에외처리 안해도된다.
        /*catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}
