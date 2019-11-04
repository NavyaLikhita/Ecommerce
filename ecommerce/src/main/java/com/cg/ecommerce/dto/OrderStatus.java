/**
 * 
 */
package com.cg.ecommerce.dto;

/**
 * @author Admin
 *
 */
public class OrderStatus {

	/**
	 * 
	 */
	
	
	
	private String orderStatus;
	Order expectedArrivalDate;
	
	
	
	public OrderStatus() {
		// TODO Auto-generated constructor stub
	}



	public OrderStatus(String orderStatus, Order expectedArrivalDate) {
		super();
		this.orderStatus = orderStatus;
		this.expectedArrivalDate = expectedArrivalDate;
	}



	public String getOrderStatus() {
		return orderStatus;
	}



	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}



	public Order getExpectedArrivalDate() {
		return expectedArrivalDate;
	}



	public void setExpectedArrivalDate(Order expectedArrivalDate) {
		this.expectedArrivalDate = expectedArrivalDate;
	}



	@Override
	public String toString() {
		return "OrderStatus [orderStatus=" + orderStatus + ", expectedArrivalDate=" + expectedArrivalDate + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
