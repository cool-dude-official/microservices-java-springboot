package com.example.Payment.Service.Port._2.repository;


import com.example.Payment.Service.Port._2.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}