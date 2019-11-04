/**
 * 
 */
package com.cg.ecommerce.dto;

/**
 * @author Admin
 *
 */
public class Address {

	/**
	 * 
	 */
	
	
	
	private String streetLine1;
	private String streetLine2;
	private Long zipCode;
	private String state;
	
	public Address() {


	}

	
	
	
	
	public Address(String streetLine1, String streetLine2, Long zipCode, String state) {
		super();
		this.streetLine1 = streetLine1;
		this.streetLine2 = streetLine2;
		this.zipCode = zipCode;
		this.state = state;
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





	@Override
	public String toString() {
		return "Address [streetLine1=" + streetLine1 + ", streetLine2=" + streetLine2 + ", zipCode=" + zipCode
				+ ", state=" + state + "]";
	}
	
	
	

}
