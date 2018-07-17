package com.sz.mappers;


import com.sz.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface mappers {

    List<Book> listISBN(@Param("ISBN") Integer ISBN);

    void  insert(Book book);
    int deleteBook(@Param("id") Integer id);
    int updateBook(Book book);
}