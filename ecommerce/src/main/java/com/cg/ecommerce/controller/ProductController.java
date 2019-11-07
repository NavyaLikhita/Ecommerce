/**
 * 
 */
package com.cg.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ecommerce.dto.Product;
import com.cg.ecommerce.service.ProductService;

/**
 * @author NAVYA
 *
 */


@RestController
@RequestMapping("/product")
public class ProductController {

	
	
	@Autowired
	ProductService productService;
	
	@PostMapping(value="/add")
	ResponseEntity<?> addProduct(@RequestBody Product product){
		
		
		Product productToBeAdded=productService.addProduct(product);
		
		
		return null;
		
		
		
		
	}
	
	
	
	
	@PutMapping(value="/modify")
	ResponseEntity<?> modifyProduct(@RequestBody Product product){
		
		
		Product productToBeModified=productService.addProduct(product);
		return null;
		
		
		
	}
	
	
	//did not add delete product
	
	
}
