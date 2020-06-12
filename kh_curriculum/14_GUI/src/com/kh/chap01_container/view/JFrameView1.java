package com.kh.chap01_container.view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

// 프레임을 생성하는 방법1
// javax.swing.JFrame 클래스를 상속받아 생성자에서 프레임에 대한 설정 후 다른클래스에서 호출하는 방식
public class JFrameView1 extends JFrame {

    // 기본 생성자 안에서 프레임 기본세팅을 잡아주기.
    public JFrameView1(){
//        this.setLocation(0,0); // 프레임 위치 설정(x, y)
//        this.setSize(500,600); //윈도우 크기

        // 프레임 위치와 크기를 한번에 설정
        Rectangle r = new Rectangle(300,200,800,500);
        this.setBounds(r);
//        this.setBounds(300,200,800,500);

        this.setVisible(true); //보여지게하는 메소드

        // 프레임 사이즈 조정
//        this.setResizable(true);//기본값
        this.setResizable(false); //사이즈 조정 불가

        this.setTitle("myFrame");

        // 프레임 상단에 로고 이미지 변경
        try {
            this.setIconImage(ImageIO.read(new File("image/icon.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

}
