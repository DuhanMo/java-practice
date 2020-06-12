package com.kh.chap01_container.view;


import javax.swing.*;

public class JFrameView2 {

    public JFrameView2()   {}

    public void showFrame() {
//        JFrame mainFrame = new JFrame(); // JFrame 객체 생성
//        mainFrame.setTitle("myFrame2");

        // 프레임 생성과 동시에 이름 설정
        JFrame mainFrame = new JFrame("myFrame2");

        mainFrame.setLocation(300,200);
        mainFrame.setSize(800,500);

        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}