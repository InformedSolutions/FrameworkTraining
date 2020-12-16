package com.informed.bookshop;

import com.informed.bookshop.books.*;

class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Java Bookshop");
        System.out.println("============================");

        Address authorAddress = new Address(10, "High Street",
                "Any", "Somerset", "SA1 23Z");
        Authors author = new Authors("James Soi", 21, authorAddress, "tech");

        Address publisherAddress = new Address(1, "Main Street",
                "CityB",
                "Kent", "KA1 43A");

        Publisher publisher = new Publisher("Tech Books Publishing ltd",
                publisherAddress);

        Books book = new Books("Java Unleashed",
                15.95, author, publisher);
        System.out.println("Book: " + book);

        System.out.println("Calc the sales discount price");
        book.setDiscount(10.0);
        System.out.println("Sale price of book: " +
                book.calcSalePrice());
/*
        Authors author1 = new Authors("Pete Smith",
                23, authorAddress, "Auto-bio");

        Publisher publisher1 = new Publisher ("Bill Smith",
                publisherAddress);

*/
        Books book2 = new Books("Java for Professionals", 12.55,
                author,publisher);

        System.out.println("\nBook2: " + book2);
        System.out.println("Book Instance Count: " + Books.getCount());

        Sales salesProduct = book;
        salesProduct.setDiscount(10.0);
        System.out.println("Sale price of book: "
                + salesProduct.calcSalePrice());

        author.prettyPrint();

    }
}
