package com.example.orderms.model;

public class OrderDetails {

	private String ordername;
	private String deliveryAddress;
	public String getOrdername() {
		return ordername;
	}
	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	public OrderDetails(String ordername, String deliveryAddress) {
		super();
		this.ordername = ordername;
		this.deliveryAddress = deliveryAddress;
	}
	public OrderDetails() {
		super();
	}
}
