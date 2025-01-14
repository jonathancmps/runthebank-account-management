package com.runthebank.account.management.domain.usecase;

import com.runthebank.account.management.domain.exception.DuplicatedResourceException;
import com.runthebank.account.management.domain.interfaces.AccountProvider;
import com.runthebank.account.management.domain.model.Account;

public class AccountUseCase {

    private AccountProvider accountProvider;

    public AccountUseCase(AccountProvider accountProvider) {
        this.accountProvider = accountProvider;
    }

    public Account createAccount(Account account) {
        var  existingAgency = findExistingAgency(account.getBranchCode());
        if(existingAgency) {
            throw new DuplicatedResourceException(String.format("agency %s already registered", account.getBranchCode()));
        }
        return accountProvider.createAccount(account);
    }

    public boolean findExistingAgency(String branchCode) {
        return accountProvider.findExistingAgency(branchCode);
    }
}
