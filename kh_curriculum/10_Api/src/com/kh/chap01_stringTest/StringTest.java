package com.kh.chap01_stringTest;

import com.sun.org.apache.xerces.internal.xs.XSIDCDefinition;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.StringTokenizer;

public class StringTest {
    /*
     *
     *;
     * 1.
     * API란?
     * API (Application Programming Interface, 응용프로그램 인터페이스)
     * 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있게 만든 인터페이스를 뜻한다.
     * --> 자바를 사용하면서 코딩을 쉽게 할 수 있도록 만들어 놓은것
     *
     * 2. String의 특성
     *   1) 불변형이다.
     *   2) 값이 변경될 때마다 Heap영역의 문자열 저장소(String pool)에 값을 일일히 저장한다.
     *   3) 이미 동일한 값이 저장되어있다면, 문자열저장소에서 동일한 값을 꺼내오며 새로만들지 않는다.
     *
     * */
    public void method1() {
        // String은 내부적으로 hashcode와 equals가 오버라이딩 되어
        // 있기 때문에 같은 값을 입력하면 Sting 참조 변순명은 같은 주소를 가리킨다.
        // 1. 문자열을 리터럴로 생성
        // java 6 이하에서는 permGen영역에 String pool을 저장해 놓았는데
        // PermGen영역은 Runtime에 확장할 수 없는 capacity를 가지고 있기 때문에
        // intern 되는 String값이 너무 많아지면 OutOfException을 맞게될 확률이 높다
        // java 7 부터 heap에 저장하게 변경되었다.

        String str = "abc";
        String str1 = "abc";
        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());

        // 2. 생성자를 통한 문자열 생성
        String str2 = new String("abc");
        String str3 = new String("abc");

        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        //System.
        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(str1));
        System.out.println("========= new 사용 후 같은 값 ===========");
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));

    }

    public void method2() {


        String str1 = "abc";

        System.out.println(str1.charAt(0));
        // concat (합치기 )
        System.out.println(str1.concat("def"));
        // contains (포함여부)
        System.out.println(str1.contains("ab"));
        // equals (비교)
        System.out.println(str1.equals("abc"));

        System.out.println(str1.length());

        System.out.println(str1.toUpperCase());
        // substring(잘라내기)
        String str2 = "Hello World";
        //             0123456789
        System.out.println(str2.substring(1, 6));
        //trim (공백제거)
        String str3 = "                      abc";
        System.out.println(str3);

        System.out.println(str3.trim());

        // split(문자 구분)
        String str4 = "a,b,c,d";
        String[] strArr = str4.split(",");
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }
        // StringTokenizer
        // java.util 에 존재
        // split과 둘의 차이점이라고 한다면 split은 String 클래스의 메소드로 추출한 문자를 배열로 저장하고,
        // StringTokenizer 은 메소드가 아니라 java.util에 포함되어 있는 자체 클래스이다.
        // countToken, nextToker, hasMoreTokens
        // countToken : 메소드로 토큰 수 파악
        // nextToken : 토큰 읽어오기
        // hasMoreTokens : 토큰이 남아있는지 확인후 nextToken 으로 토큰을 읽어온다.


        String strToken = "모두한,22,인천 연수구 청학동,남";
        StringTokenizer st = new StringTokenizer(strToken, ",");
        System.out.println(st.countTokens());
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        // join()
        // 특정 문자열 배열을 하나의 문자열로 만들어주는 메소드
        // 원본은 변하지 않고 별도의 사본을 만들어 실행한다
        System.out.println(String.join("/", strArr));
    }

    public void method3() {
        // HelloWorld
        // H
        // He
        // Hel
        // Hell
        // ...
        // 별도의 임의의 임시공간 (buffer)을 만들어서
        //문자열변경과정을 다 처리한 결과만을 문자열 저장소에 반환하는 클래스를 제공하는데
        // StringBuffer / StringBuilder
        // StringBuffer에서는 동시제어에 대한 Thread Safe 기능을 제공하는데
        // StringBuilder는 제공을 하지 않는다.
        String strTmp = "H";
        System.out.println(strTmp.hashCode());
        strTmp += "ello";
        System.out.println(strTmp.hashCode());


        StringBuffer buf = new StringBuffer();
        System.out.println(buf.hashCode());

        buf.append("H");
        System.out.println(buf.hashCode());
        buf.append("ello");
        System.out.println(buf.hashCode());

        String str1 = buf.toString();

        System.out.println(str1);
        System.out.println(str1.hashCode());
        System.out.println("==============");
        String str = "반가워";
        System.out.println("str 기존 : " +str + ", 주소 : "+str.hashCode());
        str += "난 string 이라고 해";
        System.out.println("str 추가 후 : " +str + ", 주소 : "+str.hashCode());

        StringBuffer sbf = new StringBuffer( "안녕!");
        System.out.println("sbf.capacity() : " + sbf.capacity());
        System.out.println("sbf.length() : " + sbf.length());
        System.out.println("sbf 기존 : " + sbf + ", 주소  : " + sbf.hashCode());
        sbf.append("난 StringBuffer야 ");
        System.out.println("sbf 추가 : " + sbf + ", 주소후 : " + sbf.hashCode());
        System.out.println("sbf.capacity() : " + sbf.capacity());

        StringBuilder sbd = new StringBuilder("안녕!!!");
        System.out.println(sbd.capacity());
        System.out.println("sbd 기존 : " + sbd + ", 주소  : " + sbd.hashCode());
        sbd.append("난 StringBuilder야");
        System.out.println("sbd 추가 후 : " + sbd + ", 주소  : " + sbd.hashCode());

        sbd.append("내가 따라간다.").append("나도 따라간다.");
        System.out.println(sbd);

        sbd.insert(2,"배가고파요");
        System.out.println(sbd);
        sbd.delete(0,7);
        System.out.println(sbd);
    }




}
