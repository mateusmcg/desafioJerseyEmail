package com.javaee.jax_rs_jersey.services;

import com.javaee.jax_rs_jersey.domain.Order;

public class OrderServiceImpl implements OrderService {
	
	public Order createOrder(Order order)
	{
		//db.save(order); Simulating an insert
		
		//ToDo: Send Email
		
		return order;
	}
	
}
