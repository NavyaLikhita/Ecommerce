/**
 * 
 */
package com.cg.ecommerce.service;

import com.cg.ecommerce.dto.Product;

/**
 * @author Admin
 *
 */
public interface ProductService {

	public Product addProduct(Product product);

	
	public Product modifyProduct(Product product);

	public boolean removeProduct(Long productId);

}
