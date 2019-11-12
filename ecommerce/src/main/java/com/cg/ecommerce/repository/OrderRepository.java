/**
 * 
 */
package com.cg.ecommerce.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.cg.ecommerce.dto.Order;

/**
 * @author NAVYA
 *
 */
@Repository("orderRepository")
public interface OrderRepository extends JpaRepository<Order,Long> {

//	
//	@Query("SELECT o FROM Order WHERE o.orderedDateTime BETWEEN :dateTime1 AND :dateTime2")
//	List<Order> findAllByOrdersInSpecifiedTimeBetween(@Param(value = "dateTime1") Date dateTime1,@Param(value = "dateTime2") Date dateTime2);

	Order findByOrderId(Long orderId);
	

	
	
	
}

