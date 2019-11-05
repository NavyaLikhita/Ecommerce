/**
 * 
 */
package com.cg.ecommerce.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Admin
 *
 */
@Entity(name="product")
public class Product {

	/**
	 * 
	 */
	
	
	
	@Id
	@Column(name="product_id")
	private Long productId;
	@Column(name="product_name")
	private String productName;
	@Column(name="product_price")
	private Double productPrice;
	@Column(name="product_description")
	private String productDescription;
	@Column(name="product_state")
	private boolean productState;
	
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}



	public Product(Long productId, String productName, Double productPrice, String productDescription) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productDescription = productDescription;
	}



	public Long getProductId() {
		return productId;
	}



	public void setProductId(Long productId) {
		this.productId = productId;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public Double getProductPrice() {
		return productPrice;
	}



	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}



	public String getProductDescription() {
		return productDescription;
	}



	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}



	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productDescription=" + productDescription + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
