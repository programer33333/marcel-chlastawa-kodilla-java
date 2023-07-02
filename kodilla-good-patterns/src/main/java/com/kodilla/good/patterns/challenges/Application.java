package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args) {
        NewOrder newOrder = new NewOrder();
        OrderRequest orderRequest = newOrder.order();

        OrderProcessor orderProcessor = new OrderProcessor(new MailSender(), new ProductOrderService(), new OrdersDatabase());
        orderProcessor.process(orderRequest);
    }
}
