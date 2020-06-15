package com.kh.chap02_layout.view;

import javax.swing.*;
import java.awt.*;

public class A_BorderLayout extends JFrame {
    public A_BorderLayout() {
        // 부모 생성자쪽으로 프레임 이름을 전달할 수 있다.
        super("BorderLayout");

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 프레임위치 및 크기 설정
        this.setBounds(300,300,800,500);

        // 다른 레이아웃을 쓰겠다 하면 지정을 새로해줘야함
        // LayoutManager인터페이스의 후손 클래스로 다양한 레이아웃 제공
        this.setLayout(new BorderLayout());


    }
}
