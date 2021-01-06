package com.informed.bookshop;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    private static final String url = "jdbc:mysql://localhost/bookshop";
    private static final String user = "root";
    private static final String pwd = "sqlroot1!";
    private Connection conn;

    public void setup() {
        try {
            conn = DriverManager.getConnection(url,user,pwd);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Book getBookByISBN(int isbn) throws SQLException {
        Book book = null;
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM books WHERE ISBN = " + isbn);
        if (rs.next()) {
            String title = rs.getString("title");
            String category = rs.getString("category");
            String author = rs.getString("author");
            book = new Book(isbn, title, category, author);
        }
        st.close();
        return book;
    }

    public List<Book> getAllBooks() throws SQLException {
        List<Book> books = new ArrayList<>();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM books");

        while (rs.next()) {
            int isbn = rs.getInt("isbn");
            String title = rs.getString("title");
            String category = rs.getString("category");
            String author = rs.getString("author");
            books.add(new Book(isbn, title, category, author));
        }

        st.close();
        return books;
    }
    public int saveBook(Book book) throws SQLException {
        String sql = "INSERT INTO books (isbn, title, category, author) VALUES('";
        sql = sql + book.getIsbn() + "', '" + book.getTitle() + "', '" + book.getCategory() + "', '" + book.getAuthor() + "')";
        Statement st = conn.createStatement();
        st.close();
        return st.executeUpdate(sql);
    }

    public int deleteBook(Book book) throws SQLException {
        String sql = "DELETE FROM books WHERE ISBN = '" + book.getIsbn() + "'";
        Statement st = conn.createStatement();
        st.close();
        return st.executeUpdate(sql);
    }



}