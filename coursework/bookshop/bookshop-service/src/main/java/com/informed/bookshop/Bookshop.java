package com.informed.bookshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Component
public class Bookshop {

    private List<Book> books = new ArrayList<>();

    @Autowired
    private BookRepoDAO dao = new BookRepoDAO();

    public Bookshop() throws SQLException {
    }

    private void setUp() throws SQLException {
//        Address authorAddress = new Address(10, "High Street",
//                "Any Town", "Somerset",
//                "SA1 23Z");
//        Author author = new Author("Pete Smith", authorAddress, "Technical");
//        Author author2 = new Author("Patricia Smith", authorAddress, "Travel");
//        Address publisherAddress = new Address(1, "Main Street",
//                "Some City", "Kent",
//                "KA1 43A");
//        Publisher publisher = new Publisher("Bill Smith", publisherAddress,
//                "Tech Books Publishing Ltd.");
//        Publisher publisher2 = new Publisher("Bill Smith", publisherAddress,
//                "Travel Books Publishing Ltd.");
//
//            Book book = createBook("Java Unleashed", 15.95, author, publisher);
//            Book book2 = createBook("Java For Professionals", 12.55, author, publisher);
//            Book book3 = createBook("Java For Baristas", 12.55, author, publisher);
//            Book book4 = createBook("Java For Tourists", 42.95, author2, publisher2);
//            Book book5 = createBook("Java For The Javanese ", 12.55, author2, publisher2);
//
//            this.addBook(book);
//            this.addBook(book2);
//            this.addBook(book3);
//            this.addBook(book4);
//            this.addBook(book5);

        books = dao.getAllBooks();
    }

    public void addBook(Book book){
        if (book != null) {
            dao.saveBook(book);
        }
    }

//    private Book createBook(String title, double price, Author author, Publisher publisher) {
//        try {
//            return new Book(title, price, author, publisher);
//        } catch (BookshopException badBook) {
//                System.out.println("Error: " + badBook.getMessage() + " for book - " + title);
//                return null;
//        }
//    }

    private Book createBook(int isbn,String title, String category, String author) {
        try {
            return new Book(isbn, title, category, author);
        } catch (BookshopException badBook) {
            System.out.println("Error: " + badBook.getMessage() + " for book - " + title);
            return null;
        }
    }

    public List<Book> getBooks() {
        return dao.getAllBooks();
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

//    public void filterPrice(double price, char flag) {
//        List<Book> filteredList;
//        switch (flag){
//            case '<':
//                filteredList = books.stream().filter(book -> book.getPrice() < price).collect(Collectors.toList());
//                break;
//            case '=':
//                filteredList = books.stream().filter(book -> book.getPrice() == price).collect(Collectors.toList());
//                break;
//            default:
//                filteredList = books.stream().filter(book -> book.getPrice() > price).collect(Collectors.toList());
//                break;
//        }
//
//
//        if (filteredList.size() == 0) {
//            System.out.println("No books found with a price " + flag + " £" + price + ".");
//        } else {
//            printBooks(filteredList);
//        }
//    }
//
//    public void filterPrice(double price) {
//        filterPrice(price, '>');
//    }

//    public Book getBookByTitle(String title) {
//        return books.stream()
//                .filter(book -> book.getTitle().equalsIgnoreCase(title))
//                .findFirst()
//                .orElse(null);
//    }

//    public Book getBookByPrice(String price) {
//        return books.stream()
//                .filter(book -> book.getPrice() == Double.parseDouble(price))
//                .findFirst()
//                .orElse(null);
//    }

//    public Book getBookByPrice(String priceCheck) {
//
//        char flag = priceCheck.charAt(0);
//        double price = Double.parseDouble(priceCheck.substring(1));
//
//        return books.stream()
//                .filter(book -> book.getTitle().equalsIgnoreCase(title))
//                .findFirst()
//                .orElse(null);
//    }

    public void saveBook(Book book) {
        dao.saveBook(book);
    }

    public void deleteBook(Book book) {
        dao.deleteBook(book);
    }

    public Optional<Book> getBookByISBN(int isbn) {
        return dao.getBookByISBN(isbn);
    }

    public Optional<Book> getBookByTitle(String title) {
        return dao.getBookByTitle(title);
    }
}
