package com.runthebank.account.management.app.mapper;

import com.runthebank.account.management.app.dto.CustomerDTO;
import com.runthebank.account.management.domain.model.Customer;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface CustomerAppMapper {
    Customer toModel(CustomerDTO customerDto);
}
