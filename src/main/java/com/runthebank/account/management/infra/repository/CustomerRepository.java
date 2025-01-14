package com.runthebank.account.management.infra.repository;

import com.runthebank.account.management.infra.repository.entity.CustomerData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerData, Long> {
    Optional<CustomerData> findByDocumentNumber(String documentNumber);
    boolean existsByDocumentNumber(String documentNumber);
}
