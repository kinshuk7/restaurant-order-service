package com.wynk.assignment.ros.model.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author kinshuk.saraswat
 *
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class OrderStatusResponse {

	private Integer orderId;
	
	private OrderStatus status;
	
}
