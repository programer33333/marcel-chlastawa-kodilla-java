package com.kodilla.stream.immutable;

public final class ForumUser {
    private final String username;
    private final String relName;

    public ForumUser(final String username, final String relName) {
        this.username = username;
        this.relName = relName;
    }

    public String getRelName() {
        return relName;
    }

    public String getUsername() {
        return username;
    }
}
