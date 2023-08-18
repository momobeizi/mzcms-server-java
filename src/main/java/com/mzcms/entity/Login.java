package com.mzcms.entity;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

public class Login {
    @NotEmpty(message = "账号不能为空！")
    private String account;
    /**
     * 密码
     */
    @Size(min = 8, message = "密码长度不能小于8！")
    @NotEmpty(message = "密码不能为空！")
    private String passWord;
    public Login(  String account, String passWord){
        this.account = account;
        this.passWord = passWord;
    }
    // account
    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    // passWord
    public String getPassWord() {
        return passWord;
    }
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

}
