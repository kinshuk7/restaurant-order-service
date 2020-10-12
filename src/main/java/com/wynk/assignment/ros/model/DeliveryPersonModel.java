package com.wynk.assignment.ros.model;

import com.wynk.assignment.ros.model.response.DeliveryStatus;

/**
 * @author kinshuk.saraswat
 *
 */
public class DeliveryPersonModel {

	private Integer deliveryPersonId;
	private DeliveryStatus deliveryStatus;
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
}