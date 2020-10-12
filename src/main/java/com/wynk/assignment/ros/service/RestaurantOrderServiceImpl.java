package com.wynk.assignment.ros.service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

	private static final Logger LOGGER = LoggerFactory.getLogger(RestaurantOrderServiceImpl.class);
	
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
		Order orderStat = ORDER_MAP.get(orderId);
		boolean isOrderStateToUpdateIsValid = isOrderStateToUpdateValid(orderStat.getStatus(), orderStatus, orderId);
		BaseResponseModel respBean = new BaseResponseModel();
		if(isOrderStateToUpdateIsValid) {
			respBean.setStatus(ROSConstants.SUCCESS_STATUS);
			orderStat.setStatus(orderStatus);
		} else {
			respBean.setStatus(ROSConstants.FAIL_STATUS);
		}
		return respBean;
	}
	
	private boolean isOrderStateToUpdateValid(OrderStatus currentStatus, OrderStatus finalStatus, Integer orderId) {
		LOGGER.info("orderId={}|orderstatus={}|finalStatus={}", orderId, currentStatus, finalStatus);
		if(OrderStatus.QUEUED.equals(finalStatus)) {
			return false;
		}
		if(OrderStatus.QUEUED.equals(currentStatus)) {
			if(OrderStatus.DELIVERY_PERSON_ASSIGNED.equals(finalStatus)) {
				return true;
			} else {
				return false;
			}
		} else if (OrderStatus.DELIVERY_PERSON_ASSIGNED.equals(currentStatus)) {
			if(OrderStatus.DELIVERED.equals(finalStatus)) {
				return true;
			} else {
				return false;
			}
		} else {
			LOGGER.warn("The order status is already closed");
			return true;
		}
	}
	/**
	 * @return the orderMap
	 */
	public static Map<Integer, Order> getOrderMap() {
		return ORDER_MAP;
	}
}