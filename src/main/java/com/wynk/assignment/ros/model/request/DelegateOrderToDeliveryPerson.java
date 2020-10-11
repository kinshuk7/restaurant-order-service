package com.wynk.assignment.ros.model.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@NoArgsConstructor
public class DelegateOrderToDeliveryPerson {

	private Integer orderId;
	
	private Integer deliveryPersonId;
	
}
