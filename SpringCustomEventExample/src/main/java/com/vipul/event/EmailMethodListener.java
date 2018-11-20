package com.vipul.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class EmailMethodListener {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmailMethodListener.class);

	@EventListener
	@Order(2)
	public void handleEvent(EmailEvent event) {
		// Prepare email and send email using email API.
		LOGGER.info("@Order(2) Email sent through Event. This is through method annotated with @EventListener.");
	}

}
