package com.wynk.assignment.ros.deliverys.service;

import com.wynk.assignment.ros.deliverys.model.response.DeliveryOrderResponse;
import com.wynk.assignment.ros.model.BaseResponseModel;

/**
 * @author kinshuk.saraswat
 *
 */
public interface DeliveryPeopleService {
	
	public BaseResponseModel assignOrderToDeliveryPerson(Integer orderId, Integer deliveryPersonId);
	
	public DeliveryOrderResponse getOrderStatusForPersonId(Integer deliveryPersonId);
}
