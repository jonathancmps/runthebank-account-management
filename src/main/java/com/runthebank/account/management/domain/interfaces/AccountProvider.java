package com.runthebank.account.management.domain.interfaces;

import com.runthebank.account.management.domain.model.Account;

public interface AccountProvider {
    boolean findExistingAgency(String branchCode);

    Account createAccount(Account account);
}
