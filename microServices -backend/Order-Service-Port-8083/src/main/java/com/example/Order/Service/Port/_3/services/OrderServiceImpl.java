package com.example.Order.Service.Port._3.services;

import com.example.Order.Service.Port._3.dto.OrderRequest;
import com.example.Order.Service.Port._3.model.Order;
import com.example.Order.Service.Port._3.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository repo;

    public OrderServiceImpl(OrderRepository repo) {
        this.repo = repo;
    }

    @Override
    public Order placeOrder(OrderRequest orderRequest) {
        Order order = new Order(
                orderRequest.getProductName(),
                orderRequest.getBrand(),
                orderRequest.getQuantity(),
                orderRequest.getAmount()
        );
        return repo.save(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return repo.findAll();
    }
}

