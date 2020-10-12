package com.wynk.assignment.ros.model;

import com.wynk.assignment.ros.model.response.DeliveryStatus;

/**
 * @author kinshuk.saraswat
 *
 */
public class DeliveryPersonModel {

	private Integer deliveryPersonId;
	private DeliveryStatus deliveryStatus;
	private Integer orderId;
	
	/**
	 * 
	 */
	public DeliveryPersonModel() {
		super();
		this.deliveryStatus = DeliveryStatus.UNASSIGNED;
	}
	
	/**
	 * @param deliveryPersonId
	 * @param deliveryStatus
	 */
	public DeliveryPersonModel(Integer deliveryPersonId, DeliveryStatus deliveryStatus) {
		super();
		this.deliveryPersonId = deliveryPersonId;
		this.deliveryStatus = deliveryStatus;
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
}