package com.vipul.service;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

import com.vipul.dto.Email;
import com.vipul.event.EmailEvent;

@Service
public class EmailService implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher applicationEventPublisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}

	public String sendEmail(Email email) {
		this.applicationEventPublisher.publishEvent(new EmailEvent(this, email));
		return "Event published";
	}

}
