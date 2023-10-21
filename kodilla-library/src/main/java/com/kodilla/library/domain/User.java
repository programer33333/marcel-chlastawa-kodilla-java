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
@Table(name = "USER")
public class User {
    Long id;
    String name;
    String surname;
    LocalDate accountCreationDate;

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public Long getId() {
        return id;
    }

    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    @Column(name = "SURNAME")
    public String getSurname() {
        return surname;
    }

    @Column(name = "ACCOUNT_CREATION_DATE")
    public LocalDate getAccountCreationDate() {
        return accountCreationDate;
    }
}