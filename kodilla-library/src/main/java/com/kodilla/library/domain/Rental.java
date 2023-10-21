package com.kodilla.library.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDate;

@Entity
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "RENTAL")
public class Rental {
    private Long id;
    private Copy copyId;
    private User userId;
    private LocalDate rentalDate;
    private LocalDate dateOfReturn;

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public Long getId() {
        return id;
    }

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "COPY_ID")
    public Copy getCopyId() {
        return copyId;
    }

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    public User getUserId() {
        return userId;
    }

    @Column(name = "RENTAL_DATE")
    public LocalDate getRentalDate() {
        return rentalDate;
    }

    @Column(name = "DATE_OF_RETURN")
    public LocalDate getDateOfReturn() {
        return dateOfReturn;
    }
}