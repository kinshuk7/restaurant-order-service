package com.wynk.assignment.ros.service;

import java.util.List;

import com.wynk.assignment.ros.model.DeliveryPersonModel;
import com.wynk.assignment.ros.model.response.DeliveryOrderResponse;
import com.wynk.assignment.ros.model.response.DeliveryStatus;

/**
 * @author kinshuk.saraswat
 *
 */
public interface DPService {
	
	public DeliveryStatus assignOrderToDeliveryPerson(Integer orderId, Integer deliveryPersonId);
	
	public DeliveryOrderResponse getOrderStatusForPersonId(Integer deliveryPersonId);
	
	public List<DeliveryPersonModel> fetchStatusOfAllDeliveryPersons();
	
}