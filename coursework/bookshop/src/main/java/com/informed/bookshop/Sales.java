package com.informed.bookshop;

public interface Sales {

    double getSaleDiscount();

    void setSaleDiscount(double saleDiscount);

    void printSalePrice();

    void printSalePrice(double saleDiscount);
}
