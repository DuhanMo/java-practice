package com.kh.changePan.view;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainFrame extends JFrame {
    private JPanel pan;     // 메인프레임에 위치할 주 패널 객체
    private boolean check;  // 특정 이벤트에 따른 패널 교체용 스위치 변수

    public MainFrame(){
        this.setSize(300,200);
        this.setTitle("패널 교체하기");

        pan = new MyPanel1();

        this.add(pan);

        pan.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                replace();
            }
        });
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void replace(){
        // 현재 추가된 객체 제거하기
        this.remove(pan);
        if(check){
            this.pan = new MyPanel1();
        }else{
            this.pan = new MyPanel2();
        }
        pan.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                replace();
            }
        });
        this.add(pan);

        check = !check;

        // 자바는 화면객체와 화면구현에 대한 그래픽 객체가 별도로 존재하여
        // 화면이 변경되었을 때 그래픽 객체를 통해 화면을 다시 그려야 한다.
        this.repaint();
    }
}
