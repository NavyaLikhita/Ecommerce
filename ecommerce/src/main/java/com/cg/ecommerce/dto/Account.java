/**
 * 
 */
package com.cg.ecommerce.dto;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * @author NAVYA
 *
 */

@Entity(name="account")
@EntityListeners({ AuditingEntityListener.class })
public class Account {

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "account_id")
	private Long accountId;
	@Column(name = "username")
	@NotEmpty(message="Username cannot be empty")
	private String username;
	@Column(name = "password")
	@NotEmpty(message="password cannot be empty")
	private String password;
	@Column(name = "account_type")
	@NotEmpty(message="Account Type cannot be empty")
	private String accountType;
	@Column(name = "first_name")
	@NotEmpty(message="First name cannot be empty")
	private String firstName;
	@Column(name = "last_name")
	@NotEmpty(message="Last Name cannot be empty")
	private String lastName;
	@Column(name = "phone_number")
	@NotNull(message="Phone Number cannot be empty")
	private Long phoneNumber;
	@Column(name = "email_id")
	@NotEmpty(message="Account Id cannot be empty")
	private String emailId;

	
	@CreatedBy
	protected String createdBy;

	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	protected Date creationDate;

	@LastModifiedBy
	protected String lastModifiedBy;

	@LastModifiedDate
	protected String lastModifiedDate;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Product> productList;
	
	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "account")
	private List<Order> orderList;
	
	
	
		
	public Account() {
		// TODO Auto-generated constructor stub
	}




	public Account(Long accountId, @NotEmpty(message = "Username cannot be empty") String username,
			@NotEmpty(message = "password cannot be empty") String password,
			@NotEmpty(message = "Account Type cannot be empty") String accountType,
			@NotEmpty(message = "First name cannot be empty") String firstName,
			@NotEmpty(message = "Last Name cannot be empty") String lastName,
			@NotNull(message = "Phone Number cannot be empty") Long phoneNumber,
			@NotEmpty(message = "Account Id cannot be empty") String emailId, String createdBy, Date creationDate,
			String lastModifiedBy, String lastModifiedDate, List<Product> productList, List<Order> orderList) {
		super();
		this.accountId = accountId;
		this.username = username;
		this.password = password;
		this.accountType = accountType;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.lastModifiedBy = lastModifiedBy;
		this.lastModifiedDate = lastModifiedDate;
		this.productList = productList;
		this.orderList = orderList;
	}




	public Long getAccountId() {
		return accountId;
	}




	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}




	public String getUsername() {
		return username;
	}




	public void setUsername(String username) {
		this.username = username;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getAccountType() {
		return accountType;
	}




	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}




	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public Long getPhoneNumber() {
		return phoneNumber;
	}




	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}




	public String getEmailId() {
		return emailId;
	}




	public void setEmailId(String emailId) {
		this.emailId = emailId;
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




	public List<Product> getProductList() {
		return productList;
	}




	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}




	public List<Order> getOrderList() {
		return orderList;
	}




	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}




	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", username=" + username + ", password=" + password
				+ ", accountType=" + accountType + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", phoneNumber=" + phoneNumber + ", emailId=" + emailId + ", createdBy=" + createdBy
				+ ", creationDate=" + creationDate + ", lastModifiedBy=" + lastModifiedBy + ", lastModifiedDate="
				+ lastModifiedDate + ", productList=" + productList + ", orderList=" + orderList + "]";
	}




	

	
	




	
	
	
	
	
	
	
	
	
}
