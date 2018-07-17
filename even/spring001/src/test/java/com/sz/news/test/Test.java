package com.sz.news.test;

import com.sz.news.bean.Boy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    @org.junit.Test
    public void girlTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"app.xml", "appTwo.xml"});

        Boy boy = (Boy) context.getBean("boy");
        System.out.println(boy);
    }
}
