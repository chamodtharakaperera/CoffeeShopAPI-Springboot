package com.pearson.coffee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pearson.coffee.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
