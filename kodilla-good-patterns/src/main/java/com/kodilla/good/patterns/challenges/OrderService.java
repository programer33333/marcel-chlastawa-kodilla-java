package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface OrderService {

    void createOrder(LocalDate timeOfPurchase, User user, int quantity, Product product);
}
