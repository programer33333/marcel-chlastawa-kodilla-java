package com.kodilla.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CopyDto {
    private Long id;
    private Book bookId;
    private Status status;
}