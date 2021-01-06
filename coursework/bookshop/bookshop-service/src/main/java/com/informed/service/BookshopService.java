package com.informed.service;

import com.informed.bookshop.Bookshop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@SpringBootApplication
@ComponentScan(basePackages = {"com.informed.bookshop", "com.informed.service"})
public class BookshopService {
    public static void main(String[] args) throws SQLException {
        System.out.println("Starting Bookshop Service");
        ConfigurableApplicationContext context = SpringApplication.run(BookshopService.class, args);
        System.out.println("Setup finished");

//        BookDAO dao = new BookDAO();
//        System.out.println("------------------------------------------------------------------");
//        dao.setup();
//        List<Book> books = dao.getAllBooks();
//
//        for (Book book:books) {
//            System.out.println(book.toString());
//
//        }
//
//        dao.saveBook(new Book(9, "Don Quixote", "Adventure","Miguel de Cervantes"));
//        Book donQuixote = dao.getBookByISBN(9);
//        System.out.println("------------------------------------------------------------------");
//        books = dao.getAllBooks();
//
//        for (Book book:books) {
//            System.out.println(book.toString());
//        }
//
//        dao.deleteBook(donQuixote);
//        System.out.println("------------------------------------------------------------------");
//        books = dao.getAllBooks();
//
//        for (Book book:books) {
//            System.out.println(book.toString());
//        }


    }
}