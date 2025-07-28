package com.library.repository;

public class BookRepository_DI {
    public String findBookById(int id) {
        return "Book #" + id + " retrieved from repository (DI)";
    }
}
