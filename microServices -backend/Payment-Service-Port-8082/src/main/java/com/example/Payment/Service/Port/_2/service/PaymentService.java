package com.example.Payment.Service.Port._2.service;

import com.example.Payment.Service.Port._2.dto.PaymentRequest;
import com.example.Payment.Service.Port._2.model.Payment;

import java.util.List;

public interface PaymentService {
    Payment doPayment(PaymentRequest paymentRequest);
    List<Payment> getAllPayments();
    Payment getPaymentById(Long id);
}
