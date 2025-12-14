package com.example.Order.Service.Port._3.repository;

import com.example.Order.Service.Port._3.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}