package com.kh.chap01_stringTest;

import com.sun.org.apache.xerces.internal.xs.XSIDCDefinition;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

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
    }

}
