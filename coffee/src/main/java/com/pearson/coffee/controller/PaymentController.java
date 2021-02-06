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
import com.pearson.coffee.model.Payment;
import com.pearson.coffee.repository.PaymentRepository;



@RestController
@RequestMapping("/rest/v2")
public class PaymentController {
	@Autowired
	private PaymentRepository paymentRepo;

	// Get All Payment Details
	@GetMapping("/payment")
	public List<Payment> getAllPaymentDetails() {
		return paymentRepo.findAll();
	}

	// Create Payment Details
	@PostMapping("/payment")
	public Payment createPaymentDetails(@Valid @RequestBody Payment payment) {
		return paymentRepo.save(payment);
	}

	// Get Payment Details By Id
	@GetMapping("payment/{paymentId}")
	public ResponseEntity<Payment> getPaymentById(@PathVariable(value = "paymentId") long paymentId)
			throws ResourceNotFoundException {
		Payment payment = paymentRepo.findById(paymentId)
				.orElseThrow(() -> new ResourceNotFoundException("Payment Not Found For this ID: " + paymentId));
		return ResponseEntity.ok().body(payment);
	}

	// Update Payment By Id
	@PutMapping("/payment/{paymentId}")
	public ResponseEntity<Payment> updatePaymentById(@PathVariable(value = "paymentId") long paymentId,
			@RequestBody Payment paymentDetails) throws ResourceNotFoundException {
		Payment payment = paymentRepo.findById(paymentId).orElseThrow(
				() -> new ResourceNotFoundException("Payment Not Found For this ID to update: " + paymentId));
		payment.setCusId(paymentDetails.getCusId());
		payment.setPaymentDate(paymentDetails.getPaymentDate());
		payment.setPayment_Amount(paymentDetails.getPayment_Amount());
		paymentRepo.save(payment);
		return ResponseEntity.ok().body(payment);
	}

	// Delete Payment By Id
	@DeleteMapping("/payment/{paymentId}")
	public ResponseEntity<?> deletePaymentById(@PathVariable(value = "paymentId") long paymentId)
			throws ResourceNotFoundException {
		paymentRepo.findById(paymentId).orElseThrow(
				() -> new ResourceNotFoundException("Payment Not Found For this ID to delete: " + paymentId));
		paymentRepo.deleteById(paymentId);
		return ResponseEntity.ok().build();
	}


}
