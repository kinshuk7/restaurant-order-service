package com.wynk.assignment.ros.web.rest.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wynk.assignment.ros.model.request.ItemInfo;
import com.wynk.assignment.ros.model.response.DeliveryStatus;
import com.wynk.assignment.ros.model.response.OrderStatusResponse;

@RestController
public class RestaurantControllerV1 {

	
	@PostMapping(value = "/order")
	public ResponseEntity<OrderStatusResponse> placeOrder(@RequestBody List<ItemInfo> itemList) {
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping(value = "/order/{orderId}")
	public ResponseEntity<OrderStatusResponse> getOrderStatus(@PathVariable("orderId") Integer orderId) {
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PutMapping(value = "/order/{orderId}")
	public ResponseEntity<OrderStatusResponse> updateOrderStatus(@PathVariable("orderId") Integer orderId, @RequestParam("status") DeliveryStatus deliveryStatus) {
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
