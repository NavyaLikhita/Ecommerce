/**
 * 
 */
package com.cg.ecommerce.dto;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author Admin
 *
 */
public class Order {

	/**
	 * 
	 */
	
	
	
	
	private Long orderId;
	Address shipmentAddress;
	private Date orderedDateTime;
	private LocalDateTime expectedArrivalTime;
	OrderStatus orderStatus;
	
	
	
	public Order() {
		// TODO Auto-generated constructor stub
	}



	public Order(Long orderId, Address shipmentAddress, Date orderedDateTime, LocalDateTime expectedArrivalTime,
			OrderStatus orderStatus) {
		super();
		this.orderId = orderId;
		this.shipmentAddress = shipmentAddress;
		this.orderedDateTime = orderedDateTime;
		this.expectedArrivalTime = expectedArrivalTime;
		this.orderStatus = orderStatus;
	}



	public Long getOrderId() {
		return orderId;
	}



	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}



	public Address getShipmentAddress() {
		return shipmentAddress;
	}



	public void setShipmentAddress(Address shipmentAddress) {
		this.shipmentAddress = shipmentAddress;
	}



	public Date getOrderedDateTime() {
		return orderedDateTime;
	}



	public void setOrderedDateTime(Date orderedDateTime) {
		this.orderedDateTime = orderedDateTime;
	}



	public LocalDateTime getExpectedArrivalTime() {
		return expectedArrivalTime;
	}



	public void setExpectedArrivalTime(LocalDateTime expectedArrivalTime) {
		this.expectedArrivalTime = expectedArrivalTime;
	}



	public OrderStatus getOrderStatus() {
		return orderStatus;
	}



	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}



	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", shipmentAddress=" + shipmentAddress + ", orderedDateTime="
				+ orderedDateTime + ", expectedArrivalTime=" + expectedArrivalTime + ", orderStatus=" + orderStatus
				+ "]";
	}
	
	
	

}
