package com.wynk.assignment.ros.model.response;

import com.wynk.assignment.ros.model.Order;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author kinshuk.saraswat
 *
 */
@Getter
@Setter
@ToString
public class DeliveryOrderResponse {
	
	private Order orderDtl;
	
	private DeliveryStatus deliveryStatus;
}