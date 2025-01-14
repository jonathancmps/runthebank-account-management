package com.runthebank.account.management.app.service.impl;

import com.runthebank.account.management.app.service.AccountService;
import com.runthebank.account.management.domain.model.Account;
import com.runthebank.account.management.domain.usecase.AccountUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountUseCase useCase;

    @Override
    public Account createAccount(Account account) {
        return useCase.createAccount(account);
    }
}
