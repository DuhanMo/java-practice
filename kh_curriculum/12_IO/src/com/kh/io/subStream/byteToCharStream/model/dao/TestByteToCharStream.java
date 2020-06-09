package com.kh.io.subStream.byteToCharStream.model.dao;

import java.io.*;

public class TestByteToCharStream {
    // 바이트스트림을 문자 스트림으로 바꿔주는
    // 보조스트림을 테스트
    // 입력 : InputStreamReader 바이트로 들어온거를 문자로
    // 출력 : OutputStreamWriter 문자로 작성한 거를 바이트로

    public void fileSave() {
        try(
                OutputStreamWriter ow = new OutputStreamWriter(new FileOutputStream("sample2.dat"));
                ){
            ow.write("hello!!");
            ow.write("안녕하세요");

            System.out.println("파일 저장 완료!");
        } catch (IOException e) {
            System.out.println("파일 저장 중 문제가 발생했습니다.");
        }
    }
    public void fileOpen() {
        try(InputStreamReader ir = new InputStreamReader(new FileInputStream("sample2.dat"))){

            int value;
            while((value = ir.read())!= -1){
                System.out.print((char)value + " ");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
