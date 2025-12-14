package com.example.Payment.Service.Port._2.dto;

public class PaymentRequest {

    private Long orderId;
    private double amount;

    public PaymentRequest() {
    }

    public PaymentRequest(Long orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "PaymentRequest{" +
                "orderId=" + orderId +
                ", amount=" + amount +
                '}';
    }
}
