package com.runthebank.account.management.domain.interfaces;

import com.runthebank.account.management.domain.model.Payment;

public interface PaymentProvider {
    Payment createPayment(Payment payment);
}
