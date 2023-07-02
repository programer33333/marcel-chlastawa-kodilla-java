package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class OrdersRepository implements OrderRepository {
    private List<OrderRequest> ordersDataList;

    @Override
    public List<OrderRequest> saveOrder(OrderRequest order) {
        ordersDataList = new ArrayList<>();
        ordersDataList.add(order);
        return ordersDataList;
    }
}
