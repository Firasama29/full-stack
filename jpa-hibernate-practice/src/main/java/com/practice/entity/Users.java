package com.practice.entity;

import javax.persistence.*;

@Entity
public class Users {
    @Id @GeneratedValue
    private int userId;
    @Column(name = "user_name")
    private String userName;

    public Users() {}
    public Users(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }
}
