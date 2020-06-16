package com.kh.chap03_component.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaTest {
    public void textAreaTest(){
        JFrame frame = new JFrame();

        JTextField tf = new JTextField("입력용 텍스트 필드",30); // 입력용 텍스트 필드
        JTextArea ta = new JTextArea(10,30); // 출력용 텍스트 필드

        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = tf.getText();
                ta.append(text + "\n");
                // 텍스트 필드 지우고 포커스 이동
                tf.setText("");
                tf.requestFocus();
            }
        });
        frame.add(tf,"North");
        frame.add(ta,"Center");

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
