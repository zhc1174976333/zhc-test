package com.zhc.test.demo.entity;

import java.io.Serializable;

/**
 *
 */
public class User implements Serializable {

    private Long id;
    private String userName;
    private String sex;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString(){
        return "id = " + id + ", userName = " + userName + ", sex = " + sex;
    }
}
