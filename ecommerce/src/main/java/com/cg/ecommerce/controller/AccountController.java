/**
 * 
 */
package com.cg.ecommerce.controller;

import java.util.List;

import javax.naming.Binding;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ecommerce.config.AuditAwareConfiguration;
import com.cg.ecommerce.dto.Account;
import com.cg.ecommerce.dto.Order;
import com.cg.ecommerce.dto.Product;
import com.cg.ecommerce.exception.AccountException;

import com.cg.ecommerce.service.AccountService;
import com.cg.ecommerce.service.OrderService;



/**
 * @author NAVYA
 *
 */


@RestController
@RequestMapping("/account")
@CrossOrigin(origins = "http://localhost:4200")
public class AccountController {

	@Autowired
	AccountService accountService;
	
	@Autowired
	OrderService orderService;
	
	private static final Logger logger = LoggerFactory.getLogger(AccountController.class);
	
	/*
	 * Author: NAVYA Description:adds a new account
	 */
	
	@PostMapping(value = "/add")
	public ResponseEntity<?> addAccount(@RequestBody Account account,@Validated BindingResult result) throws AccountException {
		
		logger.info("in add account");
		
		Account accountToBeAdded=accountService.addAccount(account);
		
		if(accountToBeAdded==null) {
			
			return new ResponseEntity("Account Not Added", HttpStatus.INTERNAL_SERVER_ERROR);
			
		}else
		
		return  new ResponseEntity<Account>(accountToBeAdded,HttpStatus.OK); 
			
		
	}
	
	/*
	 * Author: NAVYA Description:displays orders of the account
	 */
	
	@GetMapping(value="/view")
	public ResponseEntity<?> viewMyOrder() throws AccountException{
		
		logger.info("in view my orders");
		List<Order> orderList=accountService.viewMyOrders();
if(orderList.isEmpty()) {
			
			return new ResponseEntity("No Orders Present", HttpStatus.INTERNAL_SERVER_ERROR);
			
		}else
		
		return  new ResponseEntity<List<Order>>(orderList,HttpStatus.OK); 
			
		
		
		
	}
	
	/*
	 * Author: NAVYA Description:adds products to cart
	 */
	@PostMapping(value="/cart/add")
	public ResponseEntity<?> addToCart(@RequestBody Product product) throws AccountException{
		
		
		logger.info("in add cart");
		List<Product> productListToBeAdded=accountService.addProductToCart(product);
		
if(productListToBeAdded.isEmpty()) {
			
			return new ResponseEntity("No Product Present", HttpStatus.INTERNAL_SERVER_ERROR);
			
		}else
		
		return  new ResponseEntity<List<Product>>(productListToBeAdded,HttpStatus.OK); 
		
		
		
		
		
		
		
		
	}
	/*
	 * Author: NAVYA Description:Display cart and the products in it
	 */
	
	@GetMapping(value="/cart/view")
	public ResponseEntity<?> viewCart() throws AccountException{
		
		logger.info("in view cart");
		
		List<Product> productList=accountService.viewProductsInCart();
		
if(productList.isEmpty()) {
			
			return new ResponseEntity("No Orders Present", HttpStatus.INTERNAL_SERVER_ERROR);
			
		}else
		
		return  new ResponseEntity<List<Product>>(productList,HttpStatus.OK); 
			
		
		
		
	
	}
		
			
		
		
		
	
	/*
	 * Author: NAVYA Description:removes products from cart
	 */
	
	
	
@PostMapping(value="/cart/remove")
public ResponseEntity<?> removeFromCart(@RequestBody Product product) throws AccountException{
	
	logger.info("in remove from cart");
	
	
	List<Product> productList = accountService.removeProductFromCart(product.getProductId());
	
	
	return new ResponseEntity<List<Product>>(productList,HttpStatus.OK); 
	
	
	
}




@PostMapping(value="/book/order")
public ResponseEntity<?> booking(@RequestBody Order order) throws AccountException{
	
	logger.info("in book order");
	
	Order orderRepo=orderService.addOrder(order);

	List<Order> myOrders=accountService.addMyOrder(order);
	
	
	
	return new ResponseEntity<List<Order>>(myOrders,HttpStatus.OK); 
	
	
	
	
}


/*
 * Author: NAVYA Description:shows the total price of the cart items
 */

@GetMapping(value="/payment" )
public ResponseEntity<?> showPrice() throws AccountException{
	
	logger.info("in payment");
	
	Double totalPrice=accountService.showTotalPrice();
	
	
	
	return new ResponseEntity<Double>(totalPrice,HttpStatus.OK);			
	
	
	
}




//@PostMapping(value="/persist")
//public ResponseEntity<?> persistProduct(@RequestBody Account account){
//	
//	Account accountFound=accountService.searchAccount(account.getAccountId());
//	Account accountSentBack=accountService.persistProductList(accountFound);
//	
//	
//	
//	return null;
//	
//	
//	
//	
//}
//



	
	
	
	
}





