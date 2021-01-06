package com.informed.bookshop;

//public class Book extends Product{
//
//    private static int bookCount;
//
//    public static int getBookCount() {
//        return bookCount;
//    }
//
//    private Author author;
//    private Publisher publisher;
//
//    public Book(String title, double price, Author author, Publisher publisher) {
//        super(title, price);
//        this.author = author;
//        this.publisher = publisher;
//        bookCount++;
//    }
//
//    public Author getAuthor() {
//        return author;
//    }
//
//    public Publisher getPublisher() {
//        return publisher;
//    }
//
//    @Override
//    public String toString() {
//        return "Book(" +
//                 this.getTitle() +
//                ", £" + this.getPrice() +
//                ", " + author +
//                ", " + publisher +
//                ')';
//    }
//
//    public void printer() {
//            System.out.println("┍---------------┑");
//            System.out.println("| ~~~~~~|~~~~~~ | " + getTitle());
//            System.out.println("| ~~~~~~|~~~~~~ | by");
//            System.out.println("| ~~~~~~|~~~~~~ | " + getAuthor().getName());
//            System.out.println("| ~~~~~~|~~~~~~ |");
//            System.out.println("┕---------------┙");
//    }
//}

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book {

    @Id
    private int isbn;
    private String title;
    private String category;
    private String author;
    public Book() {}
    public Book(int isbn, String title, String category, String author) {
        this.isbn = isbn;
        this.title = title;
        this.category = category;
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }


    @Override
    public String toString() {
        return "Book(" +
                 this.getIsbn() +
                ", " + this.getTitle() +
                ", " + this.getCategory() +
                ", " + this.getAuthor() +
                ')';
    }
}

