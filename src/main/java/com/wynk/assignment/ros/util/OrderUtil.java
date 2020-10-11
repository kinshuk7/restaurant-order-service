package com.wynk.assignment.ros.util;

import org.springframework.stereotype.Component;

/**
 * @author kinshuk.saraswat
 *
 */
@Component
public class OrderUtil {

	private static Integer initVal = 1;
	
	private static final Object obj = new Object();
	
	/**
	 * @return
	 */
	public Integer generateOrderId() {
		int orderId;
		synchronized(obj) {
			orderId = initVal;
			initVal++;
		}
		return orderId;
	}
	
}
