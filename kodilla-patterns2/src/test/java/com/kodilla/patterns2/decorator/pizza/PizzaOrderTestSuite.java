package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void pizzaWithSalamiMushroomsPepperoniGetCostTest() {
        //Given
        Pizza pizza = new BasicPizzaOrder();
        pizza = new SalamiDecorator(pizza);
        pizza = new MushroomsDecorator(pizza);
        pizza = new PepperoniDecorator(pizza);
        //When
        BigDecimal cost = pizza.getCost();
        //Then
        Assertions.assertEquals(new BigDecimal(25), cost);
    }

    @Test
    public void pizzaWithSalamiMushroomsPepperoniGetDescriptionTest() {
        //Given
        Pizza pizza = new BasicPizzaOrder();
        pizza = new SalamiDecorator(pizza);
        pizza = new MushroomsDecorator(pizza);
        pizza = new PepperoniDecorator(pizza);
        //When
        String description = pizza.getDescription();
        //Then
        Assertions.assertEquals("Basic pizza, with salami, with mushrooms, with pepperoni", description);
    }
}
