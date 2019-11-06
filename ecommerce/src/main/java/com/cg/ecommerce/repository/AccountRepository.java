/**
 * 
 */
package com.cg.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ecommerce.dto.Account;

/**
 * @author Navya
 *
 */

@Repository("accountRepository")
public interface AccountRepository extends JpaRepository<Account,Long> {

	
	
	
}
