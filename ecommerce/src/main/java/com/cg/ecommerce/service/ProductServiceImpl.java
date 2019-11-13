/**
 * 
 */
package com.cg.ecommerce.service;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ecommerce.config.AuditAwareConfiguration;
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

	private static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);
	
	@Autowired
	ProductRepository productRepository;
	
	
	/*
	 * Author: NAVYA Description:to add product 
	 */
	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub

		
		product.setProductState(true);
		return productRepository.save(product);
	}

	
	/*
	 * Author: NAVYA Description:to modify the project
	 */
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
	
	/*
	 * Author: NAVYA Description:to remove prouct
	 */

	@Override
	public boolean removeProduct(Long productId) {
		// TODO Auto-generated method stub
		
		
		productRepository.deleteById(productId);
		
		return true;
	}


	/*
	 * Author: NAVYA Description:to  show all the products
	 */
	@Override
	public List<Product> showProduct() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	/*
	 * Author: NAVYA Description:to search products using id
	 */

	@Override
	public Product searchProduct(Long productId) {
		// TODO Auto-generated method stub
		return productRepository.findByProductId(productId);
	}

	/**
	 * 
	 */
	
	
	
		
	
}
