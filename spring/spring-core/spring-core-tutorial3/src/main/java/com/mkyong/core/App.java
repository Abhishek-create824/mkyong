package com.mkyong.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkyong.customer.bo.CustomerBo;

public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring-Customer.xml");

		CustomerBo customer = (CustomerBo) context.getBean("customerBo");
		customer.addCustomer();
		customer.addCustomerReturnValue();
		try {
			customer.addCustomerThrowException();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		customer.addCustomerAround("mkyong");
	}

}
