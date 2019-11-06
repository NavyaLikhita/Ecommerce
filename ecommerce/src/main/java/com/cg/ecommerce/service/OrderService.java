/**
 * 
 */
package com.cg.ecommerce.service;

import java.util.Date;
import java.util.List;

import com.cg.ecommerce.dto.Account;

import com.cg.ecommerce.dto.Order;

/**
 * @author NAVYA
 *
 */
public interface OrderService {

	public Order addOrder(Order order);

	public List<Order> showAllOrder();

	public Order viewOrder(Long orderId);

	

	public List<Order> showAllOrdersInSpecifiedTimeBetween(Date dateTime1,Date dateTime2);
	
	public Order modifyOrder(Order order);

	//public boolean cancelOrder(Long orderId);

}
