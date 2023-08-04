package com.kodilla.patterns.strategy.predictors;

public class IndividualYoungCustomer extends Customer{

    public IndividualYoungCustomer(String name) {
        super(name);
        this.buyPredictor = new AggressivePredictor();
    }
}
