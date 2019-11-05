/**
 * 
 */
package com.cg.ecommerce.dto;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

/**
 * @author Admin
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

	
	
	@Embedded
	private Address address;
	
	
	
	
		
	public Account() {
		// TODO Auto-generated constructor stub
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
}
