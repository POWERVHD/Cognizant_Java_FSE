package com.library.service;

import com.library.repository.BookRepository_DI;

public class BookService_DI {
    private BookRepository_DI bookRepository;

    
    public void setBookRepository(BookRepository_DI bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void getBookInfo(int id) {
        String book = bookRepository.findBookById(id);
        System.out.println("Book info: " + book);
    }
}
