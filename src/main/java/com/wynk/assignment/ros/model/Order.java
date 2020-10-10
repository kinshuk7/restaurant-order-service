package com.wynk.assignment.ros.model;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Order {

	private Integer orderId;
	
	private LocalDateTime expectedDeliveryTime;

}