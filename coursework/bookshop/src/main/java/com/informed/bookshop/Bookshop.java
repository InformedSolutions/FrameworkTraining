package com.informed.bookshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bookshop {

    List<Book> books = new ArrayList<>();

    public Bookshop() {

        Address authorAddress = new Address(10, "High Street",
                "Any Town", "Somerset",
                "SA1 23Z");
        Author author = new Author("Pete Smith", authorAddress, "Technical");
        Author author2 = new Author("Patricia Smith", authorAddress, "Travel");
        Address publisherAddress = new Address(1, "Main Street",
                "Some City", "Kent",
                "KA1 43A");
        Publisher publisher = new Publisher("Bill Smith", publisherAddress,
                "Tech Books Publishing Ltd.");
        Publisher publisher2 = new Publisher("Bill Smith", publisherAddress,
                "Travel Books Publishing Ltd.");
        Book book = new Book("Java Unleashed",15.95, author, publisher);
        Book book2 = new Book("Java For Professionals", 12.55, author, publisher);
        Book book3 = new Book("Java For Baristas", 12.55, author, publisher);
        Book book4 = new Book("Java For Tourists", 42.95, author2, publisher2);
        Book book5 = new Book("Java For The Javanese ", 12.55, author2, publisher2);

        this.books.add(book);
        this.books.add(book2);
        this.books.add(book3);
        this.books.add(book4);
        this.books.add(book5);
    }

    public List<Book> getBooks() {
        return books;
    }

    private Book getRandomBook() {
        if (books.isEmpty()) {
            return null;
        } else {
            return books.get(new Random().nextInt(books.size()));
        }
    }

    public void printRandomBook() {
        Book book = this.getRandomBook();
        if (book == null) {
            System.out.println("There's no books in this bookshop!");
        } else {
            System.out.println(book);
        }
    }

    public int totalBooks(){
        return this.books.size();
    }

    public Book getBookAtIndex(int index) {
        if (index >= 0 && index < books.size()) {
            return this.books.get(index);
        } else {
            return null;
        }
    }
}
