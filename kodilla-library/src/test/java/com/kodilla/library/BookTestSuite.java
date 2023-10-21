package com.kodilla.library;

import com.kodilla.library.domain.Book;
import com.kodilla.library.repository.BookRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
@Transactional
public class BookTestSuite {

    @Autowired
    private BookRepository bookRepository;

    @AfterEach
    public void cleanUp() {
        bookRepository.deleteAll();
    }

    Book book = new Book();
    Book book1 = new Book();

    @Test
    public void findByIdTest() {
        //Given
        bookRepository.save(book);

        //When
        Long bookId = book.getId();
        Optional<Book> testBook = bookRepository.findById(bookId);
        Long testBookId = testBook.get().getId();

        //Then
        Assertions.assertEquals(bookId, testBook);
    }
}