package com.kodilla.good.patterns.foodSupplier;

import java.util.HashMap;
import java.util.Map;

public class OrderProcessor {
    private  Map<String, FoodCompanies> companiesMap = new HashMap<>();

    public void orderProcess(String companyName, String product, int quantity) {
        FoodCompanies foodCompany = companiesMap.get(companyName);
        foodCompany.process(companyName, product, quantity);
    }

    public void addCompany(String companyName, FoodCompanies foodCompanies) {
        companiesMap.put(companyName, foodCompanies);
    }
}
