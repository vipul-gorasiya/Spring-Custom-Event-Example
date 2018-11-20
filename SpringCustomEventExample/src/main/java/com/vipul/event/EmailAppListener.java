package com.vipul.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class EmailAppListener implements ApplicationListener<EmailEvent> {
	
	private static final Logger LOGGER =  LoggerFactory.getLogger(EmailAppListener.class);

	@Override
	public void onApplicationEvent(EmailEvent event) {
		// Prepare email and send email using email API.
		LOGGER.info("@Order(1) Email sent through Event. This class implemented ApplicationListener<EmailEvent>.");
	}

}
