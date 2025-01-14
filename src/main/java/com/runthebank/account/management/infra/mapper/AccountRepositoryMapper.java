package com.runthebank.account.management.infra.mapper;

import com.runthebank.account.management.domain.model.Account;
import com.runthebank.account.management.infra.repository.entity.AccountData;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountRepositoryMapper {
    Account toDomain(AccountData accountData);

    AccountData toDataRepository(Account account);
}
