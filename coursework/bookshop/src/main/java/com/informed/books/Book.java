package com.informed.books;
/**
 * Represents a Book with a title, author, publisher and a price.
 */
public class Book {
    private String title;
    private double price;
    private Author author;
    private Publisher publisher;
    private double discount;

    public Book(String title, double price, Author author, Publisher publisher) {
        this.title = title;
        this.price = price;
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitle() { return this.title; }

    public void setTitle(String title) { this.title = title; }

    public double getPrice() { return this.price; }

    public void setPrice(double price) { this.price = price; }

    public Author getAuthor() { return this.author; }

    public void setAuthor(Author author) { this.author = author; }

    public Publisher getPublisher() { return publisher; }

    public void setPublisher(Publisher publisher) { this.publisher = publisher; }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double calculateSalePrice() {
        return price - (price * discount / 100);
    }

    @Override
    public String toString() {
        return String.format("Book [title=%s, author=%s, publisher=%s, price=%s]", title, author, publisher, price);
    }
}
