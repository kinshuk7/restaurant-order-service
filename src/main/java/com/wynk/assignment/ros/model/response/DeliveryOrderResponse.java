package com.wynk.assignment.ros.model.response;

import com.wynk.assignment.ros.model.Order;

/**
 * @author kinshuk.saraswat
 *
 */
public class DeliveryOrderResponse {
	
	private Order orderDtl;
	
	private DeliveryStatus deliveryStatus;

	/**
	 * @return the orderDtl
	 */
	public Order getOrderDtl() {
		return orderDtl;
	}

	/**
	 * @param orderDtl the orderDtl to set
	 */
	public void setOrderDtl(Order orderDtl) {
		this.orderDtl = orderDtl;
	}

	/**
	 * @return the deliveryStatus
	 */
	public DeliveryStatus getDeliveryStatus() {
		return deliveryStatus;
	}

	/**
	 * @param deliveryStatus the deliveryStatus to set
	 */
	public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	@Override
	public String toString() {
		return "DeliveryOrderResponse [orderDtl=" + orderDtl + ", deliveryStatus=" + deliveryStatus + "]";
	}
}