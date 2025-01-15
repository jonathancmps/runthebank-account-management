package com.runthebank.account.management.domain.interfaces;

import com.runthebank.account.management.domain.model.Account;

import java.util.UUID;

public interface AccountProvider {
    boolean findExistingAgency(String branchCode);

    Account createAccount(Account account);

    Account findAccountById(UUID id);

    Account saveAccount(Account account);
}
