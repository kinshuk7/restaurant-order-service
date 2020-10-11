package com.wynk.assignment.ros.model;

import java.io.Serializable;
import java.util.List;

import com.wynk.assignment.ros.model.request.ItemInfo;
import com.wynk.assignment.ros.model.response.OrderStatus;

/**
 * @author kinshuk.saraswat
 *
 */
public class Order implements Serializable {
	
	private static final long serialVersionUID = -4658526122439922153L;
	
	private Integer orderId;
	private List<ItemInfo> itemInfo;
	private Integer deliveryDurationOfOrder;
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
	 * @return the itemInfo
	 */
	public List<ItemInfo> getItemInfo() {
		return itemInfo;
	}
	/**
	 * @param itemInfo the itemInfo to set
	 */
	public void setItemInfo(List<ItemInfo> itemInfo) {
		this.itemInfo = itemInfo;
	}
	/**
	 * @return the deliveryDurationOfOrder
	 */
	public Integer getDeliveryDurationOfOrder() {
		return deliveryDurationOfOrder;
	}
	/**
	 * @param deliveryDurationOfOrder the deliveryDurationOfOrder to set
	 */
	public void setDeliveryDurationOfOrder(Integer deliveryDurationOfOrder) {
		this.deliveryDurationOfOrder = deliveryDurationOfOrder;
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
		return "Order [orderId=" + orderId + ", itemInfo=" + itemInfo + ", deliveryDurationOfOrder="
				+ deliveryDurationOfOrder + ", status=" + status + "]";
	}
}