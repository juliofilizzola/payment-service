package com.filizzola.paymentservice.service.impl;

import com.filizzola.paymentservice.model.Payment;
import com.filizzola.paymentservice.service.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class PaymentServiceImpl implements PaymentService {
  @Override
  public void sendPayment(Payment payment) {
    log.info("resized payment");
  }
}
