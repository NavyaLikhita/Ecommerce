/**
 * 
 */
package com.cg.ecommerce.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ecommerce.dto.Order;
import com.cg.ecommerce.exception.OrderException;
import com.cg.ecommerce.repository.AccountRepository;

import com.cg.ecommerce.repository.OrderRepository;

/**
 * @author NAVYA
 *
 */

@Service("orderService")
@Transactional
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository orderRepository;
	@Autowired
	AccountRepository accountRepository;

	@Override
	public Order addOrder(Order order) {
		// TODO Auto-generated method stub
		return orderRepository.save(order);
	}

	@Override
	public List<Order> showAllOrder() throws OrderException {
		// TODO Auto-generated method stub

		
		List<Order> orderList=orderRepository.findAll();
		if(orderList.isEmpty()) {
			
			throw new OrderException("There Are No Orders");
			
		}
		else
		return orderList;
	}

	@Override
	public Order viewOrder(Long orderId) throws OrderException {
		// TODO Auto-generated method stub
		
		
		Order orderFound=orderRepository.findByOrderId(orderId);
		if(orderFound==null) {
			
			throw new OrderException("Order Not Found");
			
		}
		
		
		return orderFound;
	}

	@Override
	public List<Order> showAllOrdersInSpecifiedTimeBetween(Date dateTime1, Date dateTime2) throws OrderException {
		// TODO Auto-generated method stub
		List<Order> orderList=orderRepository.findAllByOrdersInSpecifiedTimeBetween(dateTime1, dateTime2);

		if(orderList.isEmpty()) {
			
			throw new OrderException("No Orders Are There In Given Time");
		}
		
		return orderList; // see how
	}

	@Override
	public Order modifyOrder(Order order) {
		// TODO Auto-generated method stub

		return null;
	}

	/**
	 * 
	 */

}
