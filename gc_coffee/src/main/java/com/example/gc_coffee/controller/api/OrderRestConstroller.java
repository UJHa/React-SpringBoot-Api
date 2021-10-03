package com.example.gc_coffee.controller.api;

import com.example.gc_coffee.controller.CreateOrderRequest;
import com.example.gc_coffee.model.Email;
import com.example.gc_coffee.model.Order;
import com.example.gc_coffee.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderRestConstroller {
    private final OrderService orderService;

    public OrderRestConstroller(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/api/v1/orders")
    public Order createOrder(@RequestBody CreateOrderRequest orderRequest) {
        return orderService.createOrder(
                new Email(orderRequest.email()),
                orderRequest.address(),
                orderRequest.postcode(),
                orderRequest.orderItems()
        );
    }
}
