package com.kh.event.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseAdapterTest extends JFrame {
    public MouseAdapterTest() {
        this.setTitle("MouseAdapter Test");
        this.setSize(300, 200);

//        JPanel pan = new JPanel();
//        pan.setBackground(Color.RED);
//
//        this.add(pan);


        JButton btn = new JButton("무지개 버튼");

        this.add(btn);
        btn.setOpaque(true);
        btn.setBorderPainted(false);
//        btn.setBackground(Color.RED);

        // 이벤트 추가
        btn.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
            }
        });
        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
            }
        });
        btn.addMouseListener(new MouseListener() {
            int count = 0;

            @Override
            public void mouseClicked(MouseEvent e) {
                int num = count % 7;
                switch(num){
                    case 0: btn.setBackground(Color.red); break;
                    case 1: btn.setBackground(Color.ORANGE); break;
                    case 2: btn.setBackground(Color.black); break;
                    case 3: btn.setBackground(Color.white); break;
                    case 4: btn.setBackground(Color.green); break;
                    case 5: btn.setBackground(new Color(100,100,100)); break;
                    case 6: btn.setBackground(new Color(30,20,120)); break;

                }
                count++;
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


}
