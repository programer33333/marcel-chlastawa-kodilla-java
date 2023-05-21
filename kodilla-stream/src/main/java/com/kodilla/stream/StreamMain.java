
package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<Integer, ForumUser> mapOfUsers = theForum.getUserList().stream()
                .filter(n -> n.getSex() != 'F')
                .filter(n -> n.getBirthDate() < 2003)
                .filter(n -> n.getPostsQuantity() >= 1)
                .collect(Collectors.toMap(ForumUser::getId, n -> n));

        System.out.println(mapOfUsers);
    }
}