package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class ProductOrderService implements OrderService {
    @Override
    public void createOrder(LocalDate timeOfPurchase, User user, int quantity, String product) {
        System.out.println(user.getName() + " you just ordered " + product + " in quantity " +
                quantity + " in " + timeOfPurchase);
    }
}
