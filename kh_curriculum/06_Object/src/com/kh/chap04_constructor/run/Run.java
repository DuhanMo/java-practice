package com.kh.chap04_constructor.run;

import com.kh.chap04_constructor.model.vo.User;

public class Run {
    public static void main(String[] args){
        User usr1 = new User();
        usr1.setUserId("user01");
        usr1.setUserName("asduefjckxz");
        usr1.setUserPwd("12345");
        User usr2 = new User("모두한", "1234");



        System.out.println(usr1.information());
        System.out.println(usr2.information());
    }
}
