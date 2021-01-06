package com.informed.service;


import com.informed.bookshop.Book;
import com.informed.bookshop.Bookshop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("bookshop")
public class BookshopController {

    @Autowired
    private Bookshop bookshop;

    public BookshopController() throws SQLException {
    }

    @GetMapping("{isbn}")
    public Book getBook(@PathVariable int isbn) {
        System.out.println("BookshopController.getBook(" + isbn + ")");
        return this.bookshop.getBookByISBN(isbn).orElse(null);
    }
    @GetMapping("list")
    public List<Book> getAllBooks() {
        System.out.println("BookshopController.getAllBooks()");
        return bookshop.getBooks();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void addBook(@RequestBody Book book) {
        System.out.println("BookshopController.addBook(" + book + ")");
        this.bookshop.addBook(book);
    }


}