package com.kh.chap02_layout.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class D_CardLayout extends JFrame {
        // CardLayout :
        //      하나의 컨테이너 안에
        //      여러개의 컴포넌트들을 겹쳐놓고
        //      각각의 컴포넌트에 번호를 매겨
        //      앞장, 뒷장의 배치로
        //      특정 이벤트(마우스 클릭)를 감지할때
        //      컴포넌트를 변경하여 화면에 보여주는 방식
    public D_CardLayout() {
        super("CardLayout!!");
        this.setBounds(300,300,800,500);

        CardLayout cards = new CardLayout();
        this.setLayout(cards);
        // JPanel : 컴포넌트(요소) 이면서
        //          하나의 컨테이너 역할을 하는
        //          배치용 컴포넌트
        JPanel card1 = new JPanel();
        JPanel card2 = new JPanel();
        JPanel card3 = new JPanel();

        // 컴포넌트에 배경색 입히기
        card1.setBackground(new Color(255,255,255));
        card2.setBackground(Color.CYAN);
        card3.setBackground(Color.ORANGE);

        // JLabel : 이름표(평범한 문자열을 표시하기 위한 컴포넌트)
        card1.add(new JLabel("첫번째 카드"));
        card2.add(new JLabel("두번째 카드"));
        card3.add(new JLabel("세번째 카드"));

        this.add(card1);
        this.add(card2);
        this.add(card3);
        // 각 패널에 이벤트 추가하기
        // EventListener 와 EventAdapter
        // EventListener 는 특정 이벤트에 대한 모든 감지요소를 가지고 있는 인터페이스를 말한다
        // 사용하지 않는 이벤트가 있더라도 모두 구현을 해주어야 한다.
        // 따라서 만약에 이벤트를 여러개 중에 한개를 선택하여 사용하고 싶을 때에는
        // 리스너를 상속 받은 해당 Adapter를 이용한다.
        card1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getButton() == 1){ // 왼쪽 클릭
                    cards.next(card1.getParent());
                }else if(e.getButton()==3) { // 오른쪽 클릭
                    cards.previous(card1.getParent());
                }
            }
        });

        card2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getButton() == 1){ // 왼쪽 클릭
                    cards.next(card2.getParent());
                }else if(e.getButton()==3) { // 오른쪽 클릭
                    cards.previous(card2.getParent());
                }
            }
        });

        card3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getButton() == 1){ // 왼쪽 클릭
                    cards.next(card3.getParent());
                }else if(e.getButton()==3) { // 오른쪽 클릭
                    cards.previous(card3.getParent());
                }
            }
        });

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);





    }




}
