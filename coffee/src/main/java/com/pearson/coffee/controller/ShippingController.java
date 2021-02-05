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
import com.pearson.coffee.model.Shipping;
import com.pearson.coffee.repository.ShippingRepository;


@RestController
@RequestMapping("//rest/v2")
public class ShippingController {

	@Autowired
	private ShippingRepository shipRepo;

	// Get All Shipping Details
	@GetMapping("/all")
	public List<Shipping> getAllShippingDetails() {
		return shipRepo.findAll();
	}

	// Create Shipping Details
	@PostMapping("/create")
	public Shipping createShippingDetails(@Valid @RequestBody Shipping shipping) {
		return shipRepo.save(shipping);
	}

	// Get Shipping Details By Id
	@GetMapping("select/{shippingId}")
	public ResponseEntity<Shipping> getShippingById(@PathVariable(value = "shippingId") long shippingId)
			throws ResourceNotFoundException {
		Shipping shipping = shipRepo.findById(shippingId).orElseThrow(
				() -> new ResourceNotFoundException("Shipping Details Not Found For this ID: " + shippingId));
		return ResponseEntity.ok().body(shipping);
	}

	// Update Shipping By Id
	@PutMapping("/update/{shippingId}")
	public ResponseEntity<Shipping> updateShippingById(@PathVariable(value = "shippingId") long shippingId,
			@RequestBody Shipping shippingDetails) throws ResourceNotFoundException {
		Shipping shipping = shipRepo.findById(shippingId).orElseThrow(
				() -> new ResourceNotFoundException("Shipping Details Not Found For this ID to update: " + shippingId));
		shipping.setCouriercompId(shippingDetails.getCouriercompId());
		shipping.setOrderId(shippingDetails.getOrderId());
		shipping.setShipped_Date(shippingDetails.getShipped_Date());
		shipping.setShipping_Status(shippingDetails.getShipping_Status());
		shipRepo.save(shipping);
		return ResponseEntity.ok().body(shipping);
	}

	// Delete Shipping By Id
	@DeleteMapping("/delete/{shippingId}")
	public ResponseEntity<?> deleteShippingById(@PathVariable(value = "shippingId") long shippingId)
			throws ResourceNotFoundException {
		shipRepo.findById(shippingId).orElseThrow(
				() -> new ResourceNotFoundException("Shipping Details Not Found For this ID to delete: " + shippingId));
		shipRepo.deleteById(shippingId);
		return ResponseEntity.ok().build();
	}
}
