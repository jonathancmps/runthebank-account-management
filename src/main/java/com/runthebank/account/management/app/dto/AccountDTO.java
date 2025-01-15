package com.runthebank.account.management.app.dto;

import com.runthebank.account.management.domain.enums.AccountStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class AccountDTO {

    @NotBlank(message = "The document number is mandatory.")
    private String documentNumber;

    @NotBlank(message = "The bankCode is mandatory.")
    @Size(min = 4, max = 4, message = "bankCode must required 4 characters.")
    private String bankCode;

    @NotBlank(message = "The branchCode is mandatory.")
    @Size(min = 4, max = 4, message = "branchCode must required 4 characters.")
    private String branchCode;

    @NotBlank(message = "The accountNumber is mandatory.")
    @Size(min = 12, max = 12, message = "accountNumber must required 12 characters.")
    private String accountNumber;

    private AccountStatus status;

    @NotBlank(message = "The balance is mandatory.")
    private BigDecimal balance;

}
