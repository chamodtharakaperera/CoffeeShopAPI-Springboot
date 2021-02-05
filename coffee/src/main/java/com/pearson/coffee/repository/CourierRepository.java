package com.pearson.coffee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pearson.coffee.model.Courier;

public interface CourierRepository extends JpaRepository<Courier, Long> {

}
