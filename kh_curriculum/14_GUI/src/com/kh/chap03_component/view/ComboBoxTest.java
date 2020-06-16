package com.kh.chap03_component.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxTest extends JFrame {
    public ComboBoxTest(){
        super("콤보박스 테스트");

        String[] animal = {"cat", "dog", "tiger"};

        JComboBox animalList = new JComboBox(animal);

        // 처음 시작시 기본값으로 선택할 순서를 설정
        animalList.setSelectedIndex(2);

        JLabel lb = new JLabel();

        animalList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 어떤 메뉴를 선택했는지 확인하고 해당 요소를 가져오기
                JComboBox box = (JComboBox) e.getSource();

                // 현재 선택된 요소를 문자열로 가져온다.
                String name = (String)box.getSelectedItem();

                Image myImg = new ImageIcon("image/"+name+".png").getImage().getScaledInstance(150,150,0);
                lb.setIcon(new ImageIcon(myImg));
            }

        });
        this.add(animalList,"North");
        this.add(lb,"Center");
        this.setSize(150,200);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
