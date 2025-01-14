package com.runthebank.account.management.domain.usecase;

import com.runthebank.account.management.domain.exception.BusinessExeption;
import com.runthebank.account.management.domain.model.Customer;
import com.runthebank.account.management.domain.interfaces.CustomerProvider;

public class CustomerUseCase {

    private CustomerProvider customerProvider;

    public CustomerUseCase(CustomerProvider customerProvider) {
        this.customerProvider = customerProvider;
    }

    public Customer createCustomer(Customer customer) {
        var existingCustomer =  getCustomerByDocumentNumber(customer.getDocumentNumber());
        if(existingCustomer) {
            throw new BusinessExeption(String.format("Customer with document number %s is registred!",
                    customer.getDocumentNumber()));
        }
        return customerProvider.createCustomer(customer);
    }

    public boolean getCustomerByDocumentNumber(String documentNumber) {
        return customerProvider.getCustomerByDocumentNumber(documentNumber);
    }

}
