package com.sanjay.springexpensetracker.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sathish.springexpensetracker.models.Balance;

public interface BalanceRepository extends JpaRepository<Balance, Long> {

}
