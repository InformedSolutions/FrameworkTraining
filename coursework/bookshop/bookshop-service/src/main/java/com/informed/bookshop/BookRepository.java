package com.informed.bookshop;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {

    @Query(value = "SELECT * FROM books WHERE book.title=?1",
            nativeQuery = true)
    Optional<Book> getBookByTitle(String title);

}
