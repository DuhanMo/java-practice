package com.kh.event.view;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventTest extends JFrame {
    /*
    * 이벤트 : 키보드나 마우스를 클릭하거나 마우스를 움직이는 기타등등의 동작을 --> 이벤트가 발생!
    *
    * 이벤트 처리 방법 : 해당 이벤트 리스너나 객체를 생성하여 처리
    *
    * 이벤트 종류:
    *   KeyEvent : 키를 누르면 키보드 포커스를 가지고 있는 객체에서 발생
    *   MouseEvent : 마우스를 클릭할 때, 눌릴 때, 땔 때, 해당 주체에 들어 갈 때, 빠져나올 때 상황에서 발생
    *   MouseMotionEvent : 마우스가 움직였을 때 발생
    *   ActionEvent : 사용자가 어떤 동작을 할 경우 발생 --> 모든 컴포넌트에서 발생되지는 않는다.
    * */
    /*
    * 이벤트가 발생되는 주체 .addXXXListener(XXXListener / XXXAdapter 생성) --> 이벤트를 처리하는 방법 다양하지만 일단 익명클래스를 통한 방법
    *
    * XXXListener --> InterFace --> 추상메소드만 가지고 있다.
    * XXXAdapter --> abstract class --> Listener를 구현한 추상클래스로 Listener에 있던 추상메소드를 강제로 오버라이딩해놨다.
    *                                   단, 재정의는 안해놨다.(몸통부만 열어만 놨다)
    *
    * */
    public MouseEventTest(){

        this.setTitle("MouseListenerTest");
        this.setSize(300,200);

        JPanel panel = new JPanel();
        this.add(panel);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 마우스 이벤트를 발생시키고자 할때 .addMouseListener(MouseListener m)
        panel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // 마우스를 클릭했을 때(누르고 때지는 것까지 모두포함)
                System.out.println("X = " + e.getX() + ", Y = " +e.getY());
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // 마우스가 눌려졌을 때 발생하는 이벤트
//                System.out.println("X = " + e.getX() + ", Y = " +e.getY());
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // 마우스가 때질 때
//                System.out.println("X = " + e.getX() + ", Y = " +e.getY());
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // 마우스가 패널에 들어갈 때
//                System.out.println("X = " + e.getX() + ", Y = " +e.getY());

            }

            @Override
            public void mouseExited(MouseEvent e) {
                // 마우스가 패널에서 빠져나갈 때 발생하는 이벤트
//                System.out.println("X = " + e.getX() + ", Y = " +e.getY());

            }
        });

    }


}
