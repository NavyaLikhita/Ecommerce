/**
 * 
 */
package com.cg.ecommerce.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ecommerce.dto.Product;

import com.cg.ecommerce.exception.ProductException;
import com.cg.ecommerce.repository.ProductRepository;

/**
 * @author NAVYA
 *
 */

@Service("productService")
@Transactional
public class ProductServiceImpl implements ProductService {

	
	
	@Autowired
	ProductRepository productRepository;
	
	
	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub

		
		product.setProductState(true);
		return productRepository.save(product);
	}

	

	@Override
	public Product modifyProduct(Product product) throws ProductException {
		// TODO Auto-generated method stub
		Product productToBeModified=productRepository.findByProductId(product.getProductId());
		
if(productToBeModified==null) {
			
			throw new ProductException("Order Not Found");
			
		}
		
		
		productToBeModified.setProductName(product.getProductName());
		productToBeModified.setProductPrice(product.getProductPrice());
		productToBeModified.setProductDescription(product.getProductDescription());
		
		
		return productRepository.save(productToBeModified);
	}

	@Override
	public boolean removeProduct(Long productId) {
		// TODO Auto-generated method stub
		
		
		
		
		return false;
	}

	/**
	 * 
	 */
	
	
	
		
	
}
