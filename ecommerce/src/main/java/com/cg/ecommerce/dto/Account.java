/**
 * 
 */
package com.cg.ecommerce.dto;

import java.math.BigInteger;

/**
 * @author Admin
 *
 */
public class Account {

	/**
	 * 
	 */
	
	
	private String accountType;
	private String firstName;
	private String lastName;
	private BigInteger phoneNumber;
	private String emailId;
	
	Address address;
	
	User userId;
	
	
		
	public Account() {
		// TODO Auto-generated constructor stub
	}



	public Account(String accountType, String firstName, String lastName, BigInteger phoneNumber, String emailId,
			Address address, User userId) {
		super();
		this.accountType = accountType;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.address = address;
		this.userId = userId;
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



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	public User getUserId() {
		return userId;
	}



	public void setUserId(User userId) {
		this.userId = userId;
	}



	@Override
	public String toString() {
		return "Account [accountType=" + accountType + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", phoneNumber=" + phoneNumber + ", emailId=" + emailId + ", address=" + address + ", userId="
				+ userId + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
