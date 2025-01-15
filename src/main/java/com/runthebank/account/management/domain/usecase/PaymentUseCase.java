package com.runthebank.account.management.domain.usecase;

import com.runthebank.account.management.domain.exception.InsufficientBalanceExceprion;
import com.runthebank.account.management.domain.interfaces.AccountProvider;
import com.runthebank.account.management.domain.interfaces.PaymentProvider;
import com.runthebank.account.management.domain.model.Payment;


public class PaymentUseCase {

    private final PaymentProvider paymentProvider;
    private final AccountProvider accountProvider;

    public PaymentUseCase(PaymentProvider paymentProvider, AccountProvider accountProvider) {
        this.paymentProvider = paymentProvider;
        this.accountProvider = accountProvider;
    }

    public Payment createPayment(Payment payment) {
        var debtAccount = accountProvider.findAccountById(payment.getDebitAccount().getId());
        var creditAccount = accountProvider.findAccountById(payment.getCreditAccount().getId());

        if(debtAccount.getBalance().compareTo(payment.getAmount()) < 0) {
            throw new InsufficientBalanceExceprion(String.format("account %s has isufficient balance",
                    debtAccount.getAccountNumber()));
        }

        debtAccount.setBalance(debtAccount.getBalance().subtract(payment.getAmount()));
        creditAccount.setBalance(creditAccount.getBalance().add(payment.getAmount()));
        var updatedDebitAcount = accountProvider.saveAccount(debtAccount);
        var updatedCreditAccount = accountProvider.saveAccount(creditAccount);
        payment.setDebitAccount(updatedDebitAcount);
        payment.setCreditAccount(updatedCreditAccount);

        return paymentProvider.createPayment(payment);
    }
}
