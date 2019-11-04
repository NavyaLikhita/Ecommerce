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

	public Product addProduct();

	public Product searchProduct(Long productId);

	public Product modifyProduct(Product productId);

	public boolean removeProduct(Long productId);

}
