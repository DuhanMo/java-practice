package com.kh.chap01_inherit.after.model.vo;

public class Tv extends Product {
    // Product 클래스를 상속받아 구현하며, Product필드를 자신의 것처럼 사용할 수 있기 때문에
    // Tv 클래스는 공통적으로 Product 클래스에서 작성되지 않은 필드만 작성하면 된다.

    private int inch;

    public Tv(){super();}

    //모든 필드를 매개변수로 선언하는 생성자인 경우에 부모의 필드는 초기화되는 값까지 받는다.
    public Tv(String brand, String pCode, String name, int price, int inch) {
        super(brand, pCode, name, price);
        this.inch = inch;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    public String information() {

//        return super.getBrand(); // 부모의 필드를 가져다쓸때 private 선언한건 접근 불가능
        //단 접근제한자가 protected 인 경우에는 바로 접근이 가능하다.
//        return super.name;
        return super.information() + "Tv{" +
                "inch=" + inch +
                '}';
    }
}
