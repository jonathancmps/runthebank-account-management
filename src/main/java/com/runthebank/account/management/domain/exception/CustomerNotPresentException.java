package com.runthebank.account.management.domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CustomerNotPresentException extends RuntimeException {
    public CustomerNotPresentException(String message) {
        super(message);
    }
}
