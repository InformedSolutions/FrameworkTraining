package com.informed.bookshop;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookTest {

    Book book;
    Author author;
    Publisher publisher;

    @BeforeEach
    void setUp() {

        Address authorAddress = new Address(10, "High Street",
                "Any Town", "Somerset",
                "SA1 23Z");
        author = new Author("Pete Smith", authorAddress, "Technical");
        Address publisherAddress = new Address(1, "Main Street",
                "Some City", "Kent",
                "KA1 43A");
        publisher = new Publisher("Bill Smith", publisherAddress,
                "Tech Books Publishing Ltd.");

//        book = new Book("Java Unleashed", 15.95, author, publisher);
            book = new Book(1, "Java Unleashed", "Java", "Java Man");
    }

    @AfterEach
    void tearDown() {
        book = null;
    }

    @Test
    void testGetAuthor() {
        assertEquals(author, book.getAuthor());
    }

//    @Test
//    void testGetPublisher() {
//        assertEquals(publisher, book.getPublisher());
//    }

    @Test
    void testGetTitle() {
        assertEquals("Java Unleashed", book.getTitle());
    }

//    @Test
//    void testGetPrice() {
//        assertEquals(15.95, book.getPrice());
//    }
//
//    @Test
//    void testSetSaleDiscount() {
//        book.setSaleDiscount(10.0);
//        assertEquals(10.0, book.getSaleDiscount());
//    }
//
//    @Test
//    void testCalculateSalePrice() {
//        book.setSaleDiscount(10.0);
//        assertEquals(14.36, book.calculateSalePrice(), 0.01);
//    }
//
//    @Test
//    void setZeroPrice() {
//        assertThrows(BookshopException.class, () -> book.setPrice(-1.0));
//    }
//
//    @Test
//    void createZeroPriceBook() {
//        assertThrows(BookshopException.class, () -> new Book("Java Unleashed", 0.0, author, publisher));
//    }

}