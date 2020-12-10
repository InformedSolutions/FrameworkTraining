package com.informed.books;

import com.informed.books.Address;
import com.informed.books.Author;
import com.informed.books.Book;
import com.informed.books.Publisher;

/**
 * Simple class that provides the entry point
 * to the Bookshop application.
 */

public class BookshopApp {
    public static void main(String [] args) {
        System.out.println("Welcome to the Bookshop App");
        System.out.println("===========================");

        Address authorAddress = new Address(10, "High Street",
                "Any Town", "Somerset",
                "SA1 23Z");
        Author author = new Author("Pete Smith", authorAddress);
        Address publisherAddress = new Address(1, "Main Street",
                "Some City", "Kent",
                "KA1 43A");
        Publisher publisher =
                new Publisher("Tech Books Publishing Ltd.",
                        publisherAddress);
        Book book = new Book("Java Unleashed",15.95,
                author, publisher);
        System.out.println("Book: " + book);
        System.out.println("Calculating the Sales Discount price");
        book.setDiscount(10.0);
        System.out.println("Sale price of book: " +
                book.calculateSalePrice());
    }
}
