/**
 * 
 */
package com.cg.ecommerce.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.cg.ecommerce.dto.Order;

/**
 * @author NAVYA
 *
 */
@Repository("orderRepository")
public interface OrderRepository extends JpaRepository<Order,Long> {

	
	//@Query.....
	List<Order> findAllByOrdersInSpecifiedTimeBetween(Date dateTime1,Date dateTime2);
	

	
	
	
}

