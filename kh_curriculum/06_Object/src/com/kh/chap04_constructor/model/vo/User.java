package com.kh.chap04_constructor.model.vo;

import java.util.Date;

public class User {
    private String userId;
    private String userPwd;
    private String userName;
    private Date enrollDate;


    public User() {

    }

    public User(String userId, String userPwd) {
        this.userId = userId;
        this.userPwd = userPwd;
    }
    public User(String userId, String userPwd, String userName){
//        this.userId = userId;
//        this.userPwd = userPwd;
        this(userId,userPwd);
        this.userName = userName;
    }



    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    public String information() {
        return "[userId = " + userId + ", userPwd = " + userPwd + ", userName = " + userName
                + ", enrollDate = " + enrollDate + "]";
    }
}
