package com.example.orderms.model;

public class OrderRequest {

	private String userToken;
	private String transactionToken;
	private String serviceToken;
	private OrderDetails orderDetails;
	
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
	public OrderDetails getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(OrderDetails orderDetails) {
		this.orderDetails = orderDetails;
	}
	@Override
	public String toString() {
		return "OrderRequest [userToken=" + userToken + ", transactionToken=" + transactionToken + ", serviceToken="
				+ serviceToken + ", orderDetails=" + orderDetails + "]";
	}

	
}
