package com.kh.chap03_component.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogTest extends JFrame {
    public DialogTest() {
        JPanel pan = new JPanel();

        JButton btn1 = new JButton("기본 다이얼로그");

        Dialog dl = new Dialog(this, "기본 다이얼로그입니다.");

        dl.setBounds(300,300,150,150);
        dl.add(new JLabel("기본 다이얼로그 테스트 입니다."));
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dl.setVisible(true);
            }
        });
        JButton btn2 = new JButton("닫기 버튼");
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dl.dispose();
            }
        });
        // 값을 입력받는 JOptionPanel
        JButton btn3 = new JButton("입력값 받는 알림창");
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 버튼 클릭 시 값을 입력받는 알림창 띄우기
                String result = JOptionPane.showInputDialog("값을 입력하세요.");

                System.out.println("result : " + result);
            }
        });



        pan.add(btn1);
        pan.add(btn2);
        pan.add(btn3);
        this.add(pan);

//        this.setSize(150,200);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void dialogTest() {
        JFrame frame = new JFrame();
        JPanel pan = new JPanel();
        JButton btn1 = new JButton("기본 다이얼로그");

        Dialog dl = new Dialog(frame, "기본 다이얼로그입니다.");
        dl.setBounds(300,300,150,150);
        dl.add(new JLabel("기본 다이얼로그 테스트 입니다."));
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dl.setVisible(true);
            }
        });
        JButton btn2 = new JButton("닫기 버튼");
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dl.dispose();
            }
        });

        frame.add(btn1);
        frame.add(btn2);
        frame.add(pan);
//        frame.setSize(150,200);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

