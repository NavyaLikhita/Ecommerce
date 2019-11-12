/**
 * 
 */
package com.cg.ecommerce.service;

import java.util.List;

import com.cg.ecommerce.dto.Product;
import com.cg.ecommerce.exception.ProductException;

/**
 * @author NAVYA
 *
 */
public interface ProductService {

	public Product addProduct(Product product);
	public List<Product> showProduct();

	
	public Product modifyProduct(Product product) throws ProductException;
	public Product searchProduct(Long productId);

	public boolean removeProduct(Long productId);

}
