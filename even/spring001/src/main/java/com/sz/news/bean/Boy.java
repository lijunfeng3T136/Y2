package com.sz.news.bean;

import com.sz.old.bean.Girl;

import java.io.Serializable;

public class Boy implements Serializable {
    public  static  final long serialVersionUID = -1L;
    private String name;
    private Girl girl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Girl getGirl() {
        return girl;
    }

    public void setGirl(Girl girl) {
        this.girl = girl;
    }

    @Override
    public String toString() {
        return "Boy{" +
                "name='" + name + '\'' +
                ", girl=" + girl +
                '}';
    }
}
