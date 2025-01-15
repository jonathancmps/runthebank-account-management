package com.runthebank.account.management.app.service.impl;

import com.runthebank.account.management.app.service.PaymentService;
import com.runthebank.account.management.domain.model.Payment;
import com.runthebank.account.management.domain.usecase.PaymentUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentUseCase useCase;

    @Override
    public Payment createPayment(Payment payment) {
        return useCase.createPayment(payment);
    }
}
