package com.example.Order.Service.Port._3.dto;

public class OrderRequest {

    private String productName;
    private String brand;
    private int quantity;
    private double amount;

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public String getBrand(){ return brand; }
    public void  setBrand(String brand) { this.brand = brand; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
}
