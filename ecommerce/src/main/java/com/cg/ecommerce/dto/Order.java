/**
 * 
 */
package com.cg.ecommerce.dto;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author NAVYA
 *
 */
@Entity(name="orders")
@EntityListeners({ AuditingEntityListener.class })
public class Order {

	/**
	 * 
	 */
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_id")
	private Long orderId;
	
	@Column(name="street_line_1")
	@NotEmpty(message="Street Cannot be empty")
	private String streetLine1;
	@Column(name="street_line_2")
	private String streetLine2;
	@Column(name="zipcode")
	@NotEmpty(message="Zipcode Cannot be empty")
	private Long zipCode;
	@Column(name="state")
	@NotEmpty(message="State Cannot be empty")
	private String state;
	
	@Column(name="ordered_date_time")
	@DateTimeFormat(pattern = "mm-dd-yyyy HH:mm:ss")
	private Date orderedDateTime;
	
	@Column(name="local_date_time")
	@DateTimeFormat(pattern = "mm-dd-yyyy HH:mm:ss")
	private LocalDateTime expectedArrivalTime;
	@Column(name="order_status")
	private String orderStatus;
	@Column(name="payment")
	private boolean payment;
	
	
	@CreatedBy
	protected String createdBy;

	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	protected Date creationDate;

	@LastModifiedBy
	protected String lastModifiedBy;

	@LastModifiedDate
	protected String lastModifiedDate;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "account_id")
	private Account account;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(Long orderId, @NotEmpty(message = "Street Cannot be empty") String streetLine1, String streetLine2,
			@NotEmpty(message = "Zipcode Cannot be empty") Long zipCode,
			@NotEmpty(message = "State Cannot be empty") String state, Date orderedDateTime,
			LocalDateTime expectedArrivalTime, String orderStatus, boolean payment, String createdBy, Date creationDate,
			String lastModifiedBy, String lastModifiedDate, Account account) {
		super();
		this.orderId = orderId;
		this.streetLine1 = streetLine1;
		this.streetLine2 = streetLine2;
		this.zipCode = zipCode;
		this.state = state;
		this.orderedDateTime = orderedDateTime;
		this.expectedArrivalTime = expectedArrivalTime;
		this.orderStatus = orderStatus;
		this.payment = payment;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.lastModifiedBy = lastModifiedBy;
		this.lastModifiedDate = lastModifiedDate;
		this.account = account;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getStreetLine1() {
		return streetLine1;
	}

	public void setStreetLine1(String streetLine1) {
		this.streetLine1 = streetLine1;
	}

	public String getStreetLine2() {
		return streetLine2;
	}

	public void setStreetLine2(String streetLine2) {
		this.streetLine2 = streetLine2;
	}

	public Long getZipCode() {
		return zipCode;
	}

	public void setZipCode(Long zipCode) {
		this.zipCode = zipCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
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

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public String getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(String lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", streetLine1=" + streetLine1 + ", streetLine2=" + streetLine2
				+ ", zipCode=" + zipCode + ", state=" + state + ", orderedDateTime=" + orderedDateTime
				+ ", expectedArrivalTime=" + expectedArrivalTime + ", orderStatus=" + orderStatus + ", payment="
				+ payment + ", createdBy=" + createdBy + ", creationDate=" + creationDate + ", lastModifiedBy="
				+ lastModifiedBy + ", lastModifiedDate=" + lastModifiedDate + ", account=" + account + "]";
	}

	


	
	

}
