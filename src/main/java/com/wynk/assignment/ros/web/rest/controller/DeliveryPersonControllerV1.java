package com.wynk.assignment.ros.web.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wynk.assignment.ros.model.request.DelegateOrderToDeliveryPerson;
import com.wynk.assignment.ros.model.response.DeliveryOrderResponse;
import com.wynk.assignment.ros.model.response.DeliveryStatus;
import com.wynk.assignment.ros.service.DPService;

@RestController
@RequestMapping("/dp")
public class DeliveryPersonControllerV1 {

	@Autowired
	private DPService dpService;
	
	@PostMapping(value = "/assign-order")
	public ResponseEntity<DeliveryStatus> assignOrderToDeliveryPerson(
			@RequestBody DelegateOrderToDeliveryPerson assignOrderToDP) {
		DeliveryStatus dService = dpService.assignOrderToDeliveryPerson(assignOrderToDP.getOrderId(), assignOrderToDP.getDeliveryPersonId());
		return new ResponseEntity<>(dService, HttpStatus.OK);
	}
	
	@GetMapping(value = "/status")
	public ResponseEntity<DeliveryOrderResponse> getStatusOfDp(@RequestParam("delivetyPersonId") Integer dpId) {
		DeliveryOrderResponse orderResp = dpService.getOrderStatusForPersonId(dpId);
		return new ResponseEntity<>(orderResp, HttpStatus.OK);
	}
}
