package com.itheima.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class User {
    private String username;
    private Date birthday;
    private String address;
    private List<Account> accountList;//一个用户包含多个账号

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", accountList=" + accountList +
                '}';
    }
}
