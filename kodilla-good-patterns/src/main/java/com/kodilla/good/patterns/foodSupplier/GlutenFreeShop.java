package com.kodilla.good.patterns.foodSupplier;

public class GlutenFreeShop implements FoodCompanies {
    @Override
    public void process(String companyName, String product, int quantity) {
        System.out.println("Processing new order: " + quantity + " x " + product + ".\n" +
                "Order added to the system, \n" +
                "Thank you for choosing " + companyName + ".");
    }
}
