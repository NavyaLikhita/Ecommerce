/**
 * 
 */
package com.cg.ecommerce.dto;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


import javax.validation.constraints.NotEmpty;

/**
 * @author NAVYA
 *
 */

@Entity(name="account")

public class Account {

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "account_id")
	@NotEmpty(message="Account Id cannot be empty")
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
	@NotEmpty(message="Phone Number cannot be empty")
	private BigInteger phoneNumber;
	@Column(name = "email_id")
	@NotEmpty(message="Account Id cannot be empty")
	private String emailId;

	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Product> cart;
	
	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "account")
	private List<Order> order;
	
	
	
		
	public Account() {
		// TODO Auto-generated constructor stub
	}




	public Account(@NotEmpty(message = "Account Id cannot be empty") Long accountId,
			@NotEmpty(message = "Username cannot be empty") String username,
			@NotEmpty(message = "password cannot be empty") String password,
			@NotEmpty(message = "Account Type cannot be empty") String accountType,
			@NotEmpty(message = "First name cannot be empty") String firstName,
			@NotEmpty(message = "Last Name cannot be empty") String lastName,
			@NotEmpty(message = "Phone Number cannot be empty") BigInteger phoneNumber,
			@NotEmpty(message = "Account Id cannot be empty") String emailId, List<Product> cart, List<Order> order) {
		super();
		this.accountId = accountId;
		this.username = username;
		this.password = password;
		this.accountType = accountType;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.cart = cart;
		this.order = order;
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




	public BigInteger getPhoneNumber() {
		return phoneNumber;
	}




	public void setPhoneNumber(BigInteger phoneNumber) {
		this.phoneNumber = phoneNumber;
	}




	public String getEmailId() {
		return emailId;
	}




	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}




	public List<Product> getCart() {
		return cart;
	}




	public void setCart(List<Product> cart) {
		this.cart = cart;
	}




	public List<Order> getOrder() {
		return order;
	}




	public void setOrder(List<Order> order) {
		this.order = order;
	}




	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", username=" + username + ", password=" + password
				+ ", accountType=" + accountType + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", phoneNumber=" + phoneNumber + ", emailId=" + emailId + ", cart=" + cart + ", order=" + order + "]";
	}




	




	
	
	
	
	
	
	
	
	
}
