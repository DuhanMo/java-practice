package com.kh.io.subStream.objectStream.model.dao;

import java.io.*;

import com.kh.io.subStream.objectStream.model.vo.Member;

public class TestObjectIO {

    public void fileSave() {
        Member[] mArr = {
                new Member("홍길동",10,"서울","010",120.0,120.0),
                new Member("박길동",20,"대구","013",180.0,70.0),
                new Member("김유신",30,"서울","017",170.0,60.0)
        };

        try(
                ObjectOutputStream oOut = new ObjectOutputStream(new FileOutputStream("member.txt"));
        ){

            for (int i = 0; i < mArr.length; i++) {
                oOut.writeObject(mArr[i]);
            }

            oOut.flush();

            System.out.println("객체 저장이 완료되었습니다.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void fileOpen() {
        Member[] mArr = new Member[3];

        try(
                ObjectInputStream oin = new ObjectInputStream(new FileInputStream("member.txt"))
                ) {
            for (int i = 0; i < mArr.length; i++) {
                mArr[i] = (Member)oin.readObject();
            }

            for(Member m : mArr){
                System.out.println(m);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
