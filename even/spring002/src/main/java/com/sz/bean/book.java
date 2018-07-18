package com.sz.bean;

public class book {
    private  String name;
    private  Double price;

    public void inits(){
        System.out.println("书一点也不好看");
    }
    public  void init(){
        System.out.println("我的书名是:"+name);
    }

    public book() {
        System.out.println("书很好看");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
