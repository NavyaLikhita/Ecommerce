/**
 * 
 */
package com.cg.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.cg.ecommerce.dto.Product;

/**
 * @author NAVYA
 *
 */
@Repository("productRepository")
public interface ProductRepository extends JpaRepository<Product,Long> {

	Product findByProductId(Long productId);

	

	
	
	
}
