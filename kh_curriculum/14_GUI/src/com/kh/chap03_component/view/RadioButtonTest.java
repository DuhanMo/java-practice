package com.kh.chap03_component.view;

import javafx.scene.control.RadioButton;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonTest extends JFrame {

    public RadioButtonTest(){
        super("커피 사이즈 선택하기");

        JPanel pan = new JPanel();
        JLabel lb = new JLabel ("어떤 커피를 고르실래요?");
        pan.add(lb);

        JPanel pan2 = new JPanel();

        // 라디오 버튼 만들기
        JRadioButton rBtn1 = new JRadioButton("Small size");
        JRadioButton rBtn2 = new JRadioButton("Regular size");
        JRadioButton rBtn3 = new JRadioButton("Tall size");

        // 라디오그룹
        // 라디오 버튼들은 하나의 그룹에 속해 있지 않으면
        // 각각을 별개의 버튼으로 인식한다.
        // 따라서 라디오 버튼을 올바르게 동작시키려면
        // 버튼을 하나의 그룹으로 묶어준다.
        ButtonGroup sizeGp = new ButtonGroup();
        sizeGp.add(rBtn1);
        sizeGp.add(rBtn2);
        sizeGp.add(rBtn3);

        pan2.add(rBtn1);
        pan2.add(rBtn2);
        pan2.add(rBtn3);

        // 이벤트 추가
        JPanel resultPan = new JPanel();
        JLabel resultLb = new JLabel("크기가 선택되지 않았습니다.");

        rBtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 버튼이 클릭되었을 떄 동작할 내용
                resultLb.setText("Small 사이즈가 선택되었습니다. ");
            }
        });
        rBtn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 버튼이 클릭되었을 떄 동작할 내용
                resultLb.setText("Regular 사이즈가 선택되었습니다. ");
            }
        });
        rBtn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 버튼이 클릭되었을 떄 동작할 내용
                resultLb.setText("Tall 사이즈가 선택되었습니다. ");
            }
        });
        resultPan.add(resultLb);


        this.add(pan,"North");
        this.add(pan2,"Center");
        this.add(resultPan,"South");
//        this.setSize(500,400);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
