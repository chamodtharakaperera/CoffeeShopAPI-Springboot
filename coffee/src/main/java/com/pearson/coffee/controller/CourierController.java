package com.pearson.coffee.controller;


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
import javax.validation.Valid;
import java.util.*;

import com.pearson.coffee.exception.ResourceNotFoundException;

import com.pearson.coffee.model.Courier;
import com.pearson.coffee.repository.CourierRepository;


@RestController
@RequestMapping("/rest/v2")
public class CourierController {

	@Autowired
	private CourierRepository courierRepo;

	// Get All Courier Details
	@GetMapping("/courier")
	public List<Courier> getAllCourierDetails() {
		return courierRepo.findAll();
	}

	// Create Courier Details
	@PostMapping("/courier")
	public Courier createCourierDetails(@Valid @RequestBody Courier courier) {
		return courierRepo.save(courier);
	}

	// Get Courier Details By Id
	@GetMapping("courier/{couriercompId}")
	public ResponseEntity<Courier> getCourierById(@PathVariable(value = "couriercompId") long couriercompId)
			throws ResourceNotFoundException {
		Courier courier = courierRepo.findById(couriercompId).orElseThrow(
				() -> new ResourceNotFoundException("Courier Not Found For this Company ID: " + couriercompId));
		return ResponseEntity.ok().body(courier);
	}

	// Update Courier By Id
	@PutMapping("courier/{couriercompId}")
	public ResponseEntity<Courier> updateCourierById(@PathVariable(value = "couriercompId") long couriercompId,
			@RequestBody Courier courierDetails) throws ResourceNotFoundException {
		Courier courier = courierRepo.findById(couriercompId).orElseThrow(() -> new ResourceNotFoundException(
				"Courier Not Found For this Company ID to update: " + couriercompId));
		courier.setCompName(courierDetails.getCompName());
		courier.setCompAddress(courierDetails.getCompAddress());
		courier.setComptelNo(courierDetails.getComptelNo());
		courierRepo.save(courier);
		return ResponseEntity.ok().body(courier);
	}

	// Delete Courier By Id
	@DeleteMapping("courier/{couriercompId}")
	public ResponseEntity<?> deleteCourierById(@PathVariable(value = "couriercompId") long couriercompId)
			throws ResourceNotFoundException {
		courierRepo.findById(couriercompId).orElseThrow(() -> new ResourceNotFoundException(
				"Courier Not Found For this Company ID to delete: " + couriercompId));
		courierRepo.deleteById(couriercompId);
		return ResponseEntity.ok().build();
	
	}
}
