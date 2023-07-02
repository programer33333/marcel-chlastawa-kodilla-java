package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class Order {

    private User user;
    private LocalDate timeOfOrder;
    private int quantity;
    private String product;

    public Order(User user, LocalDate timeOfOrder, int quantity, String product) {
        this.user = user;
        this.timeOfOrder = timeOfOrder;
        this.quantity = quantity;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getTimeOfOrder() {
        return timeOfOrder;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProduct() {
        return product;
    }
}
