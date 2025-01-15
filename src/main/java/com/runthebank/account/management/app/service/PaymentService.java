package com.runthebank.account.management.app.service;

import com.runthebank.account.management.domain.model.Payment;

public interface PaymentService {
    Payment createPayment(Payment payment);
}
