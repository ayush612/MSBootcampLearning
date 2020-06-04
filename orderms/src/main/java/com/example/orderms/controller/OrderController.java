package com.example.orderms.controller;

import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderms.entity.GroceryOrder;
import com.example.orderms.model.APIResponse;
import com.example.orderms.model.OrderRequest;
import com.example.orderms.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	private static Logger log = LoggerFactory.getLogger(OrderController.class);
	
	@Autowired
	private OrderService orderService;

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<APIResponse> saveOrder(@RequestBody OrderRequest request) {
		APIResponse response = new APIResponse();
		log.info("OrderRequest - > " + request.toString());
		GroceryOrder groceryOrder = orderService.saveOrder(request);
		if(Objects.nonNull(groceryOrder)) {
			response.setStatus(APIResponse.STATUS_SUCCESS);
		} else {
			response.setStatus(APIResponse.STATUS_ERROR);
		}
		return ResponseEntity.ok(response);
	}
}
