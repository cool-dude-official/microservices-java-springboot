package com.example.Payment.Service.Port._2.service;

import com.example.Payment.Service.Port._2.dto.PaymentRequest;
import com.example.Payment.Service.Port._2.model.Payment;
import com.example.Payment.Service.Port._2.repository.PaymentRepository;
import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository repo;
    private RazorpayClient client;

    private final String RAZORPAY_KEY = "rzp_test_RjQfiS0CnddaZP";
    private final String RAZORPAY_SECRET = "fRFPCZ7JSNnay1kkMLEaipR2";

    public PaymentServiceImpl(PaymentRepository repo) {
        this.repo = repo;
        try {
            this.client = new RazorpayClient(RAZORPAY_KEY, RAZORPAY_SECRET);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Payment doPayment(PaymentRequest request) {
        Payment payment = new Payment();
        payment.setOrderId(request.getOrderId());
        payment.setAmount(request.getAmount());

        try {
            // Options for Razorpay order
            JSONObject options = new JSONObject();
            options.put("amount", (int)(request.getAmount() * 100));
            options.put("currency", "INR");
            options.put("receipt", "order_rcpt_" + request.getOrderId());

            // ✔ Razorpay correct order creation call
            Order order = client.orders.create(options);

            // Save order ID
            payment.setRazorpayOrderId(order.get("id").toString());
            payment.setStatus("SUCCESS");

        } catch (Exception e) {
            e.printStackTrace();
            payment.setStatus("FAILED");
        }

        return repo.save(payment);
    }

    @Override
    public List<Payment> getAllPayments() {
        return repo.findAll();
    }

    @Override
    public Payment getPaymentById(Long id) {
        return repo.findById(id).orElse(null);
    }
}