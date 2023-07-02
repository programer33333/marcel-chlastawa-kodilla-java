package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class OrdersRepository implements OrderRepository {
    private List<Order> ordersDataList;

    @Override
    public List<Order> saveOrder(Order order) {
        ordersDataList = new ArrayList<>();
        ordersDataList.add(order);
        return ordersDataList;
    }
}
