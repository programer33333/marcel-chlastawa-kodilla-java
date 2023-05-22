
package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum theForum = new Forum();

        LocalDate currentDate = LocalDate.now();

        Map<Integer, ForumUser> mapOfUsers = theForum.getUserList().stream()
                .filter(n -> n.getSex() != 'F')
                .filter(n -> Period.between(n.getBirthDate(), currentDate).getYears() > 20)
                .filter(n -> n.getPostsQuantity() >= 1)
                .collect(Collectors.toMap(ForumUser::getId, n -> n));

        System.out.println(mapOfUsers);
    }
}