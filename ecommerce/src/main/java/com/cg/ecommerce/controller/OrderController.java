/**
 * 
 */
package com.cg.ecommerce.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
public class OrderController {

	
	
	@Autowired
	OrderService orderService;
	
	
	@PostMapping(value = "/add")
	public ResponseEntity<?> addAccount(@RequestBody Order order) {
		
		Order orderToBeAdded=orderService.addOrder(order);
		
if(orderToBeAdded==null) {
			
			return new ResponseEntity("Order Not Added", HttpStatus.INTERNAL_SERVER_ERROR);
			
		}else
		
		return  new ResponseEntity<Order>(orderToBeAdded,HttpStatus.OK); 
		
		
			
		
	}
	
	
	@GetMapping(value="/view")
	public ResponseEntity<?> showAllOrder() throws OrderException{
		
		List<Order> orderList=orderService.showAllOrder();
		
if(orderList.isEmpty()) {
			
			return new ResponseEntity("No Orders Present", HttpStatus.INTERNAL_SERVER_ERROR);
			
		}else
		
		return  new ResponseEntity<List<Order>>(orderList,HttpStatus.OK); 
			
		
		
		
	
	}
	
	
	@GetMapping(value="/search")
	public ResponseEntity<?> viewOrder(@RequestParam Long orderId) throws OrderException{
		
		Order order=orderService.viewOrder(orderId);
if(order==null) {
			
			return new ResponseEntity("No Orders", HttpStatus.INTERNAL_SERVER_ERROR);
			
		}else
		
		return  new ResponseEntity<Order>(order,HttpStatus.OK); 
		
							
	}
	
	@GetMapping(value="/view/time")
	public ResponseEntity<?> showAllOrdersInSpecifiedTimeBetween(@RequestParam Date dateTime1,@RequestParam Date dateTime2) throws OrderException{
		
		List<Order> orderList=orderService.showAllOrdersInSpecifiedTimeBetween(dateTime1, dateTime2);
if(orderList.isEmpty()) {
			
			return new ResponseEntity("No Orders Present", HttpStatus.INTERNAL_SERVER_ERROR);
			
		}else
		
		return  new ResponseEntity<List<Order>>(orderList,HttpStatus.OK); 
			
		
	}
	
	
	
	
	
	
}
