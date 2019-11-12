package com.cg.ecommerce.config;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.AuditorAware;



/**
 * @author: NAVYA
 * description: Provides the current user name to the Auditor 
 * created date:
 * modified: -
 */
public class AuditorAwareImpl implements AuditorAware<String> {

	private static final Logger logger = LoggerFactory.getLogger(AuditorAwareImpl.class);
	
	/*	
	 *  Author: NAVYA
	 *  Description: Provides a String Optional for the current user.
	 *  Input: -
	 *  Output: Optional<String>
	 *  Created Date: 
	 *  Last Modified: -
	 */
	@Override
	public Optional<String> getCurrentAuditor() {
		logger.info("Returning optional string of current auditor.");
		return Optional.of("NAVYA");
	}

}
