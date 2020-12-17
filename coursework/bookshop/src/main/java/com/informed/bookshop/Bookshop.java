package com.informed.bookshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Bookshop {

    private final List<Book> books = new ArrayList<>();

    public Bookshop() {
        setUp();
    }

    private void setUp() {
        Address authorAddress = new Address(10, "High Street",
                "Any Town", "Somerset",
                "SA1 23Z");
        Author author = new Author("Pete Smith", authorAddress, "Technical");
        Author author2 = new Author("Patricia Smith", authorAddress, "Travel");
        Address publisherAddress = new Address(1, "Main Street",
                "Some City", "Kent",
                "KA1 43A");
        Publisher publisher = new Publisher("Bill Smith", publisherAddress,
                "Tech Books Publishing Ltd.");
        Publisher publisher2 = new Publisher("Bill Smith", publisherAddress,
                "Travel Books Publishing Ltd.");

            Book book = createBook("Java Unleashed", 15.95, author, publisher);
            Book book2 = createBook("Java For Professionals", 12.55, author, publisher);
            Book book3 = createBook("Java For Baristas", 12.55, author, publisher);
            Book book4 = createBook("Java For Tourists", 42.95, author2, publisher2);
            Book book5 = createBook("Java For The Javanese ", 12.55, author2, publisher2);

            this.addBook(book);
            this.addBook(book2);
            this.addBook(book3);
            this.addBook(book4);
            this.addBook(book5);

    }

    public void addBook(Book book){
        if (book != null) {
            this.books.add(book);
        }
    }

    private Book createBook(String title, double price, Author author, Publisher publisher) {
        try {
            return new Book(title, price, author, publisher);
        } catch (BookshopException badBook) {
                System.out.println("Error: " + badBook.getMessage() + " for book - " + title);
                return null;
        }
    }

    public List<Book> getBooks() {
        return books;
    }

    private Book getRandomBook() {
        if (books.isEmpty()) {
            return null;
        } else {
            return books.get(new Random().nextInt(books.size()));
        }
    }

    public void printRandomBook() {
        Book book = this.getRandomBook();
        if (book == null) {
            System.out.println("There's no books in this bookshop!");
        } else {
            System.out.println(book);
        }
    }

    public int totalBooks(){
        return this.books.size();
    }

    public Book getBookAtIndex(int index) {
        if (index >= 0 && index < books.size()) {
            return this.books.get(index);
        } else {
            return null;
        }
    }

    public void printBooks(){
        this.getBooks().forEach((book) -> System.out.println("Book: " + book));
    }

    public void printBooks(List<Book> books){
            books.forEach((book) -> System.out.println("Book: " + book));
    }

    public void filterPrice(double price, char flag) {
        List<Book> filteredList;
        switch (flag){
            case '<':
                filteredList = books.stream().filter(book -> book.getPrice() < price).collect(Collectors.toList());
                break;
            case '=':
                filteredList = books.stream().filter(book -> book.getPrice() == price).collect(Collectors.toList());
                break;
            default:
                filteredList = books.stream().filter(book -> book.getPrice() > price).collect(Collectors.toList());
                break;
        }


        if (filteredList.size() == 0) {
            System.out.println("No books found with a price " + flag + " £" + price + ".");
        } else {
            printBooks(filteredList);
        }
    }

    public void filterPrice(double price) {
        filterPrice(price, '>');
    }
}
