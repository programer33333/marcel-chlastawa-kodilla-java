package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    public static List<ForumUser> getUserList() {
        final List<ForumUser> theList = new ArrayList<>();

        theList.add(new ForumUser(39452, "stefan453", 'M', LocalDate.of(1999,01,05), 0));
        theList.add(new ForumUser(39454, "macei", 'M', LocalDate.of(1994,03,16), 6));
        theList.add(new ForumUser(39456, "andrju", 'M', LocalDate.of(1998,07,19), 4));
        theList.add(new ForumUser(39852, "adas", 'F', LocalDate.of(2002,04,05), 1));
        theList.add(new ForumUser(39252, "maciejowa", 'F', LocalDate.of(2008,4,06), 0));
        theList.add(new ForumUser(38452, "ada54235", 'F', LocalDate.of(2007,10,03), 4));
        theList.add(new ForumUser(39482, "kasia34433", 'F', LocalDate.of(2006,02,06), 4));
        theList.add(new ForumUser(33452, "jacyy76", 'M', LocalDate.of(2006,04,02), 10));
        theList.add(new ForumUser(39492, "maly222", 'M', LocalDate.of(1999,05,20), 0));
        theList.add(new ForumUser(39402, "miki4643", 'M', LocalDate.of(1993,11,15), 2));
        theList.add(new ForumUser(33462, "jacia2645", 'F', LocalDate.of(2000,06,01), 3));

        return new ArrayList<>(theList);
    }
}
