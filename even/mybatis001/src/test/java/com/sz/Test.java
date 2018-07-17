package com.sz;

import com.sz.entity.Book;
import com.sz.mappers.mappers;
import com.sz.util.MybatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class Test {
    @org.junit.Test
    public  void book(){
        // 1 定义mybatis核心配置文件的位置
        String resource="mybatis.cfg.xml";
        // 2 通过mybatis的工具类加载这个文件为输入流
        InputStream in=null;
        SqlSessionFactory sessionFactory=null;
        SqlSession sqlSession =null;
        try{
            in = Resources.getResourceAsStream(resource);
            // 3 创建一个会话工厂  会话工厂的建造者（一次性用品）
            sessionFactory = new SqlSessionFactoryBuilder().build(in);
            // 4 利用工厂生产会话
            sqlSession = sessionFactory.openSession();
            // 5 使用会话进行相关的操作

            // 得到一个Mapper，mybatis本身通过动态代理帮我们去创建实例
            mappers mapper = sqlSession.getMapper(mappers.class);
            List<Book> bookss = mapper.listAll();
            System.out.println(bookss);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
    @org.junit.Test
    public void book2(){
        SqlSession sqlSession =MybatisUtil.getSession();
        mappers mapper=sqlSession.getMapper(mappers.class);
        List<Book> bookss = mapper.listAll();
        System.out.println(bookss);
    }
    @org.junit.Test
    public void  insertBook(){
        SqlSession sqlSession =MybatisUtil.getSession();
        mappers mapper=sqlSession.getMapper(mappers.class);
        Book book =new Book();
        book.setISBN(12319);
        book.setName("饿狼传说");
        book.setPrice("100");
        book.setDiscout("7.5");
        book.setPublisher("青鸟出版社");
        mapper.insert(book);
        sqlSession.commit();
    }
    @org.junit.Test
    public void deleteId(){
        SqlSession sqlSession =MybatisUtil.getSession();
        mappers mapper=sqlSession.getMapper(mappers.class);
        int row=mapper.deleteBook(1);
        System.out.println(row);
        sqlSession.commit();
    }
    @org.junit.Test
    public void  updateBook(){
        SqlSession sqlSession =MybatisUtil.getSession();
        mappers mapper=sqlSession.getMapper(mappers.class);
        Book book =new Book();
        book.setId(2);
        book.setName("qwe");
        int row=mapper.updateBook(book);
        System.out.println(row);
        sqlSession.commit();
    }
}
