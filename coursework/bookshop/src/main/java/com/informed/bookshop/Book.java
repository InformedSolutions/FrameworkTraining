package com.informed.bookshop;

public class Book {

    private String title;
    private double price;
    private Author author;
    private Publisher publisher;
    private double saleDiscount;

    public Book(String title, double price, Author author, Publisher publisher) {
        this.title = title;
        this.price = price;
        this.author = author;
        this.publisher = publisher;
        this.saleDiscount = 0d;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public double getSaleDiscount() {
        return saleDiscount;
    }

    public void setSaleDiscount(double saleDiscount) {
        this.saleDiscount = saleDiscount;
    }

    private double calculateSalePrice() {
            return price - (price * (saleDiscount/100));
    }

    public void printSalePrice() {
        System.out.printf("Sale price of book: £%.2f\n", this.calculateSalePrice());
    }

    public void printSalePrice(double saleDiscount) {
        this.setSaleDiscount(saleDiscount);
        System.out.printf("Sale price of book: £%.2f\n", this.calculateSalePrice());

    }

    @Override
    public String toString() {
        return "Book(" +
                 title +
                ", £" + price +
                ", " + author +
                ", " + publisher +
                ')';
    }
}
