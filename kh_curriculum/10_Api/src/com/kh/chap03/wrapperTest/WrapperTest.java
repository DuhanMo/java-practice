package com.kh.chap03.wrapperTest;

public class WrapperTest {
    // 1, WrapperClass
    // 프로그램에 따라 기본타입의 데이터를 객체로 취급해야하는 경우가 있다.
    // ex) 메소드의 인수로 객체 타입만 요구될때
    //     다형성을 적용하고 싶을 때
    //     Object에 있는 메소드를 사용하고 싶을 때
    // 위 같은 상황에서는 기본 타입의 데이터를 그대로 사용할 수 없기 때문에
    // 객체로 변환한 후에 작업을 수행해야한다.
    // 8개의 기본 타입에 해당하는 데이터를 객체로 포장해주는 클래스가 래퍼클래스

    //java.lang 패키지에 포함되어있다.

    //Boxing : 기본자료형, String을 Wrapper 클래스로 바꾸는 법(AutoBoxing : 자동으로 처리됨)
    //UnBoxing : Wrapper클래스 > 기본자료형 (AutoUnBoxing : 자동으로 처리됨)

    //String과 WrapperClass 간에는 서로 변환이 가능
    public void method1() {
        // Boxing
        Integer i = new Integer(10);
        Integer i2 = new Integer(15);
        Double d = new Double(10.0);
        System.out.println(i.equals(i2));
        System.out.println(i.compareTo(i2));
        // 0: 비교해서 같을 때, 양수: i가 큰거, 음수: i2가 큰거
        // AutoBoxing
        Short i3 = 10;
        Integer i4 = 5;


        // UnBoxing
        // wrapperr --> 기본자료형
        int pi = i.intValue();
        double pd = d.doubleValue();

        // AutoUnBoxing

        int a = i;
        int b = i2;
        System.out.println(a+b);

        // String to Integer
        Integer sti = new Integer("12");

        int sti2 = new Integer("300");

        System.out.println("==========================================");
//        byte b1 = Byte.parseByte("1");
//        short s = Short.parseShort("2");
//        int i6 =   Integer.parseInt("3");
//        long l = Long.parseLong("4");
//        float f = Float.parseFloat("0.1");
//        double d1 = Double.parseDouble("0.2");
//        boolean b2 = Boolean.parseBoolean("true");
//        System.out.println(b1);
//        System.out.println(s);
//        System.out.println(i6);
//        System.out.println(l);
//        System.out.println(f);
//        System.out.println(d1);
//        System.out.println(b2);

//        byte b1 = Byte.valueOf("1");
//        short s = Short.valueOf("2");
//        int i6 =   Integer.valueOf("3");
//        long l = Long.valueOf("4");
//        float f = Float.valueOf("0.1");
//        double d1 = Double.valueOf("0.2");
//        boolean b2 = Boolean.valueOf("true");
//        System.out.println(b1);
//        System.out.println(s);
//        System.out.println(i6);
//        System.out.println(l);
//        System.out.println(f);
//        System.out.println(d1);
//        System.out.println(b2);
        String b1 = Byte.valueOf("1").toString();
        String s = Short.valueOf("2").toString();
        String i6 =   Integer.valueOf("3").toString();
        String l = Long.valueOf("4").toString();
        String f = Float.valueOf("0.1").toString();
        String d1 = Double.valueOf("0.2").toString();
        String b2 = Boolean.valueOf("true").toString();
        System.out.println(b1);
        System.out.println(s);
        System.out.println(i6);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d1);
        System.out.println(b2);


    }

}
