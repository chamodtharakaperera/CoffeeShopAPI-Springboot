package com.pearson.coffee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pearson.coffee.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
