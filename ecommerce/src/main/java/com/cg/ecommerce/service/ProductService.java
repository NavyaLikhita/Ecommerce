/**
 * 
 */
package com.cg.ecommerce.service;

import com.cg.ecommerce.dto.Product;
import com.cg.ecommerce.exception.ProductException;

/**
 * @author NAVYA
 *
 */
public interface ProductService {

	public Product addProduct(Product product);

	
	public Product modifyProduct(Product product) throws ProductException;

	public boolean removeProduct(Long productId);

}
