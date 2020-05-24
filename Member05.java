package com.kh.practice;


class InitBlock2 {
    static int classVar = 10;
    int instaceVar = 10;

    static {
        classVar = 20;
    }

    {
        instaceVar = 20;
    }

//    InitBlock.classVar = 500;
}

public class Member05 {
    public static void main(String[] args) {
        InitBlock.classVar = 5000;
        System.out.println(InitBlock.classVar);
        System.out.println(InitBlock2.classVar);

    }

}
