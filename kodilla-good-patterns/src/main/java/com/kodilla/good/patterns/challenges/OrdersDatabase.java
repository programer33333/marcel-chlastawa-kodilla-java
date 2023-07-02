package com.kodilla.good.patterns.challenges;

import java.util.List;

public class OrdersDatabase implements OrderRepository {
    private List<OrderRequest> ordersDataList;

    @Override
    public List<OrderRequest> saveOrder(OrderRequest order) {
        ordersDataList.add(order);

        return ordersDataList;
    }
}
