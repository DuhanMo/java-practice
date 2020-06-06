package com.hw2.run;

import com.hw2.controller.SetDate;

public class Run {
    public static void main(String[] args) {
        SetDate tw1 = new SetDate();
        System.out.println(tw1.todayPrint());
        System.out.println(tw1.setDay());
    }
}
