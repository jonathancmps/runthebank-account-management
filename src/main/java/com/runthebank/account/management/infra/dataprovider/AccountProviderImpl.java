package com.runthebank.account.management.infra.dataprovider;

import com.runthebank.account.management.domain.interfaces.AccountProvider;
import com.runthebank.account.management.domain.model.Account;
import com.runthebank.account.management.infra.mapper.AccountRepositoryMapper;
import com.runthebank.account.management.infra.repository.AccountRepository;
import com.runthebank.account.management.infra.repository.entity.AccountData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountProviderImpl implements AccountProvider {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private AccountRepositoryMapper mapper;

    @Override
    public boolean findExistingAgency(String branchCode) {
        return accountRepository.existsByBranchCode(branchCode);
    }

    @Override
    public Account createAccount(Account account) {
        AccountData accountData = accountRepository.save(mapper.toDataRepository(account));
        return mapper.toDomain(accountData);
    }
}
