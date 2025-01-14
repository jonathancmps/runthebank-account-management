package com.runthebank.account.management.app.controller;

import com.runthebank.account.management.app.dto.CustomerDTO;
import com.runthebank.account.management.app.mapper.CustomerAppMapper;
import com.runthebank.account.management.app.service.CustomerService;
import com.runthebank.account.management.domain.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @Autowired
    CustomerAppMapper mapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer createCustomer(@RequestBody CustomerDTO request) {
        return customerService.createCustomer(mapper.toModel(request));
    }
}
