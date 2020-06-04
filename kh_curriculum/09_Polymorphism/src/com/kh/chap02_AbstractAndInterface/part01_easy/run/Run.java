package com.kh.chap02_AbstractAndInterface.part01_easy.run;

import com.kh.chap02_AbstractAndInterface.part01_easy.model.vo.Baby;
import com.kh.chap02_AbstractAndInterface.part01_easy.model.vo.Basic;
import com.kh.chap02_AbstractAndInterface.part01_easy.model.vo.Family;
import com.kh.chap02_AbstractAndInterface.part01_easy.model.vo.Mother;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Run {
    public static void main(String[] args) {
        Family f1 = new Mother("유엄마",50,70,"출산");

        Family f2 = new Baby("유아기",3.5,70);


        System.out.println(f1);
        System.out.println(f2);
//        f1.eat(); //엄마밥먹음
//        f2.eat(); //아기밥먹음
//        f1.sleep();
//        f2.sleep();

        System.out.println("=== 다음날 ===");
        System.out.println(f1);
        System.out.println(f2);
        f1.overrideTest();
        f2.overrideTest();
        // 2. interface
//        Basic b = new Basic(); // 인터페이스도 생성 안된다.
        Basic b1;
        Basic b2;

        b1 = new Mother("유엄마",50,70,"출산");
        b2 = new Baby("유아기",3.5,70);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println("===============");
        ((Mother)b1).overrideTest();//Mother 클래스에서는 Family의 overrideTest메소드를 오버라이딩 하지 않아서.
        ((Baby)b2).overrideTest();

    }



}

