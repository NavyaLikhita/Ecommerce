package com.cg.ecommerce.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * 
 */


/**
 * @author: NAVYA
 * description: Configuration class for JPA Auditing
 * created date: 
 * modified: -
 */
@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class AuditAwareConfiguration {

	private static final Logger logger = LoggerFactory.getLogger(AuditAwareConfiguration.class);
	
	/*	
	 *  Author: NAVYA
	 *  Description: Configures the JPA Auditor
	 *  Input: -
	 *  Output: AuditorAware object.
	 *  Created Date: 
	 *  Last Modified: -
	 */
	@Bean
	public AuditorAware<String> auditorAware() {
		logger.info("Configuring JPA Auditor.");
		return new AuditorAwareImpl();
	}

}
