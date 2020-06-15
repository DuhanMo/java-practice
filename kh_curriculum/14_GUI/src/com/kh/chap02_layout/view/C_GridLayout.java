package com.kh.chap02_layout.view;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class C_GridLayout extends JFrame {
    // GridLayout:
    //          컴포넌트들을 가로, 세로로 균등하게 배치할 때
    //          사용하는 배치방식으로 보통 윗줄부터
    //          아래 줄의 순서로 왼쪽부터 오른쪽으로 정렬하여 배치한다.
    public C_GridLayout(){

        super("GridLayout");

        this.setBounds(300,300,500,500);

        // GridLayout 은 선언 시에 매개변수를 받을 수 있는데
        // 매개변수의 순서에 따라 가로줄, 세로줄, 가로공간크기, 세로공간크기를 설정할수 있다.
        this.setLayout(new GridLayout(5,5,10,20));




        Set<Integer> bingoNum = new LinkedHashSet<>();
        while(bingoNum.size() < 25){
            // 1~25사이의 난수 생성
            int rnd = (int)(Math.random()*25 )+1;
            // 만들어진 난수를 빙고 set에 넣는다.
            bingoNum.add(rnd);
        }
        // 목록화 시켜서 뽑아오기
//        Iterator<Integer> iter = bingoNum.iterator();
//        while(iter.hasNext()){
//            this.add(new JButton(iter.next()+"번"));
//        }

        // 배열에 넣어서 뽑아오기 방법1.
//        for (Integer integer : bingoNum) {
//            this.add(new JButton(integer + "번"));
//        }

        // 배열에 넣어서 뽑아오기 방법2.
//        Object[] obj = bingoNum.toArray();
//        for (int i = 0; i < bingoNum.size(); i++) {
//            this.add(new JButton(obj[i] + "번"));
//        }
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
