package com.kodilla.good.patterns.foodSupplier;

public class HealthyShop implements FoodCompanies{
    @Override
    public void process(String companyName, String product, int quantity) {
        System.out.println("You ordered: " + product + " in quantity " + quantity + "\n" +
                "Thank you for choosing " + companyName + ".");
    }
}
