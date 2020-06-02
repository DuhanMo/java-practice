package com.hw4.controller;

import com.hw2.model.vo.Student;
import com.hw4.model.vo.Member;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MemberController  {
    public static final int SIZE = 10;
    private int memberCount;
    private Member[] mem = new Member[SIZE];

    {
        mem[0] = new Member("user01", "pass01", "김유신", 20, 'M', "kim12@naver.com");
        mem[1] = new Member("user02", "pass02", "이순신", 60, 'M', "lee2@naver.com");
        mem[2] = new Member("user03", "pass03", "유관순", 17, 'F', "yo5@hanmail.net");
        mem[3] = new Member("user04", "pass04", "연개소문", 57, 'M', "yeon@gmail.com");
        mem[4] = new Member("user05", "pass05", "신사임당", 45, 'F', "shin@naver.com");
        memberCount = 5;
    }

    public int getMemberCount() {
        return memberCount;
    }

    public Member[] getMem() {
        return mem;
    }

    public Member checkId(String userId) {
        Member m = null;

        for (int i = 0; i < memberCount; i++) {
            if (mem[i].getUserId().equals(userId)) {
                m = mem[i];

            }
        }
        return m;
    }

    public void insertMember(Member m) {

        mem[memberCount] = m;
        memberCount++;
        System.out.println("성공적으로 회원 등록이 되었습니다. ");

    }

    public Member searchMember(int menu, String search) {

        Member searchMember = null;

        switch (menu) {
            case 1:
                for (int i = 0; i < memberCount; i++) {
                    if (mem[i].getUserId().equals(search))
                        searchMember = mem[i];
                }
                break;
            case 2:
                for (int i = 0; i < memberCount; i++) {
                    if (mem[i].getName().equals(search))
                        searchMember = mem[i];
                }
                break;
            case 3:
                for (int i = 0; i < memberCount; i++) {
                    if (mem[i].getEmail().equals(search))
                        searchMember = mem[i];
                }
                break;
            default:
                break;
        }
        return searchMember;
    }

    public void updateMember(Member m, int menu, String update) {
        switch (menu) {
            case 1:
                m.setUserPwd(update);
                break;
            case 2:
                m.setName(update);
                break;
            case 3:
                m.setEmail(update);
                break;
            default:
                break;
        }
    }

    public void deleteMember(String userId) {
        Member tmp = new Member();
        for (int i = 0; i < memberCount; i++) {
            if (mem[i].getUserId().equals(userId)) {
                mem[i] = null;
                for (int j = i; j < memberCount - 1; j++) {
                    mem[j] = mem[j + 1];
                }
                memberCount--;
                break;
            }
        }
    }

    public Member[] sortIdAsc() {
        Member[] copy = new Member[SIZE];
        System.arraycopy(copy, 0, mem, 0, mem.length);


        return copy;
    }


//    public Member[] sortIdDesc(){
//
//    }
//    public Member[] sortAgeAsc(){
//
//    }
//    public Member[] sortAgeDesc(){
//
//    }
//    public Member[] sortGenderDesc(){
//
//    }
}
