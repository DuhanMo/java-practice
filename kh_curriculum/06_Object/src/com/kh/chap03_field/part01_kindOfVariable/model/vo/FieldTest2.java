package com.kh.chap03_field.part01_kindOfVariable.model.vo;

public class FieldTest2 {
    public String pubA = "public";
    //protected String proB -> 상속을 배워야지 확인이 가능(자손클래스까지)
//    protected String proB = "protected";
    /*default*/ String defB = "default";
    private String priC = "private";

    // 접근제한자 + 클래스 변수
    public static String pubSta = "public static";
    private static String priSta = "private static";

    public FieldTest2() {

    }
    //pubA,defB,priC의 getter/setter 생
    public String getPubA() {
        return pubA;
    }

    public String getDefB() {
        return defB;
    }

    public String getPriC() {
        return priC;
    }

    public static String getPubSta() {
        return pubSta;
    }

    public static String getPriSta() {
        return priSta;
    }


    public void setPubA(String pubA) {
        this.pubA = pubA;
    }

    public void setDefB(String defB) {
        this.defB = defB;
    }

    public void setPriC(String priC) {
        this.priC = priC;
    }

    // Static 변수는 this 를 쓰지 않는다.
    public void setPubSta(String pubSta) {
        pubSta = pubSta;
    }
    public void setPriSta(String priSta) {
        priSta = priSta;
    }


    //pubA,defB,priC의 getter/setter 생

    public static void printMethod(){
        System.out.println("출력 메소드용");
    }
}
