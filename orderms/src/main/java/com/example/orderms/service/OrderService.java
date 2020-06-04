package com.example.orderms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.orderms.entity.GroceryOrder;
import com.example.orderms.model.OrderRequest;
import com.example.orderms.repository.OrderJPARepository;

@Component
public class OrderService {

	@Autowired
	private OrderJPARepository repo;

	public GroceryOrder saveOrder(OrderRequest request) {
		GroceryOrder groceryOrder = new GroceryOrder();
		groceryOrder.setUserToken(request.getUserToken());
		groceryOrder.setServiceToken(request.getServiceToken());
		groceryOrder.setTransactionToken(request.getTransactionToken());
		groceryOrder.setOrdername(request.getOrderDetails().getOrdername());
		groceryOrder.setDeliveryAddress(request.getOrderDetails().getDeliveryAddress());
		return repo.save(groceryOrder);
	}
	
	
}
