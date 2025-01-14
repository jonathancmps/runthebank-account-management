package com.runthebank.account.management.infra.repository.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "accounts")
public class AccountData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "bank_code", nullable = false)
    private String bankCode;

    @Column(name = "branch_code", nullable = false, unique = true)
    private String branchCode;

    @Column(name = "account_number", nullable = false)
    private String accountNumber;

    @Column
    private String balance;

    @Column
    private String status;
}
