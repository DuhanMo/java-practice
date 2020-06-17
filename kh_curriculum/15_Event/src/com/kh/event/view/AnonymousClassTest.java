package com.kh.event.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClassTest extends JFrame {
    // 이벤트 리스너를 연결하는 방법 1
    //      익명클래스를 통해서 즉석으로 연결하여
    //      각각의 컴포넌트 고유의 이벤트를 생성하는 방법

    // - 클래스를 정의하지 않고 객체를 정의하는 방법
    //  > 1회용 클래스 사용
    //  > 재사용 불가능한 클래스 ( 객체를 한 번 만드는 용도)
    // - 이벤트 객체, 스레드 객체, 람다식, 스트링 등에서 사용
    public AnonymousClassTest() {
        this.setSize(300, 200);
        this.setTitle("익명 클래스 테스트");

        JPanel pan = new JPanel();
        JButton btn = new JButton("버튼을 눌러보세요");
        JLabel lb = new JLabel("아직 버튼을 누르지 않았습니다");

        // 익명 클래스 작성을 통한 이벤트리스너 등록
        // 이벤트 핸들러(Event Handler) : 이벤트 처리기
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getSource());
                if (e.getSource() == btn) {
                    lb.setText("드디어 누르셨군요 !!^_^!!");
                }
            }
        });
        pan.add(btn);
        pan.add(lb);
        this.add(pan);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}