package com.wynk.assignment.ros.service;

import org.springframework.stereotype.Service;

import com.wynk.assignment.ros.model.response.DeliveryOrderResponse;
import com.wynk.assignment.ros.model.response.DeliveryStatus;

@Service
public class DPServiceImpl implements DPService {

	@Override
	public DeliveryStatus assignOrderToDeliveryPerson(Integer orderId, Integer deliveryPersonId) {
		return null;
	}

	@Override
	public DeliveryOrderResponse getOrderStatusForPersonId(Integer deliveryPersonId) {
		return null;
	}
}
