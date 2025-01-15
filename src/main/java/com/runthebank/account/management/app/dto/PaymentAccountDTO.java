package com.runthebank.account.management.app.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.UUID;

@Data
public class PaymentAccountDTO {

    private UUID id;

    @NotBlank(message = "The bankCode is mandatory.")
    @Size(min = 4, max = 4, message = "bankCode must required 4 characters.")
    private String bankCode;

    @NotBlank(message = "The branchCode is mandatory.")
    @Size(min = 4, max = 4, message = "branchCode must required 4 characters.")
    private String branchCode;

    @NotBlank(message = "The accountNumber is mandatory.")
    @Size(min = 12, max = 12, message = "accountNumber must required 12 characters.")
    private String accountNumber;

}
