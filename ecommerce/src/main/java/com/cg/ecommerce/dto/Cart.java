/**
 * 
 */
package com.cg.ecommerce.dto;

/**
 * @author Admin
 *
 */
public class Cart {

	/**
	 * 
	 */
	
	
	Product product;
	private Double totalPrice;
	private Integer productQuantity;
	
	
	
	
	public Cart() {
		// TODO Auto-generated constructor stub
	}




	public Cart(Product product, Double totalPrice, Integer productQuantity) {
		super();
		this.product = product;
		this.totalPrice = totalPrice;
		this.productQuantity = productQuantity;
	}




	public Product getProduct() {
		return product;
	}




	public void setProduct(Product product) {
		this.product = product;
	}




	public Double getTotalPrice() {
		return totalPrice;
	}




	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}




	public Integer getProductQuantity() {
		return productQuantity;
	}




	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}




	@Override
	public String toString() {
		return "Cart [product=" + product + ", totalPrice=" + totalPrice + ", productQuantity=" + productQuantity + "]";
	}

	
	
	
	
	
	
	
	
	
}
