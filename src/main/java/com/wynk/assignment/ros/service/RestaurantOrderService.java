package com.wynk.assignment.ros.service;

import java.util.List;

import com.wynk.assignment.ros.model.request.ItemInfo;
import com.wynk.assignment.ros.model.response.OrderStatusResponse;

public interface RestaurantOrderService {
	public OrderStatusResponse addOrder(List<ItemInfo> itemList);
}
