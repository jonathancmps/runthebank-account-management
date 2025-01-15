package com.runthebank.account.management.infra.repository.entity;

import com.runthebank.account.management.domain.enums.AccountStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "accounts")
public class AccountData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "bank_code", nullable = false)
    private String bankCode;

    @Column(name = "branch_code", nullable = false, unique = true)
    private String branchCode;

    @Column(name = "account_number", nullable = false)
    private String accountNumber;

    @Column
    private String balance;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private AccountStatus status;
}
