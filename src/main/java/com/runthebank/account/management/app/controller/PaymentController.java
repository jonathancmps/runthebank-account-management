package com.runthebank.account.management.app.controller;

import com.runthebank.account.management.app.dto.PaymentDTO;
import com.runthebank.account.management.app.mapper.PaymentAppMapper;
import com.runthebank.account.management.app.service.PaymentService;
import com.runthebank.account.management.domain.model.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @Autowired
    PaymentAppMapper mapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Payment createPayment(@RequestBody PaymentDTO request) {
      return paymentService.createPayment(mapper.toModel(request));
    }

}
