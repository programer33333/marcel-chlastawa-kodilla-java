package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class CheeseDecorator extends AbstractPizzaOrderDecorator {

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4));
    }

    @Override
    public String getDescription() {
        return super.getDescription() +  ", with cheese";
    }
}
