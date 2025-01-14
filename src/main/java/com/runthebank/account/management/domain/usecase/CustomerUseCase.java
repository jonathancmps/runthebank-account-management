package com.runthebank.account.management.domain.usecase;

import com.runthebank.account.management.domain.exception.DuplicatedResourceException;
import com.runthebank.account.management.domain.model.Customer;
import com.runthebank.account.management.domain.interfaces.CustomerProvider;

public class CustomerUseCase {

    private CustomerProvider customerProvider;

    public CustomerUseCase(CustomerProvider customerProvider) {
        this.customerProvider = customerProvider;
    }

    public Customer createCustomer(Customer customer) {
        var existingCustomer =  findCustomerByDocumentNumber(customer.getDocumentNumber());
        if(existingCustomer) {
            throw new DuplicatedResourceException(String.format("customer with document number %s already registered",
                    customer.getDocumentNumber()));
        }
        return customerProvider.createCustomer(customer);
    }

    public boolean findCustomerByDocumentNumber(String documentNumber) {
        return customerProvider.findCustomerByDocumentNumber(documentNumber);
    }

}
