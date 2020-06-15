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

        JButton north = new JButton("북~~!!");
//        JButton south = new JButton("남");
//        JButton east = new JButton("동");
//        JButton west = new JButton("서");
//        JButton center = new JButton("중앙");
//        // 위치 값은 정해져있는 것이기 때문에 대소문자를 무조건 구분해주어야 한다.
//        this.add(north,"North");
//        this.add(south,"South");
//        this.add(east,"East");
//        this.add(west,"West");
//        this.add(center,"Center");
        this.add(new JButton("북~~!!"),"North");
        this.add(new JButton("남"),"South");
        this.add(new JButton("동"),"East");
        this.add(new JButton("서"),"West");
        this.add( new JButton("중앙"),"Center");

    }
}
