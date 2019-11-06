/**
 * 
 */
package com.cg.ecommerce.dto;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author NAVYA
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
	@Column(name="payment")
	private boolean payment;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "account_id")
	private Account account;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(Long orderId, Address shipmentAddress, Date orderedDateTime, LocalDateTime expectedArrivalTime,
			String orderStatus, boolean payment, Account account) {
		super();
		this.orderId = orderId;
		this.shipmentAddress = shipmentAddress;
		this.orderedDateTime = orderedDateTime;
		this.expectedArrivalTime = expectedArrivalTime;
		this.orderStatus = orderStatus;
		this.payment = payment;
		this.account = account;
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

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public boolean isPayment() {
		return payment;
	}

	public void setPayment(boolean payment) {
		this.payment = payment;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", shipmentAddress=" + shipmentAddress + ", orderedDateTime="
				+ orderedDateTime + ", expectedArrivalTime=" + expectedArrivalTime + ", orderStatus=" + orderStatus
				+ ", payment=" + payment + ", account=" + account + "]";
	}

	



	
	

}
