package com.kodilla.good.patterns.foodSupplier;

public class ExtraFoodShop implements FoodCompanies {

    @Override
    public void process(String companyName, String product, int quantity) {
        System.out.println("You just ordered: " + product + " x " + quantity + "\n" +
        "Thank you for choosing " + companyName + ".");
    }
}
