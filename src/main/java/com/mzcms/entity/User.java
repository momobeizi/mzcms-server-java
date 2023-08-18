package com.mzcms.entity;

import com.mzcms.validation.UserValidationRules;
import javax.validation.constraints.*;
import java.time.LocalDateTime;

public class User {
    /**
     * 主键id
     */
    @NotNull(groups = UserValidationRules.UpdateUser.class, message = "用户id不能为空！")
    private int id;
    /**
     * 账号
     */
    @NotEmpty(message = "账号不能为空！")
    private String account;
    /**
     * 用户名称
     */
    @NotEmpty(message = "用户名不能为空！")
    private String userName;
    /**
     * 密码
     */
    @Size(min = 8, message = "密码长度不能小于8！")
    @NotEmpty(message = "密码不能为空！")
    private String passWord;
    /**
     * 昵称
     */
    @NotEmpty(message = "昵称不能为空！")
    private String nickName;
    /**
     * 性别
     */
    @Min(value = 0, message = "请传入正确的性别0-2")
    @Max(value = 2, message = "请传入正确的性别0-2")
    private int gender;
    /**
     * 头像
     */
    private String picture;
    /**
     * 创建时间
     */
    private LocalDateTime createdAt;
    /**
     * 更新时间
     */
    private LocalDateTime updatedAt;

    public User(int id,String account, String userName, String passWord, String nickName, int gender, String picture, LocalDateTime createdAt, LocalDateTime updatedAt){
        this.id = id;
        this.account = account;
        this.userName = userName;
        this.passWord = passWord;
        this.nickName = nickName;
        this.gender = gender;
        this.picture = picture;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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
    // createdAt
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    // updatedAt
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

}
