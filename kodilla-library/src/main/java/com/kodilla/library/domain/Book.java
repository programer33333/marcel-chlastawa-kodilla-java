package com.kodilla.library.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.List;

@Entity
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "BOOK")
public class Book {
    private Long id;
    private String title;
    private String author;
    private int releaseDate;
    private List<Copy> copiesList;

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public Long getId() {
        return id;
    }

    @Column(name = "TITLE")
    public String getTitle() {
        return title;
    }

    @Column(name = "AUTHOR")
    public String getAuthor() {
        return author;
    }

    @Column(name = "RELEASE_DATE")
    public int getReleaseDate() {
        return releaseDate;
    }

    @OneToMany(
            mappedBy = "bookId",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    public List<Copy> getCopiesList() {
        return copiesList;
    }
}