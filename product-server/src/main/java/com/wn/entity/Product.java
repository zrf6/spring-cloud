package com.wn.entity;

import java.io.Serializable;

public class Product implements Serializable {
    private Integer pid;

    private String productName;

    private static final long serialVersionUID = 1L;

    public Product(Integer pid, String productName) {
        this.pid = pid;
        this.productName = productName;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", productName='" + productName + '\'' +
                '}';
    }
}