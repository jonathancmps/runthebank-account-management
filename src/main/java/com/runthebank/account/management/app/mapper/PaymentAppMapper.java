package com.runthebank.account.management.app.mapper;

import com.runthebank.account.management.app.dto.PaymentDTO;
import com.runthebank.account.management.domain.model.Payment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PaymentAppMapper {
    Payment toModel(PaymentDTO paymentDTO);
}
