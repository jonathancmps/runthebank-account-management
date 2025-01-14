package com.runthebank.account.management.domain.interfaces;

import com.runthebank.account.management.domain.model.Customer;

public interface CustomerProvider {
    Customer createCustomer(Customer customer);

    boolean findCustomerByDocumentNumber(String documentNumber);
}
