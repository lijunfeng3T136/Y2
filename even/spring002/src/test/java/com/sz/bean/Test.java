package com.sz.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.print.Book;
import java.util.Arrays;

public class Test {
    @org.junit.Test
    public void books(){
        ApplicationContext context =new ClassPathXmlApplicationContext("add.xml");

      ;
        BookTwo bookTwos= (BookTwo) context.getBean("bookTwo");
        System.out.println(Arrays.toString(bookTwos.getName()));

        BookTwo bookSet= (BookTwo) context.getBean("bookThree");
        System.out.println(bookSet.getNames());

        BookTwo bookMap= (BookTwo) context.getBean("bookMaps");
        System.out.println(bookMap.getBookMap().get("one").getName());
        System.out.println(bookMap.getBookMap().get("two").getName());
        ((ClassPathXmlApplicationContext) context).close();


    }
}
