package com.informed.bookshop;

import java.sql.SQLException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BookshopApp {

    public static void main(String[] args) throws SQLException {

        System.out.println("============================");
        System.out.println("Welcome to the Java Bookshop");
        System.out.println("============================");

        System.out.println("Starting Bookshop setup");
        ConfigurableApplicationContext context = SpringApplication.run(BookshopApp.class, args);
        System.out.println("Setup finished");
        Bookshop bookshop = context.getBean(Bookshop.class);
        System.out.println(bookshop.getBooks());
        Book b1 = bookshop.getBookByISBN(2).get();
        System.out.println(b1);
        System.out.println(bookshop.getBookByISBN(8).get());
        System.out.println(bookshop.getBookByISBN(4).get());
        System.out.println(bookshop.getBookByISBN(3).get());
        Book b2 = new Book(7, "Java For Professionals", "Technical", "John Anders");
        bookshop.saveBook(b2);
        System.out.println(bookshop.getBooks());
        bookshop.deleteBook(b2);
        System.out.println(bookshop.getBooks());


//        bookshop.printBooks();
//        if (bookshop.getBooks().size() > 0) {
//            Book book1 = bookshop.getBooks().get(0);
//            book1.setSaleDiscount(10.0);
//            book1.printSalePrice();
//            book1.getAuthor().prettyPrint();
//            book1.getPublisher().prettyPrint();
//        }
//
//        if (bookshop.getBooks().size() > 1) {
//            Sales salesProduct = bookshop.getBooks().get(1);
//            salesProduct.setSaleDiscount(10.0);
//            salesProduct.printSalePrice();
//        }
//
//        bookshop.printRandomBook();
//        System.out.println(bookshop.totalBooks());
//
//        Book bookAtIndex = bookshop.getBookAtIndex(3);
//        System.out.println(bookAtIndex);
//        if (bookAtIndex != null) {
//            bookAtIndex.printer();
//        }
//        System.out.println("============================");
//        bookshop.filterPrice(13d, '<');
    }

}
