package com.kh.chap02_layout.view;

import javax.swing.*;
import java.awt.*;

public class F_PanelLayout extends JFrame {
    public F_PanelLayout() {
        // 레이아웃은 JFrame 뿐만 아니라
        // JPanel 컴포넌트에도 적용할 수 있다.
        // JPanel 의 기본 레이아웃은 FlowLayout

        super("PanelLayout!!");

        this.setLayout(null);

        JLabel label = new JLabel("이름 : ");
        label.setLocation(50,100);
        label.setSize(150,50);

        JTextField textField = new JTextField();
        textField.setLocation(150,100);
        textField.setSize(150,50);

        JButton btn = new JButton("로그인");
        btn.setLocation(300,100);
        btn.setSize(50,50);

        // JPanel를 생성하여 위의 컴포넌트 추가
        JPanel pan = new JPanel();

        pan.setBounds(0,0,450,450);
        pan.setBackground(Color.WHITE);

        JPanel pan2 = new JPanel();
        pan2.setBounds(0,350,450,450);
        pan2.setBackground(Color.CYAN);
        JLabel lb2 = new JLabel("금액을 넣어요 ");
        lb2.setLocation(50,100);
        lb2.setSize(150,50);
        pan.setLayout(null);

        pan.add(label);
        pan.add(textField);
        pan.add(btn);
        pan2.add(lb2);


        this.add(pan2);
        this.add(pan);
        this.setBounds(300,300,500,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




    }
}
