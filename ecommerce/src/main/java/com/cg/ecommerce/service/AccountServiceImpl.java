/**
 * 
 */
package com.cg.ecommerce.service;

import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ecommerce.dto.Account;

import com.cg.ecommerce.dto.Order;
import com.cg.ecommerce.dto.Product;
import com.cg.ecommerce.repository.AccountRepository;

import com.cg.ecommerce.repository.OrderRepository;
import com.cg.ecommerce.repository.ProductRepository;

/**
 * @author NAVYA
 *
 */

@Service("accountService")
@Transactional
public class AccountServiceImpl implements AccountService {

	/**
	 * 
	 */

	@Autowired
	AccountRepository accountRepository;
	@Autowired
	OrderRepository orderRepository;
	@Autowired
	ProductRepository productRepository;

	List<Product> productList;

	@Override
	public List<Order> viewMyOrders() {
		// TODO Auto-generated method stub

		List<Order> orderList = orderRepository.findAll();

		return orderList;
	}

	@Override
	public Account modifyAccountDetails(Account account) {
		// TODO Auto-generated method stub

		Account accountToBeModified = accountRepository.findById(account.getAccountId());
		accountToBeModified.setFirstName(account.getFirstName());
		accountToBeModified.setLastName(account.getLastName());
		accountToBeModified.setPhoneNumber(account.getPhoneNumber());
		accountToBeModified.setEmailId(account.getEmailId());

		return accountRepository.save(accountToBeModified);
	}

	@Override
	public Account addAccount(Account account) {
		// TODO Auto-generated method stub

		return accountRepository.save(account);
	}

	@Override
	public boolean removeAccount(Long accountId) {
		// TODO Auto-generated method stub

		return accountRepository.deleteById(accountId);
	}

	@Override
	public List<Product> addProductToCart(Long productId) {
		// TODO Auto-generated method stub

		Product productToBeAdded = productRepository.findById(productId);

		productList.add(productToBeAdded);

		return productList;		//add to list of products in account

		return null;
	}

	@Override
	public List<Product> viewProductsInCart() {
		// TODO Auto-generated method stub
		return productList;
	}

	@Override
	public boolean removeProductFromCart(Long productId) {
		// TODO Auto-generated method stub
		 Iterator<Product> iterator=productList.iterator();
		  while (iterator.hasNext()) {
			  Product productFound=iterator.next();
			  if (productFound.getProductId().equals(productId)) {
				  
				  iterator.remove();
				  
			  }
		  }//not properly done
		
		return true;
	}

	@Override
	public Double showTotalPrice() {
		// TODO Auto-generated method stub
Double totalPrice=0.0;
		
		Iterator<Product> iterator=productList.iterator();
		while (iterator.hasNext()) {
			
			Product productFound=iterator.next();
		
			totalPrice=totalPrice+productFound.getProductPrice();
			
			
		}
		
		return totalPrice;
	}

	@Override
	public boolean checkoutCart() {
		// TODO Auto-generated method stub
		return false;
	}

}
