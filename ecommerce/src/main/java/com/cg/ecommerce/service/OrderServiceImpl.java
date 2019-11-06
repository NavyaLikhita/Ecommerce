/**
 * 
 */
package com.cg.ecommerce.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ecommerce.dto.Account;

import com.cg.ecommerce.dto.Order;
import com.cg.ecommerce.repository.AccountRepository;

import com.cg.ecommerce.repository.OrderRepository;

/**
 * @author NAVYA
 *
 */

@Service("orderService")
@Transactional
public class OrderServiceImpl implements OrderService{

	
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
	public List<Order> showAllOrder() {
		// TODO Auto-generated method stub
		
		
		return orderRepository.findAll();
	}

	@Override
	public Order viewOrder(Long orderId) {
		// TODO Auto-generated method stub
		return orderRepository.findById(orderId);
	}

	

	@Override
	public List<Order> showAllOrdersInSpecifiedTimeBetween(Date dateTime1, Date dateTime2) {
		// TODO Auto-generated method stub
		
		
		
		
		return orderRepository.findAllByOrdersInSpecifiedTimeBetween(dateTime1,dateTime2);					//see how 
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
