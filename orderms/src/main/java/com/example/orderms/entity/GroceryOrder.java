package com.example.orderms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="groceryorder")
public class GroceryOrder {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer orderId;
	@Column(name = "token")
	private String userToken;
	private String transactionToken;
	private String serviceToken;
	private String ordername;
	private String deliveryAddress;
	
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getUserToken() {
		return userToken;
	}
	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}
	public String getTransactionToken() {
		return transactionToken;
	}
	public void setTransactionToken(String transactionToken) {
		this.transactionToken = transactionToken;
	}
	public String getServiceToken() {
		return serviceToken;
	}
	public void setServiceToken(String serviceToken) {
		this.serviceToken = serviceToken;
	}
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
	public GroceryOrder() {
		super();
	}
	public GroceryOrder(String userToken, String transactionToken, String serviceToken, String ordername,
			String deliveryAddress) {
		super();
		this.userToken = userToken;
		this.transactionToken = transactionToken;
		this.serviceToken = serviceToken;
		this.ordername = ordername;
		this.deliveryAddress = deliveryAddress;
	}
	
}
