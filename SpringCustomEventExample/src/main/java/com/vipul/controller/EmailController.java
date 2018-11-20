package com.vipul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vipul.dto.Email;
import com.vipul.service.EmailService;

@RestController
public class EmailController {

	@Autowired
	private EmailService emailService;

	@RequestMapping("/")
	public String welcome() {
		return "This is an example of Custom Application Event in Spring. Please navigate to '/sendEmail', which will trigger event.";
	}

	@RequestMapping("/sendEmail")
	public String sendEmail() {
		Email email = new Email();
		// Set content of email and call service	
		return emailService.sendEmail(email);
	}

}
