/**
 * 
 */
package com.cg.ecommerce.controller;

import java.math.BigInteger;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ecommerce.config.AuditAwareConfiguration;
import com.cg.ecommerce.dto.Product;
import com.cg.ecommerce.service.ProductService;



/**
 * @author NAVYA
 *
 */


@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {

	
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	ProductService productService;
	
	
	/*
	 * Author: NAVYA Description:adds a new product
	 */
	@PostMapping(value="/add")
	ResponseEntity<?> addProduct(@RequestBody Product product){
		
		logger.info("in add product");
		Product productToBeAdded=productService.addProduct(product);
		
		
		return null;
		
		
		
		
	}
	
	
	
	
	/*
	 * Author: NAVYA Description:modifies product through product id
	 */
	@PutMapping(value="/modify")
	ResponseEntity<?> modifyProduct(@RequestBody Product product){
		logger.info("in modify product");
		
		Product productToBeModified=productService.addProduct(product);
		return null;
		
		
		
	}
	
	/*
	 * Author: NAVYA Description:displays all the products present
	 */
	@GetMapping(value="/show")
	ResponseEntity<?> showProduct(){
		logger.info("in show product");
		List<Product> productList = productService.showProduct();
		
		if (productList.isEmpty()) {
			//logger.error("no flight present");
			return new ResponseEntity("No Product Present", HttpStatus.INTERNAL_SERVER_ERROR);
		} else {
			//logger.info("display flight");
			return new ResponseEntity<List<Product>>(productList, HttpStatus.OK);
		}
		
		
	}
	
	/*
	 * Author: NAVYA Description:searches product through Id
	 */
	
	@GetMapping(value = "/search")
	public ResponseEntity<?> searchData(@RequestParam Long productId)  { 
		
		logger.info("in search product");
		
		Product productSearched = productService.searchProduct(productId);

		if (productSearched == null) {
		
			return new ResponseEntity("product not present", HttpStatus.INTERNAL_SERVER_ERROR);
		} else {
			
			return new ResponseEntity<Product>(productSearched, HttpStatus.OK);
		}

	}
	
	/*
	 * Author: NAVYA Description:removes the product
	 */
	
	@DeleteMapping(value = "/remove")
	public boolean deleteData(@RequestParam Long productId)  { 
		
		logger.info("in remove product");
		
		boolean productremoved = productService.removeProduct(productId);

		return productremoved;
	
}}
