package com.javaee.jax_rs_jersey.services;

import com.javaee.jax_rs_jersey.configs.EmailSender;
import com.javaee.jax_rs_jersey.domain.Order;

public class OrderServiceImpl implements OrderService {
	
	public Order createOrder(Order order)
	{
		try {
			//db.save(order); Simulating an insert
			
			EmailSender.sendEmail("Order created successfully", "Congratulations, your order was created !");
			
			return order;	
		} catch (Exception e) {
			EmailSender.sendEmail("Something went wrong", "Your order was not created... =(");
			return null;
		}
	}
	
}
