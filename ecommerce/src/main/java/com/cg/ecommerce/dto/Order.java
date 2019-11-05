/**
 * 
 */
package com.cg.ecommerce.dto;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Admin
 *
 */
@Entity(name="order")
public class Order {

	/**
	 * 
	 */
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "order_id")
	private Long orderId;
	
	@Embedded
	private Address shipmentAddress;
	
	@Column(name="ordered_date_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date orderedDateTime;
	
	@Column(name="local_date_time")
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime expectedArrivalTime;
	@Column(name="order_status")
	private String orderStatus;
	
	
	
	public Order() {
		// TODO Auto-generated constructor stub
	}



	
	

}
