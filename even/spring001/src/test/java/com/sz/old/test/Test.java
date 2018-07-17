package com.sz.old.test;

import com.sz.old.bean.Girl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void girlTest(){
        ApplicationContext context =new ClassPathXmlApplicationContext(new String[]{"app.xml","appTwo.xml"});
        Girl girl=(Girl) context.getBean("girl");
        Girl girlTwo= (Girl) context.getBean("girlTwo");
        Girl girlThree= (Girl) context.getBean("girlThree");
        System.out.println(girl);
        System.out.println(girlTwo);
        System.out.println(girlThree);


    }
}
