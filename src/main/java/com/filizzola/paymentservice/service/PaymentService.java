package com.filizzola.paymentservice.service;

import com.filizzola.paymentservice.model.Payment;

public interface PaymentService {
  void sendPayment(Payment payment);
}
