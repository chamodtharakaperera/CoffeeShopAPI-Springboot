package com.pearson.coffee.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan({ "com.pearson.coffee.controller" })
@EntityScan(basePackages = { "com.pearson.coffee.model" })
@EnableJpaRepositories("com.pearson.coffee.repository")
@EnableSwagger2
public class CoffeeShopApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoffeeShopApiApplication.class, args);
	}

}
