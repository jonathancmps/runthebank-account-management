package com.runthebank.account.management.infra.repository;

import com.runthebank.account.management.infra.repository.entity.AccountData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository <AccountData, String> {
    boolean existsByBranchCode(String branchCode);
}
