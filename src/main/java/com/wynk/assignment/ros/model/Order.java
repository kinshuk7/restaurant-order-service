package com.wynk.assignment.ros.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import com.wynk.assignment.ros.model.request.ItemInfo;

/**
 * @author kinshuk.saraswat
 *
 */
public class Order implements Serializable {
	
	private static final long serialVersionUID = -4658526122439922153L;
	
	private Integer orderId;
	private List<ItemInfo> itemInfo;
	private LocalDateTime expectedDeliveryTime;
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
	 * @return the expectedDeliveryTime
	 */
	public LocalDateTime getExpectedDeliveryTime() {
		return expectedDeliveryTime;
	}
	/**
	 * @param expectedDeliveryTime the expectedDeliveryTime to set
	 */
	public void setExpectedDeliveryTime(LocalDateTime expectedDeliveryTime) {
		this.expectedDeliveryTime = expectedDeliveryTime;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", itemInfo=" + itemInfo + ", expectedDeliveryTime=" + expectedDeliveryTime
				+ "]";
	}
}