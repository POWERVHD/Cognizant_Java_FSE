// Exercise - 2
package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService_DI;

public class LibraryApp_DI {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_DI.xml");

        BookService_DI service = context.getBean("bookService", BookService_DI.class);
        service.getBookInfo(101);
    }
}
