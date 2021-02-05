package com.pearson.coffee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pearson.coffee.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
