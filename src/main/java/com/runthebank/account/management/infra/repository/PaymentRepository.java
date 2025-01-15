package com.runthebank.account.management.infra.repository;

import com.runthebank.account.management.infra.repository.entity.PaymentData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PaymentRepository extends JpaRepository <PaymentData, UUID>{
}
