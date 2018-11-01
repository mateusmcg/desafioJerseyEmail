package com.javaee.jax_rs_jersey.domain;

public class Order {
	
	private Integer Id;
	private Integer ProductId;
	private String ClientName;
	private String ClientEmail;
	private Address address;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	
	public Integer getProductId() {
		return ProductId;
	}
	public void setProductId(Integer productId) {
		ProductId = productId;
	}
	
	public String getClientName() {
		return ClientName;
	}
	public void setClientName(String clientName) {
		ClientName = clientName;
	}
	
	public String getClientEmail() {
		return ClientEmail;
	}
	public void setClientEmail(String clientEmail) {
		ClientEmail = clientEmail;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
