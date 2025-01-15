package com.runthebank.account.management.app.mapper;

import com.runthebank.account.management.app.dto.AccountDTO;
import com.runthebank.account.management.domain.enums.AccountStatus;
import com.runthebank.account.management.domain.model.Account;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface AccountAppMapper {

    @Mapping(target = "status", source = "status", qualifiedByName = "setDefaultStatus")
    Account toModel(AccountDTO accountDto);

    @Named("setDefaultStatus")
    default AccountStatus setDefaultStatus(AccountStatus status) {
        return status != null ? status : AccountStatus.ACTIVE;
    }


}
