package com.kh.test.shape.controller;

import com.kh.test.shape.model.vo.Circle;
import com.kh.test.shape.model.vo.RectAngle;


public class ShapeMaker {
    public static void main(String[] args) {
        Circle[] cArr = {new Circle(20), new Circle(40), new Circle(50)};
        for (int i = 0; i < cArr.length; i++) {

            cArr[i].draw();
        }
        System.out.println();

        RectAngle[] rArr = {new RectAngle(20, 20), new RectAngle(50, 60)};
        for (int i = 0; i < rArr.length; i++) {

            rArr[i].draw();
        }


    }
}
