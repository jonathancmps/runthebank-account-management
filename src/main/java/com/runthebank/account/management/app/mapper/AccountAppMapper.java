package com.runthebank.account.management.app.mapper;

import com.runthebank.account.management.app.dto.AccountDTO;
import com.runthebank.account.management.domain.model.Account;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountAppMapper {
    Account toModel(AccountDTO accountDto);
}
