package com.wynk.assignment.ros.service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wynk.assignment.ros.model.BaseResponseModel;
import com.wynk.assignment.ros.model.Order;
import com.wynk.assignment.ros.model.request.ItemInfo;
import com.wynk.assignment.ros.model.response.OrderStatus;
import com.wynk.assignment.ros.model.response.OrderStatusResponse;
import com.wynk.assignment.ros.util.OrderUtil;
import com.wynk.assignment.ros.util.ROSConstants;

@Service
public class RestaurantOrderServiceImpl implements RestaurantOrderService {

	private static final Map<Integer, Order> ORDER_MAP = new ConcurrentHashMap<>();
	
	@Autowired
	private OrderUtil orderUtil;
	
	@Override
	public OrderStatusResponse addOrder(List<ItemInfo> itemList) {
		Integer orderId = orderUtil.generateOrderId();
		Order myOrder = new Order();
		myOrder.setItemInfo(itemList);
		myOrder.setOrderId(orderId);
		myOrder.setDeliveryDurationOfOrder(expectedTimeOfDelivery(itemList));
		myOrder.setStatus(OrderStatus.QUEUED);
		ORDER_MAP.put(orderId, myOrder);
		OrderStatusResponse orderStatResp = new OrderStatusResponse();
		orderStatResp.setOrderId(orderId);
		orderStatResp.setStatus(OrderStatus.QUEUED);
		return orderStatResp;
	}

	private int expectedTimeOfDelivery(List<ItemInfo> itemList) {
		return itemList.stream().mapToInt(e -> e.getNoOfItem()).sum();
	}

	@Override
	public OrderStatus getStatusOfOrder(Integer orderId) {
		Order orderStat = ORDER_MAP.get(orderId);
		return orderStat.getStatus();
	}

	@Override
	public BaseResponseModel updateStatusOfOrder(Integer orderId, OrderStatus orderStatus) {
		BaseResponseModel respBean = new BaseResponseModel();
		respBean.setStatus(ROSConstants.SUCCESS_STATUS);
		return respBean;
	}
	
}