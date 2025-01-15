package com.runthebank.account.management.domain.usecase;

import com.runthebank.account.management.domain.exception.CustomerNotPresentException;
import com.runthebank.account.management.domain.exception.DuplicatedResourceException;
import com.runthebank.account.management.domain.interfaces.AccountProvider;
import com.runthebank.account.management.domain.interfaces.CustomerProvider;
import com.runthebank.account.management.domain.model.Account;

public class AccountUseCase {

    private CustomerProvider customerProvider;
    private AccountProvider accountProvider;

    public AccountUseCase(CustomerProvider customerProvider, AccountProvider accountProvider) {
        this.customerProvider = customerProvider;
        this.accountProvider = accountProvider;
    }

    public Account createAccount(Account account) {
        var existingAgency = findExistingAgency(account.getBranchCode());
        var existingDocumentNumber = customerProvider.findCustomerByDocumentNumber(account.getDocumentNumber());

        if(existingAgency) {
            throw new DuplicatedResourceException(String.format("agency %s already registered", account.getBranchCode()));
        }

        if(!existingDocumentNumber) {
            throw new CustomerNotPresentException(String.format("documentNumber %s is not registered", account.getBranchCode()));
        }
        return accountProvider.createAccount(account);
    }

    public Account saveAccount(Account account) {
        return accountProvider.saveAccount(account);
    }

    public boolean findExistingAgency(String branchCode) {
        return accountProvider.findExistingAgency(branchCode);
    }
}
