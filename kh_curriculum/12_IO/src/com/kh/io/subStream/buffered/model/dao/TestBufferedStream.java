package com.kh.io.subStream.buffered.model.dao;

import java.io.*;

public class TestBufferedStream {
    // 입력 혹은 출력에 대한 임시 저장공간을 만들어서
    // 데이터를 한번에 처리하는 보조 스트림
    // 입력 : BufferedInputStream / BufferedReader  바이트로 들어온걸 바이트로 / 문자로 들어온걸 문자로
    // 출력 : BufferedOutputStream/ BufferedWriter  바이트를 읽어서 바이트로 출력/ 문자로 읽어서 문자로 출력

    public void fileSave() {
        try (
                BufferedWriter bw = new BufferedWriter(new FileWriter("sample2.dat"));
        ) {

            bw.write("hello \n");
            bw.write("too hot Today");

            // 현재까지 작성한 내용을 전부 전송하여 처리하고 현재 버퍼를 비운다.
            bw.flush();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fileRead() {
        try (
                BufferedReader br = new BufferedReader(new FileReader("sample3.dat"))
        ) {

            String tmp;
            while((tmp = br.readLine()) != null) {
                System.out.println(tmp);
            }
//            System.out.println(br.readLine());
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
