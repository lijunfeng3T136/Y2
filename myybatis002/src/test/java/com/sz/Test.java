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
import java.util.ArrayList;
import java.util.List;


public class Test {

    @org.junit.Test
    public void book(){
        SqlSession sqlSession =MybatisUtil.getSession();
        mappers mapper=sqlSession.getMapper(mappers.class);
        List<Book> bookss =mapper.listISBN(12310);
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
