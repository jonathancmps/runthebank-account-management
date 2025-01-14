package com.runthebank.account.management.app.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public class AccountDTO {

    @NotBlank(message = "The bankCode is mandatory.")
    @Size(min = 4, max = 4, message = "bankCode must required 4 characters.")
    private String bankCode;

    @NotBlank(message = "The branchCode is mandatory.")
    @Size(min = 4, max = 4, message = "branchCode must required 4 characters.")
    private String branchCode;

    @NotBlank(message = "The accountNumber is mandatory.")
    @Size(min = 12, max = 12, message = "accountNumber must required 12 characters.")
    private String accountNumber;

    @NotBlank(message = "The password is mandatory.")
    private BigDecimal balance;

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
