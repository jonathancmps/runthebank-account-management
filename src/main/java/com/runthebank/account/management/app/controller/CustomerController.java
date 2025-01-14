package com.runthebank.account.management.app.controller;

import com.runthebank.account.management.app.dto.CustomerDto;
import com.runthebank.account.management.app.mapper.CustomerAppMapper;
import com.runthebank.account.management.app.service.CustomerService;
import com.runthebank.account.management.domain.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @Autowired
    CustomerAppMapper mapper;

    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody CustomerDto request) {
        var response = customerService.createCustomer(mapper.toModel(request));
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
