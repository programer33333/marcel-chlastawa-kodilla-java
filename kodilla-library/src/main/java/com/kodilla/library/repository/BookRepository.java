package com.kodilla.library.repository;

import com.kodilla.library.domain.Book;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    @Override
    Optional<Book> findById(Long bookId);

    @Override
    void deleteById(Long bookId);

    @Override
    Book save(Book book);

    @Override
    List<Book> findAll();
}