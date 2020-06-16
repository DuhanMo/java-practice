package com.kh.chap03_component.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImageIconTest extends JFrame {
    public ImageIconTest() {
        super("이미지 표시 및 변경하기");

        JPanel pan = new JPanel();

        // 이미지를 컨테이너에 삽입할 때에는 머저 화면에 표시할 이미지의 크기를 설정해야한다.
        Image myImg = new ImageIcon("image/user.png").getImage().getScaledInstance(150, 150, 0);

        JLabel lb = new JLabel(new ImageIcon(myImg));

        pan.add(lb);

        JButton btn = new JButton("이미지 변경");


        btn.addActionListener(new ActionListener() {
            int count = 0;

            //            count++;
            @Override
            public void actionPerformed(ActionEvent e) {
                int count = 0;
                    // 해당버튼이 클릭되었을때
                    // 보여주는 이미지 객체를 바꾸면 이미지가 변경된다.

                        Image myImg = new ImageIcon("image/tiger.png").getImage().getScaledInstance(150, 150, 0);
                        lb.setIcon(new ImageIcon(myImg));



            }
        });
        this.add(pan, "Center");
        this.add(btn, "South");
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


}

