package com.kh.io.subStream.objectStream.model.dao;

import com.kh.io.subStream.objectStream.model.vo.Member;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestObjectIO {
    public void fileSave(){
        Member[] mArr = {
                new Member("홍길동", 10, "서울","010",120.0,120.0),
                new Member("박길동", 20, "대구","013",180.0,79.0),
                new Member("김유동", 30, "대구","017",150.0,50.0)
        };

        try(ObjectOutputStream oOut = new ObjectOutputStream(new FileOutputStream("member.txt"))){

            for (int i = 0; i < mArr.length; i++){
                oOut.writeObject(mArr[i]);
            }
            oOut.flush();

            System.out.println("객체 저장이 완료되었습니다. ");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
