/**
 * 
 */
package com.cg.ecommerce.dto;

import java.util.List;

import javax.persistence.Entity;

/**
 * @author Admin
 *
 */
@Entity(name="cart")
public class Cart {

	/**
	 * 
	 */
	
	
	List<Product> product;
	private Double totalPrice;
	
	
	
	
	
	public Cart() {
		// TODO Auto-generated constructor stub
	}




	
	
	
	
	
	
	
	
}
