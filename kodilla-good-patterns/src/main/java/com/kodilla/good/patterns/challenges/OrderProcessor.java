package com.kodilla.good.patterns.challenges;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                          final OrderService orderService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public void process(final OrderRequest order) {
         orderService.createOrder(order.getTimeOfOrder(), order.getUser(), order.getQuantity(), order.getProduct());
         informationService.inform(order.getUser());
         orderRepository.saveOrder(order);
    }
}
