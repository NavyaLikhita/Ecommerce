/**
 * 
 */
package com.cg.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ecommerce.dto.Account;
import com.cg.ecommerce.dto.Order;
import com.cg.ecommerce.dto.Product;
import com.cg.ecommerce.service.AccountService;



/**
 * @author NAVYA
 *
 */


@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	AccountService accountService;
	
	
	
	@PostMapping(value = "/add")
	public ResponseEntity<?> addAccount(@RequestBody Account account) {
		
		Account accountToBeAdded=accountService.addAccount(account);
		
		return null; 
		
		
			
		
	}
	
	
	
	@GetMapping(value="/view")
	public ResponseEntity<?> viewMyOrder(){
		
		List<Order> orderList=accountService.viewMyOrders();
		return null;
		
		
		
	}
	
	
	@PostMapping(value="/cart/add")
	public ResponseEntity<?> addToCart(@RequestParam Long productId){
		
		List<Product> productListToBeAdded=accountService.addProductToCart(productId);
		
		
		
		
		
		
		return null;
		
		
		
	}
	
	
	@GetMapping(value="/cart/view")
	public ResponseEntity<?> viewCart(){
		
		List<Product> productList=accountService.viewProductsInCart();
		
		Double totalPrice=accountService.showTotalPrice();
		
		return null;
		
		
		
	}
	
	
	
@DeleteMapping(value="/cart/remove")
public ResponseEntity<?> removeFromCart(@RequestParam Long productId){
	
	List<Product> productList=accountService.removeProductFromCart(productId);
	
	
	
}
	
	
	
	
}
