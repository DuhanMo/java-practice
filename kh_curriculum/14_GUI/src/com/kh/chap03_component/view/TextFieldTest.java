package com.kh.chap03_component.view;

import javax.swing.*;
import javax.swing.plaf.basic.BasicListUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldTest {
    public  void textFieldTest() {
        // 숫자 입력받아서 제곱한 결과 리턴하기
        JFrame frame = new JFrame();
        frame.setSize(300,130);
        frame.setTitle("제곱 계산하기");

        JPanel panel = new JPanel();
        panel.add(new JLabel("숫자 입력"));

        JTextField text = new JTextField(15);
        panel.add(text);

        panel.add(new JLabel("제곱한 값"));

        JTextField result = new JTextField(15);
        result.setEditable(false);
        panel.add(result);

        JButton btn = new JButton("ok");
        panel.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 클릭시 텍스트 상자의 값 가져와서 파싱 후 계산처리
                int value = Integer.parseInt(text.getText());
                result.setText(value*value+"");

                // 해당 텍스트 상자로 다시 포커스를 가져가라
                text.requestFocus();

            }
        });
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
