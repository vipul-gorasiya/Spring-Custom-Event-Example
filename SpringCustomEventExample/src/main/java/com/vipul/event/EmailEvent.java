package com.vipul.event;

import org.springframework.context.ApplicationEvent;

import com.vipul.dto.Email;

public class EmailEvent extends ApplicationEvent {

	private static final long serialVersionUID = 1L;
	private Email email;

	public EmailEvent(Object source, Email email) {
		super(source);
		this.email = email;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

}
