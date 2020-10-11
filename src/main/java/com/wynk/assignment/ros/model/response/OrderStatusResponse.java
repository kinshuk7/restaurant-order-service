package com.wynk.assignment.ros.model.response;

/**
 * @author kinshuk.saraswat
 *
 */
public class OrderStatusResponse {

	private Integer orderId;
	
	private OrderStatus status;

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
	 * @return the status
	 */
	public OrderStatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "OrderStatusResponse [orderId=" + orderId + ", status=" + status + "]";
	}
}
