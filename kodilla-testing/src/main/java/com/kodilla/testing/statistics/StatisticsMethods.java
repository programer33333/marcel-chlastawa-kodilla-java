package com.kodilla.testing.statistics;

import java.util.List;

public class StatisticsMethods {
    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double averageQuantityPostsPerUser;
    private double averageQuantityCommentsPerUser;
    private double averageQuantityCommentsPerPost;

    private Statistics statistics;

    public StatisticsMethods(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        postsQuantity = statistics.postsCount();
        List<String> listOfNames = statistics.usersNames();
        usersQuantity = listOfNames.size();
        commentsQuantity = statistics.commentsCount();

        if(usersQuantity > 0) {
            averageQuantityPostsPerUser = (double) postsQuantity / usersQuantity;
            averageQuantityCommentsPerUser = (double) commentsQuantity / usersQuantity;
        }

        if(postsQuantity > 0) {
            averageQuantityCommentsPerPost = (double) commentsQuantity / postsQuantity;
        }
    }

    public void showStatistics() {
        System.out.println("Forum Statistics:");
        System.out.println("Users count: " + usersQuantity);
        System.out.println("Posts count: " + postsQuantity);
        System.out.println("Comments count: " + commentsQuantity);
        System.out.println("Average posts per user: " + averageQuantityPostsPerUser);
        System.out.println("Average comments per user: " + averageQuantityCommentsPerUser);
        System.out.println("Average comments per post: " + averageQuantityCommentsPerPost);
    }

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getAverageQuantityPostsPerUser() {
        return averageQuantityPostsPerUser;
    }

    public double getAverageQuantityCommentsPerUser() {
        return averageQuantityCommentsPerUser;
    }

    public double getAverageQuantityCommentsPerPost() {
        return averageQuantityCommentsPerPost;
    }
}