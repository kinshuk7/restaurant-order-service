package com.wynk.assignment.ros.deliverys.service;

import com.wynk.assignment.ros.model.BaseResponseModel;
import com.wynk.assignment.ros.model.response.DeliveryOrderResponse;

/**
 * @author kinshuk.saraswat
 *
 */
public interface DeliveryPeopleService {
	
	public BaseResponseModel assignOrderToDeliveryPerson(Integer orderId, Integer deliveryPersonId);
	
	public DeliveryOrderResponse getOrderStatusForPersonId(Integer deliveryPersonId);
}