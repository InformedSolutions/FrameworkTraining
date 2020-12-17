package com.informed.bookshop;

public abstract class Product implements Sales {
    private String title;
    private double price;
    private double saleDiscount;

    public Product(String title, double price) {
        this.title = title;
        this.setPrice(price);
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
        if (price > 0) {
            this.price = price;
        } else {
            throw new BookshopException("Invalid Price");
        }
    }

    public double getSaleDiscount() {
        return saleDiscount;
    }

    public void setSaleDiscount(double saleDiscount) {
        this.saleDiscount = saleDiscount;
    }

    public double calculateSalePrice() {
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
        return "Product(" +
                title +
                ", £" + price +
                ')';
    }

    public abstract void printer();
}
