package com.runthebank.account.management.infra.config;

import com.runthebank.account.management.domain.interfaces.AccountProvider;
import com.runthebank.account.management.domain.interfaces.CustomerProvider;
import com.runthebank.account.management.domain.usecase.AccountUseCase;
import com.runthebank.account.management.domain.usecase.CustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public CustomerUseCase customerUseCase(CustomerProvider customerProvider) {
        return new CustomerUseCase(customerProvider);
    }
    @Bean
    public AccountUseCase accountUseCase(AccountProvider accountProvider) {
        return new AccountUseCase(accountProvider);
    }
}
