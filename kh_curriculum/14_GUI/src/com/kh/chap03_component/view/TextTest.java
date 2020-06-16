package com.kh.chap03_component.view;

import com.kh.chap03_component.controller.TestController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextTest {

    public void loginFrame(){
        JFrame frame = new JFrame();
        frame.setSize(800,300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,2));
        panel.setSize(800,300);

        // 글을 입력할 수 있는 텍스트 상자
        JTextField id = new JTextField();
        panel.add(new JLabel("ID : "));
        panel.add(id);

        // 비밀번호를 입력할 수 있는 TextField
        // JPasswordField : 입력되는 값을 화면 상에서 볼 수 없으며, 한글 입력 불가
        JPasswordField pwd = new JPasswordField();
        panel.add(new JLabel("PASSWORD : "));
        panel.add(pwd);

        // textArea : 여러줄의 텍스트를 입력할 수 있는 상자
        JTextArea tArea = new JTextArea(10,30);
        tArea.setEditable(false); // 내용을 수정할 수 없도록 함(readOnly);

        JButton btn =  new JButton("보내기");

        // 프레임은 기본적으로 BorderLayout

        frame.add(panel,"North");
        frame.add(tArea,"Center");
        frame.add(btn, "South");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userId = id.getText();
//                StringBuilder userPwd;
//                userPwd = new StringBuilder();
//                char[] arr = pwd.getPassword();
//                for (char c : arr) {
//                    userPwd.append(c);
//                }
                String userPwd = "";
                char[] arr = pwd.getPassword();
                for(int i = 0; i < arr.length ; i++){
                    userPwd += arr[i];
                }
                TestController tc = new TestController();
                int result = tc.login(userId, userPwd);
                if(result ==1){
                    ImageIconTest iit = new ImageIconTest();
                    frame.setVisible(false);
                }
            }
        });
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
