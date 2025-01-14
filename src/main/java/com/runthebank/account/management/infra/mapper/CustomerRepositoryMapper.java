package com.runthebank.account.management.infra.mapper;

import com.runthebank.account.management.domain.model.Customer;
import com.runthebank.account.management.infra.repository.entity.CustomerData;
import org.mapstruct.Mapper;

import java.util.Optional;

@Mapper(componentModel = "spring")
public interface CustomerRepositoryMapper {

     Customer toDomain(CustomerData customerData);

     CustomerData toDataRepository(Customer customer);
}
