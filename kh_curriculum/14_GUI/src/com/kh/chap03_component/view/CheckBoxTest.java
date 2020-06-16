package com.kh.chap03_component.view;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxTest extends JFrame {
    public CheckBoxTest() {
        super("과일 선택하기");

        String[] fruitNames = {"오렌지", "메론", "수박", "망고", "사과"};

        JCheckBox[] boxes = new JCheckBox[5];

        for (int i = 0; i < boxes.length; i++) {
            boxes[i] = new JCheckBox(fruitNames[i]);
        }

        JPanel pan = new JPanel();
        for (int i = 0; i < boxes.length; i++) {
            pan.add(boxes[i]);
        }

        JLabel lb = new JLabel("선택한 과일이 없습니다");
        for (int i = 0; i < boxes.length; i++) {
            // 특정 리스트, 배열에 대한 이벤트를 담당하는 인터페이스
            boxes[i].addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    // 선택한 요소의 값이 변경되었을 때
                    // 동작하는 이벤트로, 체크박스의 경우
                    // v로 체크하면 true , 체크를 해제하면 false로 감지한다.
                    String result = "";

                    int count = 0; // 체크한 과일 갯수 세기

                    // 체크되어있는 과일의 이름을 가져와서 라벨에 붙여쓰기
                    for (int j = 0; j < boxes.length; j++) {
                        // isSelected() : 현재 순번의 과일 버튼이 선택되었는지 확인
                        // 선택되었다면 true/ 아니면 false
                        if (boxes[j].isSelected()) {
                            result += boxes[j].getText() + " ";
                            count++;
                            lb.setText(result);
                        }
                    }
                    if (count == 0) {
                        lb.setText("선택한 과일이 없습니다.");
                    }
                }

            });
        }

        this.add(pan, "Center");
        this.add(lb, "South");
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
