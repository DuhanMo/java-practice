package com.kh.chap02_AbstractAndInterface.part01_easy.model.vo;

public interface Basic {

    // 인터페이스에서의 필드는 항상 상수필드이다.
   /*public static final*/ double PI = 3.14;
   //인터페이스에서의 메소드는 항상 추상메소드이다.
   public abstract void eat(); //인터페이스에서의 메소드는 항상 추상메소드이다.
   void sleep();

}
