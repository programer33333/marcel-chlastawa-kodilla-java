package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public final class ForumUser {
    private final int id;
    private final String username;
    private final char sex;
    private final LocalDate birthDate;
    private final int postsQuantity;

    public ForumUser(final int id, final String username, final char sex, final LocalDate birthDate, final int postsQuantity) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.birthDate = birthDate;
        this.postsQuantity = postsQuantity;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public int getBirthDate() {
        return birthDate.getYear();
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumUser forumUser = (ForumUser) o;

        if (id != forumUser.id) return false;
        if (sex != forumUser.sex) return false;
        if (postsQuantity != forumUser.postsQuantity) return false;
        if (!Objects.equals(username, forumUser.username)) return false;
        return Objects.equals(birthDate, forumUser.birthDate);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (int) sex;
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + postsQuantity;
        return result;
    }

    @Override
    public String toString() {
        return "username='" + username + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postsQuantity=" + postsQuantity;
    }
}
