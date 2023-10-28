package com.kodilla.hibernate.manytomany.facade;

public class SearchException extends Exception {
    public static String ERR_BAD_REQUEST = "No data found by the given characters";

    public SearchException(String message) {
        super(message);
    }
}
