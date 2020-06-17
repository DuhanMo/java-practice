package com.kh.event.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OuterClassTest extends JFrame {
    // 이벤트 리스너를 연결하는 방법3
    // 이벤트 전용 클래스를 하나 생성하여
    // 해당 이벤트 클래스를 통해 컴포넌트에 이벤트를 연결하는 방법
    public OuterClassTest(){
        this.setSize(300, 200);
        this.setTitle("아우터 클래스 테스트");

        JPanel pan = new JPanel();
        JButton btn = new JButton("버튼을 눌러보세요");
        JLabel lbl = new JLabel("아직 버튼을 누르지 않았습니다");

        // 외부 클래스일 경우
        // 필드변수와 매개변수가 있는 생성자를 통해
        // 접근하여 이벤트를 연결한다.
        btn.addActionListener(new MyEvent(btn,lbl));
        pan.add(btn);
        pan.add(lbl);
        this.add(pan);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MyEvent implements ActionListener{
    // 필드
    private JButton btn;
    private JLabel lbl;

    // 생성자
    public MyEvent(JButton btn, JLabel lbl){
        this.btn = btn;
        this.lbl = lbl;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn) {
            lbl.setText("참 ~~~ 잘했습니다 !");
        }
    }
}