package com.kodilla.library.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "COPIES")
public class Copy {
    private Long id;
    private Book bookId;
    private Status status;
    private Rental rental;

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public Long getId() {
        return id;
    }

    @ManyToOne
    @JoinColumn(name = "BOOK_ID")
    public Book getBookId() {
        return bookId;
    }

    @Column(name = "STATUS")
    public Status getStatus() {
        return status;
    }

    @OneToOne
    public Rental getRental() {
        return rental;
    }
}