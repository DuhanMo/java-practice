package com.kh.chap02_AbstractAndInterface.part02_difficult.run;

import com.kh.chap02_AbstractAndInterface.part02_difficult.controller.ProductManager;
import com.kh.chap02_AbstractAndInterface.part02_difficult.model.vo.Product;

public class Run {
    public static void main(String[] args) {
        ProductManager pm = new ProductManager();
        pm.testPolymorphism();
    }
}
