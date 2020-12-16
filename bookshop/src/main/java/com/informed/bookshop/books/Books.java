package com.informed.bookshop.books;

import java.awt.print.Book;

public class Books extends Product {
    private String title;
    private double price;
    private Authors author;
    private Publisher publisher;


    public Books(String title, double price, Authors author, Publisher publisher) {
        super(title, price);
        this.title = title;
        this.price = price;
        this.author = author;
        this.publisher = publisher;

    }
    public static int counter = 0; {
        ++counter;
    }
    public static int getCount() {
        return (counter);
    }


    public String getTitle() {
        return this.title;
    }

    public double getPrice() {
        return this.price;
    }

    public Authors getAuthor() {
        return this.author;
    }

    public Publisher getPublisher() {
        return this.publisher;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAuthor(Authors author) {
        this.author = author;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Books (" +
                "Title: '" + title + '\'' +
                ", Price: " + price +
                ", Author: '" + author + '\'' +
                ", Publisher: '" + publisher + '\'' +
                ')';
    }

    @Override
    public void printer() {
        System.out.println("book printer");
    }

}
