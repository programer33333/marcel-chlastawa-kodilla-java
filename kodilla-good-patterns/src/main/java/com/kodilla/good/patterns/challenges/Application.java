package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        Order order = new Order(new User("Jan", "Kowalski", "Akacjowa 15"),
                LocalDate.now(), 3, "toothbrush");

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new ProductOrderService(), new OrdersRepository());
        orderProcessor.process(order);
    }
}
