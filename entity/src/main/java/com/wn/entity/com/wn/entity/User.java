package com.wn.entity.com.wn.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {
    private Integer uid;

    private String name;

    private String token;

    private static final long serialVersionUID = 1L;

    public User(Integer uid, String name, String token) {
        this.uid = uid;
        this.name = name;
        this.token = token;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}