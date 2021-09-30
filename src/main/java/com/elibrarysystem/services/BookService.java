package com.elibrarysystem.services;

import java.util.List;

import com.elibrarysystem.domain.Book;


public interface BookService {

    public void save(Book c);

    public void update(Book c);

    public void delete(Integer bookId);

    public void delete(Integer[] bookIds);
    
    public Book findById(Integer bookId);

    public List<Book> findUserBook(Integer userId);

    public List<Book> findUserBook(Integer userId, String txt);
    
    public List<Book> findAll();
}
