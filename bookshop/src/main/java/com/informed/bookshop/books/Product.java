package com.informed.bookshop.books;

public abstract class Product implements Sales{
    private String title;
    private double price;
    private double disc;


    public Product(String title, double price) {
        this.title = title;
        this.price = price;
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

    public void setDiscount(double disc) {
        this.disc = disc;
    }
    public double calcSalePrice() {
        return price - (price*disc)/100;
    }


    @Override
    public String toString() {
        return "Product(" +
                "title: " + title + ", price:" + price + ')';
    }

    public abstract void printer();
}
