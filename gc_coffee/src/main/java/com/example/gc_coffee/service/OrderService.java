package com.example.gc_coffee.service;

import com.example.gc_coffee.model.Email;
import com.example.gc_coffee.model.Order;
import com.example.gc_coffee.model.OrderItem;
import org.springframework.stereotype.Service;

import java.util.List;

public interface OrderService {

    Order createOrder(Email email, String address, String postcode, List<OrderItem> orderItems);
}
