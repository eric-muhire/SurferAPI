package com.grupparbete.entities;

public class User {
    private long userId;
    private String userName;
    private String userEmail;

    public User(long userId,String userName,String userEmail) {
        this.userId=userId;
        this.userName=userName;
        this.userEmail=userEmail;
    }

    public long getUserId() {
        return userId;
    }
    public void setUserId(long userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}


