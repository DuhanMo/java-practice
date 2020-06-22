package com.kh.event.view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class KeyEventTest extends JFrame implements KeyListener {
    // 키 입력에 대한 이벤트를 등록하기 위해서는
    // KeyListener를 상속받아 구현
    private JTextField jtf;

    public KeyEventTest() {
        this.setSize(600, 600);
        this.setTitle("Key 입력 테스트");

        // 1. 이벤트를 등록하기 위한 요소를 생성
        jtf = new JTextField(20);


        // 2. 생성한 이벤트를 감지하기 위한 리스너를 컴포넌트 요소와 결합
        jtf.addKeyListener(this);

        // 3. 컨테이너에 컴포넌트 요소를 추가
        this.add(jtf);

        setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }


    @Override
    public void keyTyped(KeyEvent e) {
        // 키가 입력 되었을 때, 화면에 입력한 키가 표시될 떄
        //display("keyTyped Event",e);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // 키보드 눌럿을 때
        display("keyPressed Event",e); //한글안됨
        sampleMyEvent();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //키보드에서 손을 땟을 떄
//        display("keyPressed Event", e);
//        sampleMyEvent();
    }

    // 실행 확인을 위한 이벤트 상태 출력 메소드
    public void display(String eventName, KeyEvent e) {
        // 현재 실행된 키 관련 이벤트의 상태를 콘솔 화면에 출력하기 위한 메소드이다.
        char ch = e.getKeyChar();
        int chNum = e.getKeyCode(); //존나 유용하다고한다.

        String modifier = e.isAltDown() + ", " + e.isControlDown() + ", " + e.isShiftDown(); //ctrl alt shift 눌렀을 때 값

        System.out.println("Key 이벤트 명 : " + eventName);
        System.out.println("[" + chNum + "] : " + ch);
        System.out.println("특수키 입력 확인 : " + modifier);
    }

    public void sampleMyEvent() {
        System.out.println("10자 이내인지 확인합니다.");
        if (jtf.getText().length() > 10) {
            System.out.println(jtf.getText().length() + ": 10자를 초과합니다.!");
        } else {
            System.out.println(jtf.getText().length() + ": 10자 이내입니다.!");
        }
    }
}