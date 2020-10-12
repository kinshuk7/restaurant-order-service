package com.wynk.assignment.ros.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.wynk.assignment.ros.exception.DeliveryPersonIdInvalidException;
import com.wynk.assignment.ros.model.DeliveryPersonModel;
import com.wynk.assignment.ros.model.Order;
import com.wynk.assignment.ros.model.response.DeliveryOrderResponse;
import com.wynk.assignment.ros.model.response.DeliveryStatus;
import com.wynk.assignment.ros.model.response.OrderStatus;

@Service
public class DPServiceImpl implements DPService {

	private static final List<DeliveryPersonModel> dpList = new ArrayList<>();
	
	@Override
	public DeliveryStatus assignOrderToDeliveryPerson(Integer orderId, Integer deliveryPersonId) {
		Order orderDtl = RestaurantOrderServiceImpl.getOrderMap().get(orderId);
		Optional<DeliveryPersonModel> dpOpt = dpList.stream().filter(e -> e.getDeliveryPersonId() == deliveryPersonId)
				.findFirst();
		if(dpOpt.isPresent()) {
			orderDtl.setDpModel(dpOpt.get());
		} else {
			throw new DeliveryPersonIdInvalidException("The id=" + deliveryPersonId + " does not exists");
		}
		orderDtl.setStatus(OrderStatus.DELIVERY_PERSON_ASSIGNED);
		return null;
	}

	@Override
	public DeliveryOrderResponse getOrderStatusForPersonId(Integer deliveryPersonId) {
		return null;
	}
}
