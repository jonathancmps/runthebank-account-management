package com.runthebank.account.management.app.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class PaymentDTO {
    @NotBlank(message = "The debitAccount number is mandatory.")
    private PaymentAccountDTO debitAccount;

    @NotBlank(message = "The creditAccount number is mandatory.")
    private PaymentAccountDTO creditAccount;

    @NotBlank(message = "The amount number is mandatory.")
    private BigDecimal amount;

}
