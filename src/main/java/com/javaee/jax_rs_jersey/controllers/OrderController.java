package com.javaee.jax_rs_jersey.controllers;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import com.javaee.jax_rs_jersey.domain.Order;
import com.javaee.jax_rs_jersey.domain.Product;
import com.javaee.jax_rs_jersey.services.OrderService;
import com.javaee.jax_rs_jersey.services.OrderServiceImpl;
import com.javaee.jax_rs_jersey.services.ProductService;
import com.javaee.jax_rs_jersey.services.ProductServiceImpl;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import java.util.List;

@Path("/orders")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class OrderController {
	
	private static final Logger logger = LoggerFactory.getLogger(OrderController.class);
	
	private OrderService orderService;
	
	public OrderController() {
		orderService = new OrderServiceImpl();
	}
	
	@POST
    public Response createOrder(Order order, @Context UriInfo uriInfo) {
        logger.info("addProduct: {}", order);
        Order savedOrder = orderService.createOrder(order);
        if(savedOrder != null) {
	        logger.debug("Created order with id = ", savedOrder.getId());
	        UriBuilder builder = uriInfo.getAbsolutePathBuilder();
	        builder.path(savedOrder.getId().toString());
	        return Response.created(builder.build()).entity(savedOrder).build();
        }else {
        	UriBuilder builder = uriInfo.getAbsolutePathBuilder();
	        builder.path("error");
	        return Response.created(builder.build()).build();
        }
    }

}
