package com.pearson.coffee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pearson.coffee.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
