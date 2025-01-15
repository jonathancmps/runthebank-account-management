package com.runthebank.account.management.infra.mapper;

import com.runthebank.account.management.domain.model.Payment;
import com.runthebank.account.management.infra.repository.entity.PaymentData;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PaymentRepositoryMapper {

    Payment toDomain(PaymentData paymentData);

    PaymentData toDataRepository(Payment payment);
}
