package com.informed.bookshop;

public class BookshopApp {

    public static void main(String[] args) {

        System.out.println("============================");
        System.out.println("Welcome to the Java Bookshop");
        System.out.println("============================");
        Bookshop bookshop = new Bookshop();
        bookshop.printBooks();
        if (bookshop.getBooks().size() > 0) {
            Book book1 = bookshop.getBooks().get(0);
            book1.setSaleDiscount(10.0);
            book1.printSalePrice();
            book1.getAuthor().prettyPrint();
            book1.getPublisher().prettyPrint();
        }

        if (bookshop.getBooks().size() > 1) {
            Sales salesProduct = bookshop.getBooks().get(1);
            salesProduct.setSaleDiscount(10.0);
            salesProduct.printSalePrice();
        }

        bookshop.printRandomBook();
        System.out.println(bookshop.totalBooks());

        Book bookAtIndex = bookshop.getBookAtIndex(3);
        System.out.println(bookAtIndex);
        if (bookAtIndex != null) {
            bookAtIndex.printer();
        }
        System.out.println("============================");
        bookshop.filterPrice(13d, '<');
    }

}
