package com.informed.bookshop;

import java.sql.*;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class BookDAO_JPA {

    private EntityManager em;

    public void setup() {
        em = EntityManagerSingleton.getEntityManager();
    }

    public Book getBookByISBN(int isbn) throws SQLException {
        return em.find(Book.class, isbn);
    }

    public List<Book> getAllBooks() throws SQLException {
        String jql = "SELECT b FROM Book b";
        TypedQuery<Book> query = em.createQuery(jql, Book.class);
        return query.getResultList();
        }

    public void saveBook(Book book) throws SQLException {
        em.getTransaction().begin();
        em.persist(book);
        em.getTransaction().commit();
    }

    public void deleteBook(Book book) throws SQLException {
        em.getTransaction().begin();
        em.remove(book);
        em.getTransaction().commit();
    }

}
