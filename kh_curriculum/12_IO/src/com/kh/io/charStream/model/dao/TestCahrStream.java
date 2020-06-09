package com.kh.io.charStream.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestCahrStream {
    // 문자 기반 데이터 입출력 테스트
    // 입력 : Reader 문자로 들어온걸 문자로 입력
    // 출력 : Writer 문자로 입력된걸 문자로 출력

    public void fileOpen() {
        try (
                FileReader fr = new FileReader("sample.txt");
        ) {
            int value;
            while ((value = fr.read()) != -1) {
                System.out.print((char) value + " ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void fileSave() {

        try(
                FileWriter fw = new FileWriter("sample.txt");
        )

        {
            fw.write("i am DuhanMo writer");
            fw.write("\n I'm full");

            char[] chArr = {'a' , 'b' , 'c' , 'd' };
//            fw.write(chArr);
            for (int i = 0; i < chArr.length; i++) {
                fw.write("\n" + chArr[i]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
