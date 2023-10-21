package com.kodilla.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class RentalDto {
    private Long id;
    private Copy copyId;
    private User userId;
    private LocalDate rentalDate;
    private LocalDate dateOfReturn;
}