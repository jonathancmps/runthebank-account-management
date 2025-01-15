package com.runthebank.account.management.infra.dataprovider;

import com.runthebank.account.management.domain.interfaces.PaymentProvider;
import com.runthebank.account.management.domain.model.Payment;
import com.runthebank.account.management.infra.mapper.PaymentRepositoryMapper;
import com.runthebank.account.management.infra.repository.PaymentRepository;
import com.runthebank.account.management.infra.repository.entity.PaymentData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentProviderImpl implements PaymentProvider {

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private PaymentRepositoryMapper mapper;

    @Override
    public Payment createPayment(Payment payment) {
        PaymentData paymentData = paymentRepository.save(mapper.toDataRepository(payment));
        return mapper.toDomain(paymentData);
    }
}
