package com.kodilla.good.patterns.challenges;

import java.util.List;

public interface OrderRepository {

    List<Order> saveOrder(Order order);
}
