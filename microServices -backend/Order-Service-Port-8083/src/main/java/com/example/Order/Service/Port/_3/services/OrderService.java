package com.example.Order.Service.Port._3.services;

import com.example.Order.Service.Port._3.dto.OrderRequest;
import com.example.Order.Service.Port._3.model.Order;
import java.util.List;

public interface OrderService {
    Order placeOrder(OrderRequest orderRequest);
    List<Order> getAllOrders();
}