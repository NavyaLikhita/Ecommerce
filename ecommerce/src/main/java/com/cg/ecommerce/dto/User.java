/**
 * 
 */
package com.cg.ecommerce.dto;

/**
 * @author Admin
 *
 */
public class User {

	/**
	 * 
	 */
	
	
	
	
	
	private String userId;
	private String Password;
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}


	public User(String userId, String password) {
		super();
		this.userId = userId;
		Password = password;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", Password=" + Password + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
