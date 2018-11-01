package com.javaee.jax_rs_jersey.services;

import java.util.ArrayList;
import java.util.List;

import com.javaee.jax_rs_jersey.domain.Product;;

public class ProductServiceImpl implements ProductService {
	
	private List<Product> products = new ArrayList();
	private Integer actualId = 10;
	
	public ProductServiceImpl() {
		for (int i = 0; i < 10; i++) {
			Product product = new Product();
			product.setId(i);
			product.setName("Name " + i);
			products.add(product);
		}
	}
	
	@Override
	public List<Product> getAll() {
		return products;
	}

}
