package com.wynk.assignment.ros.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.wynk.assignment.ros.exception.DeliveryPersonIdInvalidException;
import com.wynk.assignment.ros.model.DeliveryPersonModel;
import com.wynk.assignment.ros.model.Order;
import com.wynk.assignment.ros.model.response.DeliveryOrderResponse;
import com.wynk.assignment.ros.model.response.DeliveryStatus;
import com.wynk.assignment.ros.model.response.OrderStatus;

/**
 * @author kinshuk.saraswat
 *
 */
@Service
public class DPServiceImpl implements DPService {

	private static final List<DeliveryPersonModel> dpList = new ArrayList<>();

	static {
		dpList.add(new DeliveryPersonModel(1, DeliveryStatus.UNASSIGNED));
		dpList.add(new DeliveryPersonModel(2, DeliveryStatus.UNASSIGNED));
		dpList.add(new DeliveryPersonModel(3, DeliveryStatus.UNASSIGNED));
		dpList.add(new DeliveryPersonModel(4, DeliveryStatus.UNASSIGNED));
		dpList.add(new DeliveryPersonModel(5, DeliveryStatus.UNASSIGNED));
		dpList.add(new DeliveryPersonModel(6, DeliveryStatus.UNASSIGNED));
		dpList.add(new DeliveryPersonModel(7, DeliveryStatus.UNASSIGNED));
		dpList.add(new DeliveryPersonModel(8, DeliveryStatus.UNASSIGNED));
		dpList.add(new DeliveryPersonModel(9, DeliveryStatus.UNASSIGNED));
		dpList.add(new DeliveryPersonModel(10, DeliveryStatus.UNASSIGNED));
	}

	@Override
	public DeliveryStatus assignOrderToDeliveryPerson(Integer orderId, Integer deliveryPersonId) {
		Order orderDtl = RestaurantOrderServiceImpl.getOrderMap().get(orderId);
		DeliveryPersonModel deliveryPModel = new DeliveryPersonModel();
		for (DeliveryPersonModel dp : dpList) {
			if (dp.getDeliveryPersonId().equals(deliveryPersonId)
					&& dp.getDeliveryStatus() == DeliveryStatus.UNASSIGNED) {
				orderDtl.setDpModel(dp);
				dp.setOrderId(orderId);
				dp.setDeliveryStatus(DeliveryStatus.DELIVERY_ASSIGNED);
				deliveryPModel = dp;
				break;
			}
		}
		orderDtl.setStatus(OrderStatus.DELIVERY_PERSON_ASSIGNED);
		return deliveryPModel.getDeliveryStatus();
	}

	@Override
	public DeliveryOrderResponse getOrderStatusForPersonId(Integer deliveryPersonId) {
		DeliveryOrderResponse orderResponse = new DeliveryOrderResponse();
		Optional<DeliveryPersonModel> dpOpt = dpList.stream()
				.filter(e -> e.getDeliveryPersonId().equals(deliveryPersonId)).findFirst();
		if (dpOpt.isPresent()) {
			orderResponse.setDeliveryStatus(dpOpt.get().getDeliveryStatus());
			orderResponse.setOrderDtl(RestaurantOrderServiceImpl.getOrderMap().get(dpOpt.get().getOrderId()));
		} else {
			throw new DeliveryPersonIdInvalidException("The id=" + deliveryPersonId + " does not exists");
		}
		return orderResponse;
	}

	@Override
	public List<DeliveryPersonModel> fetchStatusOfAllDeliveryPersons() {
		return dpList;
	}
}