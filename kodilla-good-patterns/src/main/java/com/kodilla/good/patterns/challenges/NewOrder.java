package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class NewOrder {

    public OrderRequest order() {
        User user = new User("Jan", "Kowalski", "Akacjowa 14, 12-345 Kokoszyn");
        LocalDate timeOfPurchase = LocalDate.now();
        Product toothbrush = new Toothbrush();
        int quantity = 4;
        return new OrderRequest(user, timeOfPurchase, quantity, toothbrush);

    }
}
