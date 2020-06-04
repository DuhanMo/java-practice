package com.kh.chap02_AbstractAndInterface.part02_difficult.controller;

import com.kh.chap02_AbstractAndInterface.part02_difficult.model.vo.Gallaxy;
import com.kh.chap02_AbstractAndInterface.part02_difficult.model.vo.Product;
import com.kh.chap02_AbstractAndInterface.part02_difficult.model.vo.SmartPhone;
import sun.plugin.perf.PluginRollup;

public class ProductManager {
    public void testPolymorphism() {
        // 다형성 : 상속관계에 있는 클래스일때 부모클래스형 레퍼런스가 후손 객체의 주소를 기록 저장할 수 있다.
        Product p1 = new SmartPhone();
        Product p2 = new Gallaxy();

        System.out.println(p1);
        System.out.println(p2);

        Object obj1 = p1;
        Object obj2 = p2;
        checkPrint(new Gallaxy());
        objectArrayTest();

    }

    public void checkPrint(Object obj) {
        // 부모 레퍼런스가 후손객체의 주소를 받는 과정에서 자동으로 클래스형변환이 발생한다.(업캐스팅)
        System.out.println(obj);
        System.out.println("=========instance of 한 결과 =============");
//        if(obj instanceof Gallaxy){
//            ((Gallaxy)obj).printGallaxy();
//        }
//        if(obj instanceof SmartPhone){
//            ((SmartPhone)obj).printSmartPhone();
//        }
//        if (obj instanceof Product) {
//            ((Product)obj).printProduct();
//        }

//        if (obj instanceof Gallaxy) {
//            ((Gallaxy) obj).printGallaxy();
//        } else if (obj instanceof SmartPhone) {
//            ((SmartPhone) obj).printSmartPhone();
//        } else if (obj instanceof Product) {
//            ((Product) obj).printProduct();
//        }
    }

    public void objectArrayTest() {

        Object[] arr = new Object[10];
        arr[0] = new String("문자열 객체");
        arr[1] = new java.util.Date();
//        arr[2] = new Product(); //추상 클래스는 객체 생성이 불가
        arr[3] = new Gallaxy();
        arr[4] = new SmartPhone();

        System.out.println("=================================");
        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);

            if (arr[i] instanceof Gallaxy) {
                ((Gallaxy) arr[i]).printGallaxy();
            } else if (arr[i] instanceof SmartPhone) {
                ((SmartPhone) arr[i]).printSmartPhone();
            } else if (arr[i] instanceof Product) {
                ((Product) arr[i]).printProduct();
            }

        }

    }

}
