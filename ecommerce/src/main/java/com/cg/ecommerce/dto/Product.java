/**
 * 
 */
package com.cg.ecommerce.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * @author NAVYA
 *
 */
@Entity(name="product")
@EntityListeners({ AuditingEntityListener.class })
public class Product {

	/**
	 * 
	 */
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
	
	@CreatedBy
	protected String createdBy;

	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	protected Date creationDate;

	@LastModifiedBy
	protected String lastModifiedBy;

	@LastModifiedDate
	protected String lastModifiedDate;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(Long productId, String productName, Double productPrice, String productDescription,
			boolean productState, String createdBy, Date creationDate, String lastModifiedBy, String lastModifiedDate) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productDescription = productDescription;
		this.productState = productState;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.lastModifiedBy = lastModifiedBy;
		this.lastModifiedDate = lastModifiedDate;
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

	public boolean isProductState() {
		return productState;
	}

	public void setProductState(boolean productState) {
		this.productState = productState;
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

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productDescription=" + productDescription + ", productState=" + productState + ", createdBy="
				+ createdBy + ", creationDate=" + creationDate + ", lastModifiedBy=" + lastModifiedBy
				+ ", lastModifiedDate=" + lastModifiedDate + "]";
	}



	
	
	
	
	
	
	
	
	
	
	
}
