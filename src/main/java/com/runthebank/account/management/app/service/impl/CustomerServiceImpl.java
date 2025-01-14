package com.runthebank.account.management.app.service.impl;

import com.runthebank.account.management.app.service.CustomerService;
import com.runthebank.account.management.domain.model.Customer;
import com.runthebank.account.management.domain.usecase.CustomerUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerUseCase useCase;

    @Override
    public Customer createCustomer(Customer customer) {
        return useCase.createCustomer(customer);
    }
}
