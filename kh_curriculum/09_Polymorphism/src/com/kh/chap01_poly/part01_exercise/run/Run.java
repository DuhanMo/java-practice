package com.kh.chap01_poly.part01_exercise.run;

import com.kh.chap01_poly.part01_exercise.controller.ElectronicManager;
import com.kh.chap01_poly.part01_exercise.model.vo.Desktop;
import com.kh.chap01_poly.part01_exercise.model.vo.NoteBook;
import com.kh.chap01_poly.part01_exercise.model.vo.Tablet;

public class Run {
    public static void main(String[] args) {
        ElectronicManager em = new ElectronicManager();

        // 가게에 새로운 물건들을 들여놓기 위해 insert 메소드 실행
        em.insert(new Desktop("samsung","데탑",1200000,"intel","지포스 2020"));
        em.insert(new NoteBook("LG","그램",1500000,"intel",3));
        em.insert(new Tablet("Apple","아이패드",1300000,false));

        // 가게에 있는 물건 정보를 조회하기 위해서 select메소드 실행
        System.out.println(em.selectDesktop());
        System.out.println(em.selectNoteBook());
        System.out.println(em.selectTablet());
    }
}
