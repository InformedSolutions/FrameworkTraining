package com.informed.bookshop;

public class Book extends Product{

    private static int bookCount;

    public static int getBookCount() {
        return bookCount;
    }

    private Author author;
    private Publisher publisher;

    public Book(String title, double price, Author author, Publisher publisher) {
        super(title, price);
        this.author = author;
        this.publisher = publisher;
        bookCount++;
    }

    public Author getAuthor() {
        return author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    @Override
    public String toString() {
        return "Book(" +
                 this.getTitle() +
                ", £" + this.getPrice() +
                ", " + author +
                ", " + publisher +
                ')';
    }

    public void printer() {
        System.out.println("┍---------------┑");
        System.out.println("| ~~~~~~|~~~~~~ |");
        System.out.println("| ~~~~~~|~~~~~~ |");
        System.out.println("| ~~~~~~|~~~~~~ |");
        System.out.println("| ~~~~~~|~~~~~~ |");
        System.out.println("┕---------------┙");
        System.out.println(getTitle() + " by " + getAuthor().getName());
    }
}
