package com.kh.chap01_poly.part01_exercise.controller;

import com.kh.chap01_poly.part01_exercise.model.vo.Desktop;
import com.kh.chap01_poly.part01_exercise.model.vo.Electronic;
import com.kh.chap01_poly.part01_exercise.model.vo.NoteBook;
import com.kh.chap01_poly.part01_exercise.model.vo.Tablet;
import sun.security.krb5.internal.crypto.Des;

import java.lang.annotation.ElementType;
import java.lang.reflect.TypeVariable;

public class ElectronicManager {
    // 용산 전자상가에 오신걸 환영합니다.
    // kh 가게

    // 1. 다형성 적용안했을 때
//    private Desktop desk = null;
//    private NoteBook note = null;
//    private Tablet tab = null;
    // 2. 다형성 적용했을 때
    private Electronic[] elec = new Electronic[3];
    private int count = 0;

    public ElectronicManager () {}

    // 1. 다형성 적용 안했을 때
    // insert(전달받은 주소값 대입)
//    public void insert(Desktop desk){
//        this.desk = desk;
//    }
//    public void insert(NoteBook note){
//        this.note = note;
//    }
//    public void insert(Tablet tab){
//        this.tab = tab;
//    }
    // 2. 다형성 적용 했을 때
//    public void insert(Desktop desk){
//        elec[0] = desk;
//    }
//
//    public void insert(NoteBook note) {
//        elec[1] = note;
//    }
//
//    public void insert(Tablet tab) {
//        elec[2] = tab;
//    }
    public void insert(Electronic any){
        elec[count]=any;
        count++;

    }
    //select(각각의 반환형에 해당하는 주소값 리턴) --> 반환형은 오버로딩에 영향을 끼치지 않는다.
//    public Desktop selectDesktop(){
//        return this.desk;
//    }
//    public NoteBook selectNoteBook(){
//        return this.note;
//    }
//    public Tablet selectTablet() {
//        return this.tab;
//    }

    public Desktop selectDesktop(){
        return (Desktop)elec[0];
    }
    public NoteBook selectNoteBook(){
        return (NoteBook)elec[1];
    }
    public Tablet selectTablet() {
        return (Tablet)elec[2];
    }
}
