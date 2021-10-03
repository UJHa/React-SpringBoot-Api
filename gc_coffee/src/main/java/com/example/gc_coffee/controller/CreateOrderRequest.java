package com.example.gc_coffee.controller;

import com.example.gc_coffee.model.OrderItem;

import java.util.List;

public record CreateOrderRequest(
        String email, String address, String postcode, List<OrderItem> orderItems
) {
}
