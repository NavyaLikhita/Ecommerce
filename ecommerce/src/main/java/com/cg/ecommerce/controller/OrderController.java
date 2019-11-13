/**
 * 
 */
package com.cg.ecommerce.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ecommerce.config.AuditAwareConfiguration;
import com.cg.ecommerce.dto.Account;
import com.cg.ecommerce.dto.Order;
import com.cg.ecommerce.exception.OrderException;
import com.cg.ecommerce.service.OrderService;

/**
 * @author NAVYA
 *
 */


@RestController
@RequestMapping("/order")
@CrossOrigin(origins = "http://localhost:4200")
public class OrderController {
	private static final Logger logger = LoggerFactory.getLogger(OrderController.class);
	
	
	@Autowired
	OrderService orderService;
	
	/*
	 * Author: NAVYA Description:adds a new order
	 */
	@PostMapping(value = "/add")
	public ResponseEntity<?> addOrder(@RequestBody Order order) {
		
		logger.info("in add order");
		
		Order orderToBeAdded=orderService.addOrder(order);
		
if(orderToBeAdded==null) {
	logger.warn("order not present");
			return new ResponseEntity("Order Not Added", HttpStatus.INTERNAL_SERVER_ERROR);
			
		}else
		
		return  new ResponseEntity<Order>(orderToBeAdded,HttpStatus.OK); 
		
		
			
		
	}
	
	/*
	 * Author: NAVYA Description:Displays all orders
	 */
	@GetMapping(value="/view")
	public ResponseEntity<?> showAllOrder() throws OrderException{
		
		logger.info("in view order");
		
		List<Order> orderList=orderService.showAllOrder();
		
if(orderList.isEmpty()) {
	logger.warn("orderList is empty");
			return new ResponseEntity("No Orders Present", HttpStatus.INTERNAL_SERVER_ERROR);
			
		}else
		
		return  new ResponseEntity<List<Order>>(orderList,HttpStatus.OK); 
			
		
		
		
	
	}
	
	/*
	 * Author: NAVYA Description:searches particular order through id
	 */
	
	@GetMapping(value="/search")
	public ResponseEntity<?> viewOrder(@RequestParam Long orderId) throws OrderException{
		
		logger.info("in search order");
		
		Order order=orderService.viewOrder(orderId);
if(order==null) {
	logger.warn("order is present");
			return new ResponseEntity("No Orders", HttpStatus.INTERNAL_SERVER_ERROR);
			
		}else
		
		return  new ResponseEntity<Order>(order,HttpStatus.OK); 
		
							
	}
	
//	@GetMapping(value="/view/time")
//	public ResponseEntity<?> showAllOrdersInSpecifiedTimeBetween(@RequestParam Date dateTime1,@RequestParam Date dateTime2) throws OrderException{
//		
//		List<Order> orderList=orderService.showAllOrdersInSpecifiedTimeBetween(dateTime1, dateTime2);
//if(orderList.isEmpty()) {
//			
//			return new ResponseEntity("No Orders Present", HttpStatus.INTERNAL_SERVER_ERROR);
//			
//		}else
//		
//		return  new ResponseEntity<List<Order>>(orderList,HttpStatus.OK); 
//			
//		
//	}
//	
//	
	
	
	
	
}
