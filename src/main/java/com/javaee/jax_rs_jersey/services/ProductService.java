package com.javaee.jax_rs_jersey.services;

import java.util.List;

import com.javaee.jax_rs_jersey.domain.Product;

public interface ProductService {

	List<Product> getAll();

}