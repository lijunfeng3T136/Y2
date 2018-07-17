package com.sz.old.bean;

import java.io.Serializable;

public class Girl implements Serializable {
    public  static  final long serialVersionUID = -1L;

    private  Integer luckNum;
    private  String name;
    private  String color;

    public Girl() {
    }

    public Girl(String name) {
        this.name = name;
    }

    public Integer getLuckNum() {
        return luckNum;
    }

    public void setLuckNum(Integer luckNum) {
        this.luckNum = luckNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Girl{" +
                "luckNum=" + luckNum +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
