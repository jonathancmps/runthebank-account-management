package com.runthebank.account.management.infra.repository;

import com.runthebank.account.management.infra.repository.entity.CustomerData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<CustomerData, Long> {
    Optional<CustomerData> findByDocumentNumber(String documentNumber);
    boolean existsByDocumentNumber(String documentNumber);
}
