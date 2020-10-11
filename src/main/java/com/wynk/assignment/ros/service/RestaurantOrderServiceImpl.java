package com.wynk.assignment.ros.service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wynk.assignment.ros.model.Order;
import com.wynk.assignment.ros.model.request.ItemInfo;
import com.wynk.assignment.ros.model.response.OrderStatusResponse;
import com.wynk.assignment.ros.util.OrderUtil;

@Service
public class RestaurantOrderServiceImpl implements RestaurantOrderService {

	private static final Map<Integer, Order> ORDER_MAP = new ConcurrentHashMap<>();
	
	@Autowired
	private OrderUtil orderUtil;
	
	@Override
	public OrderStatusResponse addOrder(List<ItemInfo> itemList) {
		Integer orderId = orderUtil.generateOrderId();
		Order myOrder = new Order();
		return null;
	}

}
