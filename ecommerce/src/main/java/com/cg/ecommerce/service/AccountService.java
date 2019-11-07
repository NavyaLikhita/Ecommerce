/**
 * 
 */
package com.cg.ecommerce.service;

import java.util.List;

import com.cg.ecommerce.dto.Account;

import com.cg.ecommerce.dto.Order;
import com.cg.ecommerce.dto.Product;
import com.cg.ecommerce.exception.AccountException;

/**
 * @author NAVYA
 *
 */
public interface AccountService {

	public Account addAccount(Account account) throws AccountException;
	
	public boolean removeAccount(Long accountId) throws AccountException;

	public List<Order> viewMyOrders() throws AccountException;
	
	
	
	public Account modifyAccountDetails(Account account) throws AccountException;
	
	
	public List<Product> addProductToCart(Long productId) throws AccountException;

	public List<Product> viewProductsInCart() throws AccountException;

	public List<Product> removeProductFromCart(Long productId) throws AccountException;

	public Double showTotalPrice();
	
	public boolean checkoutCart();
	
	
}
