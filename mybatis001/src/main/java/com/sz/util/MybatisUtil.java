package com.sz.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtil {
    private  static SqlSessionFactory sqlSessionFactory;


    static {
        //定义mybatis核心配置文件的位置
        String  resource="mybatis.cfg.xml";
        //通过mybatis的这个工具类加载这个文件的流
        InputStream in=null;


try {
    in = Resources.getResourceAsStream(resource);
    sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
}catch (IOException e){
    e.printStackTrace();
}
    }
        public  static SqlSession getSession(){
        return  sqlSessionFactory.openSession();
        }


}
