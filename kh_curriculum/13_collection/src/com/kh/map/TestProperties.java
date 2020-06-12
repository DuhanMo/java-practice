package com.kh.map;

import java.io.*;
import java.util.Properties;

public class TestProperties {
    // Properties :
    //      어떠한 프로그램을 실행할 떄
    //      함께 읽어오는 설정들(언어설정, 화면사이즈 등등)을
    //      저장하는 파일을 말한다.
    //      XML방식으로 대체되었으나
    //      아직 많은 응용프로그램들이 이 파일을 설정파일로써 사용하고 있다.
    //      Properties는 key와 value로 이루어진 map형식을 가지고 있으나
    //      key와 value 모두 문자열 형태로 저장하여 사용한다.

    Properties prop = new Properties();

    public void method1() {
        // 값을 저장할때에는 setProperty() 메소드를 사용
        prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
        prop.setProperty("url", "jdbc:oracle:thin:@localhost:1521:XE");
        prop.setProperty("username", "student");
        prop.setProperty("password", "student");
        prop.setProperty("한글", "깨지나");

        System.out.println(prop);

        // Properties를 업데이트 하고 재저장하려면 store() 메소드를 사용
        try {
            prop.store(new FileOutputStream("driver.dat"), "jdbc driver");
            prop.store(new FileWriter("driver.txt"), "jdbc driver");
            System.out.println("저장완료");

            prop.storeToXML(new FileOutputStream("driver.xml"), "jdbc driver");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void method2() {
        // properties로 지정한 설정을 읽어오는 방법
        try {
//            prop.load(new FileInputStream("driver.dat"));
//            prop.load(new FileReader("driver.txt"));
            prop.loadFromXML(new FileInputStream("driver.xml"));
            System.out.println(prop.getProperty("driver"));
            System.out.println(prop.getProperty("url"));
            System.out.println(prop.getProperty("username"));
            System.out.println(prop.getProperty("password"));
            System.out.println(prop.getProperty("한글"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
