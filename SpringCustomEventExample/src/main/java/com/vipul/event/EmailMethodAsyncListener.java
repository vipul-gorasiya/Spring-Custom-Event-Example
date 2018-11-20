package com.vipul.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class EmailMethodAsyncListener {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmailMethodAsyncListener.class);

	@Async
	@EventListener
	@Order(3)
	public void handleEvent(EmailEvent event) {
		// Prepare email and send email using email API.
		LOGGER.info(
				"@Order(3) Email sent through Asynchronous Event. This is through method annotated with @EventListener+@Async.");
	}

}
