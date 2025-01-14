package com.runthebank.account.management.app.controller;

import com.runthebank.account.management.app.dto.AccountDTO;
import com.runthebank.account.management.app.mapper.AccountAppMapper;
import com.runthebank.account.management.app.service.AccountService;
import com.runthebank.account.management.domain.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    AccountService accountService;

    @Autowired
    AccountAppMapper mapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Account createCustomer(@RequestBody AccountDTO request) {
        return accountService.createAccount(mapper.toModel(request));
    }
}
