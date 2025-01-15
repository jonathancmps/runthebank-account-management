package com.runthebank.account.management.infra.repository.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "payments")
public class PaymentData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "debit_account_id", nullable = false)
    private AccountData debitAccount;

    @ManyToOne
    @JoinColumn(name = "credit_account_id", nullable = false)
    private AccountData creditAccount;

    @Column(nullable = false, precision = 15, scale = 2)
    private BigDecimal amount;

    private LocalDateTime dateTime;
}
