package com.example.Order.Service.Port._3.controller;

import com.example.Order.Service.Port._3.dto.OrderRequest;
import com.example.Order.Service.Port._3.model.Order;
import com.example.Order.Service.Port._3.services.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    // POST → Place Order
    @PostMapping
    public Order placeOrder(@RequestBody OrderRequest orderRequest) {
        return service.placeOrder(orderRequest);
    }

    // GET → Get all orders
    @GetMapping
    public List<Order> getAll() {
        return service.getAllOrders();
    }

    // GET → Test endpoint
    @GetMapping("/test")
    public String test() {
        return "Order service is running";
    }
}
