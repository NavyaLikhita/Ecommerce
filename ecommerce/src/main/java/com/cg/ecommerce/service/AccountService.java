/**
 * 
 */
package com.cg.ecommerce.service;

import java.util.List;

import com.cg.ecommerce.dto.Account;

import com.cg.ecommerce.dto.Order;
import com.cg.ecommerce.dto.Product;

/**
 * @author NAVYA
 *
 */
public interface AccountService {

	public Account addAccount(Account account);
	
	public boolean removeAccount(Long accountId);

	public List<Order> viewMyOrders();
	
	
	
	public Account modifyAccountDetails(Account account);
	
	
	public List<Product> addProductToCart(Long productId);

	public List<Product> viewProductsInCart();

	public boolean removeProductFromCart(Long productId);

	public Double showTotalPrice();
	
	public boolean checkoutCart();
	
	
}
