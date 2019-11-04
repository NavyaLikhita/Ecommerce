/**
 * 
 */
package com.cg.ecommerce.service;

import java.util.List;

import com.cg.ecommerce.dto.Product;

/**
 * @author Admin
 *
 */
public interface CartService {

	public Product addProductToCart(Long productId);

	public List<Product> viewProductsInCart();

	public boolean removeProductFromCart(Long productId);

	public Integer showTotalPrice();

}
