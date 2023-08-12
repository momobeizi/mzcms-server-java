package com.mzcms.entity;

public class User {
    private int id;
    private String account;
    private String userName;
    private String passWord;
    private String nickName;
    private int gender;
    private String picture;

    public User(int id,String account, String userName, String passWord, String nickName, int gender, String picture){
        this.id = id;
        this.account = account;
        this.userName = userName;
        this.passWord = passWord;
        this.nickName = nickName;
        this.gender = gender;
        this.picture = picture;
    }
    // id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    // account
    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    // userName
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    // passWord
    public String getPassWord() {
        return passWord;
    }
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    // nickName
    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    // gender
    public int getGender() {
        return gender;
    }
    public void setGender(int gender) {
        this.gender = gender;
    }
    // picture
    public String getPicture() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }
}
