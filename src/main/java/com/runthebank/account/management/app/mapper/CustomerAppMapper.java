package com.runthebank.account.management.app.mapper;

import com.runthebank.account.management.app.dto.CustomerDto;
import com.runthebank.account.management.domain.model.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring")
public interface CustomerAppMapper {
    CustomerAppMapper INSTANCE = Mappers.getMapper(CustomerAppMapper.class);
    Customer toModel(CustomerDto customerDto);
}
