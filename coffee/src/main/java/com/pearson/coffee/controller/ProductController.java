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
import com.pearson.coffee.model.Product;
import com.pearson.coffee.repository.ProductRepository;

@RestController
@RequestMapping("//rest/v2")
public class ProductController {

	@Autowired
	private ProductRepository productRepo;

	// Get All Product Details
	@GetMapping("/product")
	public List<Product> getAllProductDetails() {
		return productRepo.findAll();
	}

	// Create Product Details
	@PostMapping("/product")
	public Product createProductDetails(@Valid @RequestBody Product product) {
		return productRepo.save(product);
	}

	// Get Product Details By Id
	@GetMapping("product/{productId}")
	public ResponseEntity<Product> getProductById(@PathVariable(value = "productId") long productId)
			throws ResourceNotFoundException {
		Product product = productRepo.findById(productId)
				.orElseThrow(() -> new ResourceNotFoundException("Product Not Found For this ID: " + productId));
		return ResponseEntity.ok().body(product);
	}

	// Update Product By Id
	@PutMapping("/product/{productId}")
	public ResponseEntity<Product> updateProductById(@PathVariable(value = "productId") long productId,
			@RequestBody Product productDetails) throws ResourceNotFoundException {
		Product product = productRepo.findById(productId).orElseThrow(
				() -> new ResourceNotFoundException("Product Not Found For this ID to update: " + productId));
		product.setProductName(productDetails.getProductName());
		product.setProductDescription(productDetails.getProductDescription());
		product.setProd_Price(productDetails.getProd_Price());
		product.setProd_QtyInStock(productDetails.getProd_QtyInStock());
		productRepo.save(product);
		return ResponseEntity.ok().body(product);
	}

	// Delete Product By Id
	@DeleteMapping("/product/{productId}")
	public ResponseEntity<?> deleteProductById(@PathVariable(value = "productId") long productId)
			throws ResourceNotFoundException {
		productRepo.findById(productId)
				.orElseThrow(() -> new ResourceNotFoundException("Product Not Found For ID to delete: " + productId));
		productRepo.deleteById(productId);
		return ResponseEntity.ok().build();
	}
	
}
