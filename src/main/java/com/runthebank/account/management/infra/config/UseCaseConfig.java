package com.runthebank.account.management.infra.config;

import com.runthebank.account.management.domain.interfaces.AccountProvider;
import com.runthebank.account.management.domain.interfaces.CustomerProvider;
import com.runthebank.account.management.domain.interfaces.PaymentProvider;
import com.runthebank.account.management.domain.usecase.AccountUseCase;
import com.runthebank.account.management.domain.usecase.CustomerUseCase;
import com.runthebank.account.management.domain.usecase.PaymentUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public CustomerUseCase customerUseCase(CustomerProvider customerProvider) {
        return new CustomerUseCase(customerProvider);
    }

    @Bean
    public AccountUseCase accountUseCase(CustomerProvider customerProvider,AccountProvider accountProvider) {
        return new AccountUseCase(customerProvider, accountProvider);
    }

    @Bean
    public PaymentUseCase paymentUseCase(PaymentProvider paymentProvider, AccountProvider accountProvider) {
        return new PaymentUseCase(paymentProvider, accountProvider);
    }
}
