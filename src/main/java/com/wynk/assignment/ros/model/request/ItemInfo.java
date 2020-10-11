package com.wynk.assignment.ros.model.request;

import java.io.Serializable;

public class ItemInfo implements Serializable {

	private static final long serialVersionUID = -342158308043608311L;
	
	private Integer itemId;
	private Integer noOfItem;
	/**
	 * @return the itemId
	 */
	public Integer getItemId() {
		return itemId;
	}
	/**
	 * @param itemId the itemId to set
	 */
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	/**
	 * @return the noOfItem
	 */
	public Integer getNoOfItem() {
		return noOfItem;
	}
	/**
	 * @param noOfItem the noOfItem to set
	 */
	public void setNoOfItem(Integer noOfItem) {
		this.noOfItem = noOfItem;
	}
	@Override
	public String toString() {
		return "ItemInfo [itemId=" + itemId + ", noOfItem=" + noOfItem + "]";
	}
}
