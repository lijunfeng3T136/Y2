package com.sz.mappers;


import com.sz.entity.Book;

import java.util.List;

public interface mappers {
    List<Book> listAll();
    void  insert(Book book);
    int deleteBook(Integer id);
    int updateBook(Book book);
}
