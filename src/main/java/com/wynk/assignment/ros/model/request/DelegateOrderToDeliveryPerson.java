package com.wynk.assignment.ros.model.request;

import java.io.Serializable;

import org.springframework.lang.NonNull;

/**
 * @author kinshuk.saraswat
 *
 */
public class DelegateOrderToDeliveryPerson implements Serializable {

	private static final long serialVersionUID = 2527922667508987725L;

	@NonNull
	private Integer orderId;
	@NonNull
	private Integer deliveryPersonId;

	/**
	 * @return the orderId
	 */
	public Integer getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the deliveryPersonId
	 */
	public Integer getDeliveryPersonId() {
		return deliveryPersonId;
	}

	/**
	 * @param deliveryPersonId the deliveryPersonId to set
	 */
	public void setDeliveryPersonId(Integer deliveryPersonId) {
		this.deliveryPersonId = deliveryPersonId;
	}

	@Override
	public String toString() {
		return "DelegateOrderToDeliveryPerson [orderId=" + orderId + ", deliveryPersonId=" + deliveryPersonId + "]";
	}
}
