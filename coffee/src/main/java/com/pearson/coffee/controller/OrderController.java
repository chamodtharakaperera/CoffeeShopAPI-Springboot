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
import com.pearson.coffee.model.Order;
import com.pearson.coffee.repository.OrderRepository;

@RestController
@RequestMapping("/rest/v2")
public class OrderController {

	@Autowired
	private OrderRepository orderRepo;

	// Get All Order Details
	@GetMapping("/order")
	public List<Order> getAllOrderDetails() {
		return orderRepo.findAll();
	}

	// Create Order Details
	@PostMapping("/order")
	public Order createOrderDetails(@Valid @RequestBody Order order) {
		return orderRepo.save(order);
	}

	// Get Order Details By Id
	@GetMapping("order/{orderId}")
	public ResponseEntity<Order> getOrderById(@PathVariable(value = "orderId") long orderId)
			throws ResourceNotFoundException {
		Order order = orderRepo.findById(orderId)
				.orElseThrow(() -> new ResourceNotFoundException("Order Not Found For this ID: " + orderId));
		return ResponseEntity.ok().body(order);
	}

	// Update Order By Id
	@PutMapping("/order/{orderId}")
	public ResponseEntity<Order> updateOrderById(@PathVariable(value = "orderId") long orderId,
			@RequestBody Order orderDetails) throws ResourceNotFoundException {
		Order order = orderRepo.findById(orderId)
				.orElseThrow(() -> new ResourceNotFoundException("Order Not Found For this ID to update: " + orderId));
		order.setOrderDate(orderDetails.getOrderDate());
		order.setCusId(orderDetails.getCusId());
		order.setOrderDesc(orderDetails.getOrderDesc());
		order.setProductId(orderDetails.getProductId());
		order.setQtyOrdered(orderDetails.getQtyOrdered());
		orderRepo.save(order);
		return ResponseEntity.ok().body(order);
	}

	// Delete Order By Id
	@DeleteMapping("/order/{orderId}")
	public ResponseEntity<?> deleteOrderById(@PathVariable(value = "orderId") long orderId)
			throws ResourceNotFoundException {
		orderRepo.findById(orderId)
				.orElseThrow(() -> new ResourceNotFoundException("Order Not Found For this ID to delete: " + orderId));
		orderRepo.deleteById(orderId);
		return ResponseEntity.ok().build();
	}

}
