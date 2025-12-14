package com.example.Payment.Service.Port._2.controller;

import com.example.Payment.Service.Port._2.dto.PaymentRequest;
import com.example.Payment.Service.Port._2.model.Payment;
import com.example.Payment.Service.Port._2.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    private final PaymentService service;

    public PaymentController(PaymentService service) {
        this.service = service;
    }

    // POST → Create Payment
    @PostMapping
    public Payment doPayment(@RequestBody PaymentRequest request) {
        return service.doPayment(request);
    }

    // GET → Test endpoint
    @GetMapping("/test")
    public String test() {
        return "Payment service is running";
    }

    // GET → Get all payments
    @GetMapping
    public List<Payment> getAllPayments() {
        return service.getAllPayments();
    }

    // GET → Get payment by id
    @GetMapping("/{id}")
    public Payment getPaymentById(@PathVariable Long id) {
        return service.getPaymentById(id);
    }
}
