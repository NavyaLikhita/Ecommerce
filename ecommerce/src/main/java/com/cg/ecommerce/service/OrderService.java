/**
 * 
 */
package com.cg.ecommerce.service;

import java.util.Date;
import java.util.List;

import com.cg.ecommerce.dto.Cart;
import com.cg.ecommerce.dto.Order;

/**
 * @author Admin
 *
 */
public interface OrderService {

	public Order addOrder(Cart cart);

	public List<Order> showAllOrder();

	public Order viewOrder(Long orderId);

	public Order searchOrder(Long orderId);

	public List<Order> showAllOrdersInSpecifiedTime(Date dateTime);

	public Order modifyOrder(Long orderId);

	public boolean cancelOrder(Long orderId);

}
