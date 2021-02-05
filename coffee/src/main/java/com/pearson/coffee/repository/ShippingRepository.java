package com.pearson.coffee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pearson.coffee.model.Shipping;

public interface ShippingRepository extends JpaRepository<Shipping, Long> {

}
