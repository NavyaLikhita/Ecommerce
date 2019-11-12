/**
 * 
 */
package com.cg.ecommerce.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ecommerce.config.AuditAwareConfiguration;
import com.cg.ecommerce.dto.Account;

import com.cg.ecommerce.dto.Order;
import com.cg.ecommerce.dto.Product;
import com.cg.ecommerce.exception.AccountException;
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

	private static final Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);
	
	@Autowired
	AccountRepository accountRepository;
	@Autowired
	OrderRepository orderRepository;
	@Autowired
	ProductRepository productRepository;

	List<Product> productList=new ArrayList<Product>();
	List<Order> orderList=new ArrayList<Order>();

	@Override
	public List<Order> viewMyOrders() {
		// TODO Auto-generated method stub

		

		return orderList;
	}

	@Override
	public Account modifyAccountDetails(Account account) {
		// TODO Auto-generated method stub

		Account accountToBeModified = accountRepository.findByAccountId(account.getAccountId());
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

		accountRepository.deleteById(accountId);
		
		return true;
	}

	@Override
	public List<Product> addProductToCart(Product product) throws AccountException {
		// TODO Auto-generated method stub

		Product productToBeAdded = productRepository.findByProductId(product.getProductId());
		
		if (productToBeAdded == null) {

			throw new AccountException("Product Not Available");

		} else {
			
			productList.add(productToBeAdded);

			
			
			return productList; // add to list of products in account
		}

	}

	@Override
	public List<Product> viewProductsInCart() {
		// TODO Auto-generated method stub
		
		
		
		
		
		return productList;
	}

	@Override
	public List<Product> removeProductFromCart(Long productId) throws AccountException {
		// TODO Auto-generated method stub
		Iterator<Product> iterator = productList.iterator();
		while (iterator.hasNext()) {
			Product productFound = iterator.next();
			if (productFound.getProductId().equals(productId)) {

				iterator.remove();
				break;

			}else {
				
				throw new AccountException("Product Not Present In Cart");
				
				
			}
		} // not properly done

		return productList;
	}

	@Override
	public Double showTotalPrice() {
		// TODO Auto-generated method stub
		Double totalPrice = 0.0;

		Iterator<Product> iterator = productList.iterator();
		while (iterator.hasNext()) {

			Product productFound = iterator.next();

			totalPrice = totalPrice + productFound.getProductPrice();

		}

		return totalPrice;
	}

	@Override
	public boolean checkoutCart() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Order> addMyOrder(Order order) throws AccountException {
		// TODO Auto-generated method stub
		Order orderToBeAdded = orderRepository.findByOrderId(order.getOrderId());
		if (orderToBeAdded == null) {

			throw new AccountException("Order Not Available");

		} else {

			orderList.add(orderToBeAdded);

			return orderList; // add to list of products in account
		}

	}

	@Override
	public Account persistProductList(Account account) {
		// TODO Auto-generated method stub
		account.setProductList(productList);
		
		
		
		return accountRepository.save(account);
	}

	@Override
	public Account searchAccount(Long accountId) {
		// TODO Auto-generated method stub
		
		Account accountToBeFound=accountRepository.findByAccountId(accountId);
		
		return accountToBeFound;
	}

	
}
