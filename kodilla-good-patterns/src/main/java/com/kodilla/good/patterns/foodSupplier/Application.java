package com.kodilla.good.patterns.foodSupplier;

public class Application {
    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor();

        orderProcessor.addCompany("HealthyShop", new HealthyShop());
        orderProcessor.addCompany("ExtraFoodShop", new ExtraFoodShop());
        orderProcessor.addCompany("GlutenFreeShop", new GlutenFreeShop());

        orderProcessor.orderProcess("ExtraFoodShop", "Fish", 5);
    }
}
