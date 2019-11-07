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

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ecommerce.dto.Account;
import com.cg.ecommerce.dto.Order;
import com.cg.ecommerce.dto.Product;
import com.cg.ecommerce.exception.AccountException;

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
	public ResponseEntity<?> addAccount(@RequestBody Account account) throws AccountException {
		
		Account accountToBeAdded=accountService.addAccount(account);
		
		if(accountToBeAdded==null) {
			
			return new ResponseEntity("Account Not Added", HttpStatus.INTERNAL_SERVER_ERROR);
			
		}else
		
		return  new ResponseEntity<Account>(accountToBeAdded,HttpStatus.OK); 
			
		
	}
	
	
	
	@GetMapping(value="/view")
	public ResponseEntity<?> viewMyOrder() throws AccountException{
		
		List<Order> orderList=accountService.viewMyOrders();
if(orderList.isEmpty()) {
			
			return new ResponseEntity("No Orders Present", HttpStatus.INTERNAL_SERVER_ERROR);
			
		}else
		
		return  new ResponseEntity<List<Order>>(orderList,HttpStatus.OK); 
			
		
		
		
	}
	
	
	@PostMapping(value="/cart/add")
	public ResponseEntity<?> addToCart(@RequestParam Long productId) throws AccountException{
		
		List<Product> productListToBeAdded=accountService.addProductToCart(productId);
		
if(productListToBeAdded.isEmpty()) {
			
			return new ResponseEntity("No Product Present", HttpStatus.INTERNAL_SERVER_ERROR);
			
		}else
		
		return  new ResponseEntity<List<Product>>(productListToBeAdded,HttpStatus.OK); 
		
		
		
		
		
		
		
		
	}
	
	
	@GetMapping(value="/cart/view")
	public ResponseEntity<?> viewCart() throws AccountException{
		
		List<Product> productList=accountService.viewProductsInCart();
		
if(productList.isEmpty()) {
			
			return new ResponseEntity("No Orders Present", HttpStatus.INTERNAL_SERVER_ERROR);
			
		}else
		
		return  new ResponseEntity<List<Product>>(productList,HttpStatus.OK); 
			
		
		
		
	
	}
		
			
		
		
		
	
	
	@GetMapping(value="/cart/view")
	public ResponseEntity<?> showPrice() throws AccountException{
		
		Double totalPrice=accountService.showTotalPrice();
		
		
		
		return new ResponseEntity<Double>(totalPrice,HttpStatus.OK);			//return Price??
		
		
		
	}
	
	
	
@DeleteMapping(value="/cart/remove")
public ResponseEntity<?> removeFromCart(@RequestParam Long productId) throws AccountException{
	
	List<Product> productList = accountService.removeProductFromCart(productId);
	
	
	return new ResponseEntity<List<Product>>(productList,HttpStatus.OK); 
	
	
	
}
	
	
	
	
}
