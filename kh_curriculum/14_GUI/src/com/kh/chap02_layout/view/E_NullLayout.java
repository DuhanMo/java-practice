package com.kh.chap02_layout.view;

import javax.swing.*;

public class E_NullLayout extends JFrame {
    public E_NullLayout() {
        // NullLayout(AbsoluteLayout)
        //      별다른 레이아웃을 지정하지 않고
        //      개발자가 원하는 위치에 직접 컴포넌트를 배치하는 방식

        super("NullLayout!!");
        this.setBounds(300,300,600,500);
        // 레이아웃을 사용하지 않겠다.
        this.setLayout(null);

        JLabel label = new JLabel("이름 : ");

        label.setLocation(100,100);
        label.setSize(150,50);

        // 화면에 글을 입력할 수 있는 컴포넌트
        JTextField textField = new JTextField();
        textField.setLocation(150,100);
        textField.setSize(150,50);

        JButton btn = new JButton("로그인");
        btn.setLocation(300,100);
        btn.setSize(100,50);

        this.add(label);
        this.add(textField);
        this.add(btn);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




    }

}
