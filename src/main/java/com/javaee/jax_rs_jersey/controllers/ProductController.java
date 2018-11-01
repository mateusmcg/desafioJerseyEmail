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

import com.javaee.jax_rs_jersey.domain.Product;
import com.javaee.jax_rs_jersey.services.ProductService;
import com.javaee.jax_rs_jersey.services.ProductServiceImpl;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import java.util.List;

@Path("/products")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProductController {
	
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	private ProductService productService;
	
	public ProductController() {
		productService = new ProductServiceImpl();
	}
	
	@GET
    public List<Product> getAll() {
        logger.info("getAllProducts: {}");
        List<Product> products = productService.getAll();
        return products;
    }

}
