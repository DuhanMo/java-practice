package com.kh.event.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerClassTest extends JFrame {

    // 이벤트 리스너를 통해서 이벤트를 등록하는 방법 2
    // 클래스 내부에 하나의 클래스를 선언하여(내부클래스)
    // 해당 클래스의 모든 컴포넌트가 공유할 수 있는 이벤트를 작성하는 방법

    // 필드 변수로 컴포넌트를 생성하여 내부 클래스에서도 접근이 가능하게 구현
    private JButton btn;
    private JLabel lbl;

    public InnerClassTest() {

        this.setSize(300, 200);
        this.setTitle("이너 클래스 테스트");

        JPanel pan = new JPanel();
        btn = new JButton("버튼을 눌러보세요");
        lbl = new JLabel("아직 버튼을 누르지 않았습니다");

        // 내부 클래스를 통해 이벤트를 작성하는 방법
        btn.addActionListener(new MyEvent());
        pan.add(btn);
        pan.add(lbl);
        this.add(pan);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class MyEvent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(e.getSource());
            if (e.getSource() == btn) {
                lbl.setText("드이어 버튼을 누르셨군요? ^_^ !!");
            }
        }
    }
}

