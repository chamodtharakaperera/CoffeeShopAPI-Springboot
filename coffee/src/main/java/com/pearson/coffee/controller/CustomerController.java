package com.pearson.coffee.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pearson.coffee.exception.ResourceNotFoundException;
import com.pearson.coffee.model.Customer;
import com.pearson.coffee.repository.CustomerRepository;

@RestController
@RequestMapping("/rest/v2")
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepo;

	// Get All Customer Details
	@GetMapping("/customer")
	public List<Customer> getAllCustomerDetails() {
		return customerRepo.findAll();
	}

	// Create Customer Details
	@PostMapping("/customer")
	public Customer createCustomerDetails(@Valid @RequestBody Customer customer) {
		return customerRepo.save(customer);
	}

	// Get Customer Details By Id
	@GetMapping("customer/{cusId}")
	public ResponseEntity<Customer> getCourierById(@PathVariable(value = "cusId") long cusId)
			throws ResourceNotFoundException {
		Customer customer = customerRepo.findById(cusId)
				.orElseThrow(() -> new ResourceNotFoundException("Customer Not Found: " + cusId));
		return ResponseEntity.ok().body(customer);
	}

	// Update Customer By Id
	@PutMapping("/customer/{cusId}")
	public ResponseEntity<Customer> updateCourierById(@PathVariable(value = "cusId") long cusId,
			@RequestBody Customer customerDetails) throws ResourceNotFoundException {
		Customer customer = customerRepo.findById(cusId)
				.orElseThrow(() -> new ResourceNotFoundException("Customer Not Found For Update: " + cusId));
		customer.setCusFName(customerDetails.getCusFName());
		customer.setCusLName(customerDetails.getCusLName());
		customer.setCusCity(customerDetails.getCusCity());
		customer.setCusAddress(customerDetails.getCusAddress());
		customer.setCusTel(customerDetails.getCusTel());
		customer.setCusPostalCode(customerDetails.getCusPostalCode());
		customer.setCusState(customerDetails.getCusState());
		customerRepo.save(customer);
		return ResponseEntity.ok().body(customer);
	}

	// Delete Customer By Id
	@DeleteMapping("/customer/{cusId}")
	public ResponseEntity<?> deleteCourierById(@PathVariable(value = "cusId") long cusId)
			throws ResourceNotFoundException {
		customerRepo.findById(cusId)
				.orElseThrow(() -> new ResourceNotFoundException("Customer Not Found For this ID to delete: " + cusId));
		customerRepo.deleteById(cusId);
		return ResponseEntity.ok().build();
	}

}
