package com.runthebank.account.management.infra.repository;

import com.runthebank.account.management.infra.repository.entity.AccountData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface AccountRepository extends JpaRepository <AccountData, String> {
    boolean existsByBranchCode(String branchCode);
    Optional<AccountData> findAccountById(UUID id);
}
