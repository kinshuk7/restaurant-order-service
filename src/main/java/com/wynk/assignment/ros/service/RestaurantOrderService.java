package com.wynk.assignment.ros.service;

import java.util.List;

import com.wynk.assignment.ros.model.BaseResponseModel;
import com.wynk.assignment.ros.model.request.ItemInfo;
import com.wynk.assignment.ros.model.response.OrderStatus;
import com.wynk.assignment.ros.model.response.OrderStatusResponse;

public interface RestaurantOrderService {
	
	public OrderStatusResponse addOrder(List<ItemInfo> itemList);
	
	public BaseResponseModel updateStatusOfOrder(Integer orderId, OrderStatus orderStatus);
	
	public OrderStatus getStatusOfOrder(Integer orderId);
}
