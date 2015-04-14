package com.mkyong.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.howtodoinjava.mail.ApplicationMailer;

public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring-Mail.xml");

		// Get the mailer instance
		ApplicationMailer mailer = (ApplicationMailer) context
				.getBean("mailService");

		// Send a composed mail
		mailer.sendMail("ceanma@gmail.com", "Test Subject", "Testing body");

		// Send a pre-configured mail
		mailer.sendPreConfiguredMail("Exception occurred everywhere.. where are you ????");

	}
}
