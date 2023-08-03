package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Board;
import com.kodilla.patterns.prototype.Task;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("Library 1");
        Book book22 = new Book("Book 22", "Author 22", LocalDate.now());
        library.getBooks().add(book22);
        library.getBooks().add(new Book("Book 1", "Author 1", LocalDate.now()));
        library.getBooks().add(new Book("Book 2", "Author 2", LocalDate.now()));
        library.getBooks().add(new Book("Book 3", "Author 3", LocalDate.now()));
        library.getBooks().add(new Book("Book 4", "Author 4", LocalDate.now()));
        library.getBooks().add(new Book("Book 5", "Author 5", LocalDate.now()));

        //making a shallow clone of object board
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book22);
        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(5, library.getBooks().size());
        assertEquals(5, clonedLibrary.getBooks().size());
        assertEquals(6, deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), clonedLibrary.getBooks());
    }
}
