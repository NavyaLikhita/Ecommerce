/**
 * 
 */
package com.cg.ecommerce.service;

import java.util.Date;
import java.util.List;

import com.cg.ecommerce.dto.Account;

import com.cg.ecommerce.dto.Order;
import com.cg.ecommerce.exception.OrderException;

/**
 * @author NAVYA
 *
 */
public interface OrderService {

	public Order addOrder(Order order);

	public List<Order> showAllOrder() throws OrderException;

	public Order viewOrder(Long orderId) throws OrderException;

	

	//public List<Order> showAllOrdersInSpecifiedTimeBetween(Date dateTime1,Date dateTime2) throws OrderException;
	
	

	//public boolean cancelOrder(Long orderId);

}
