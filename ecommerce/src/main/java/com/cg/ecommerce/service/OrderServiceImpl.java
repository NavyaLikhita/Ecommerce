/**
 * 
 */
package com.cg.ecommerce.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ecommerce.config.AuditAwareConfiguration;
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

	
	private static final Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);
	
	@Autowired
	OrderRepository orderRepository;
	@Autowired
	AccountRepository accountRepository;

	
	/*
	 * Author: NAVYA Description:to add  order 
	 */
	@Override
	public Order addOrder(Order order) {
		// TODO Auto-generated method stub
		
		logger.info("in service add order");
		return orderRepository.save(order);
	}
	
	/*
	 * Author: NAVYA Description:to display all the orders 
	 */

	@Override
	public List<Order> showAllOrder() throws OrderException {
		// TODO Auto-generated method stub

		logger.info("in service show order");
		List<Order> orderList=orderRepository.findAll();
		if(orderList.isEmpty()) {
			
			throw new OrderException("There Are No Orders");
			
		}
		else
		return orderList;
	}

	
	/*
	 * Author: NAVYA Description:to view the order through id
	 */
	@Override
	public Order viewOrder(Long orderId) throws OrderException {
		// TODO Auto-generated method stub
		
		logger.info("in service view all the orders");
		
		Order orderFound=orderRepository.findByOrderId(orderId);
		if(orderFound==null) {
			
			throw new OrderException("Order Not Found");
			
		}
		
		
		return orderFound;
	}

//	@Override
//	public List<Order> showAllOrdersInSpecifiedTimeBetween(Date dateTime1, Date dateTime2) throws OrderException {
//		// TODO Auto-generated method stub
//		List<Order> orderList=orderRepository.findAllByOrdersInSpecifiedTimeBetween(dateTime1, dateTime2);
//
//		if(orderList.isEmpty()) {
//			
//			throw new OrderException("No Orders Are There In Given Time");
//		}
//		
//		return orderList; // see how
//	}

	
	/**
	 * 
	 */

}
