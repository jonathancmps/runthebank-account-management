package com.runthebank.account.management.app.service;

import com.runthebank.account.management.domain.model.Customer;

import java.util.Optional;

public interface CustomerService {
    public Customer createCustomer(Customer customer);
}
