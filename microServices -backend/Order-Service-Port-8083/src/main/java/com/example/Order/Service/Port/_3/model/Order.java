package com.example.Order.Service.Port._3.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;
    private String brand;
    private int quantity;
    private double amount;

    private LocalDateTime orderTime;

    public Order() {}

    public Order(String productName,String brand, int quantity, double amount) {
        this.productName = productName;
        this.quantity = quantity;
        this.brand = brand ;
        this.amount = amount;
        this.orderTime = LocalDateTime.now();
    }

    // Getters & Setters
    public Long getId() { return id; }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public LocalDateTime getOrderTime() { return orderTime; }
    public void setOrderTime(LocalDateTime orderTime) { this.orderTime = orderTime; }
}