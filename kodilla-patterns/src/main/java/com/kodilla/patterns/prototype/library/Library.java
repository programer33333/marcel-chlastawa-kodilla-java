package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Board;
import com.kodilla.patterns.prototype.Prototype;
import com.kodilla.patterns.prototype.Task;
import com.kodilla.patterns.prototype.TasksList;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype<Library> {

    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary =  super.clone();
        clonedLibrary.books = new HashSet<>();
        for (Book theBook : books) {
            clonedLibrary.books.add(new Book(theBook.getTitle(), theBook.getAuthor(), theBook.getPublicationDate()));
            }
        return clonedLibrary;
    }

    @Override
    public String toString() {
        String s = "   List [" + name + "]";
        for (Book book : books) {
            s = s + "\n" + book.toString();
        }
        return s;
    }
}