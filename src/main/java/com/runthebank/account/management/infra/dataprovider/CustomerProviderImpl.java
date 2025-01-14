package com.runthebank.account.management.infra.dataprovider;

import com.runthebank.account.management.domain.model.Customer;
import com.runthebank.account.management.domain.interfaces.CustomerProvider;
import com.runthebank.account.management.infra.mapper.CustomerRepositoryMapper;
import com.runthebank.account.management.infra.repository.CustomerRepository;
import com.runthebank.account.management.infra.repository.entity.CustomerData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerProviderImpl implements CustomerProvider {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerRepositoryMapper mapper;

    @Override
    public boolean findCustomerByDocumentNumber(String documentNumber) {
        return customerRepository.existsByDocumentNumber(documentNumber);
    }

    @Override
    public Customer createCustomer(Customer customer) {
        CustomerData customerData = customerRepository.save(mapper.toDataRepository(customer));
        return mapper.toDomain(customerData);
    }
}
