package com.mkyong.core;

import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkyong.common.Customer;
import com.mkyong.common.FileNameGenerator;
import com.mkyong.common.Person;
import com.mkyong.config.AppConfig;
import com.mkyong.customer.services.CustomerService;
import com.mkyong.output.OutputHelper;

public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");

		com.mkyong.core.HelloWorld hello1 = (com.mkyong.core.HelloWorld) context
				.getBean("helloBean");
		hello1.printHello();

		OutputHelper output = (OutputHelper) context.getBean("OutputHelper");
		output.generateOutput();

		Customer customerMalaysia = (Customer) context
				.getBean("BaseCustomerMalaysia");
		System.out.println(customerMalaysia);

		Customer customer = (Customer) context.getBean("CustomerBean");
		Person person = customer.getPerson();
		System.out.println(customer);
		System.out.println(person);

		System.out.println("\nlist values:");
		for (Person p : customer.getLists())
			System.out.println(p);

		System.out.println("set values:");
		for (Person p : customer.getSets())
			System.out.println(p);

		System.out.println("map values:");
		for (Entry<String, Person> entry : customer.getMaps().entrySet())
			System.out.println(entry.getKey() + " = " + entry.getValue());

		System.out.println("properties:");
		for (Entry<Object, Object> entry : customer.getPros().entrySet())
			System.out.println(entry.getKey() + " = " + entry.getValue());

		System.out.println("list values: ");
		for (Object o : customer.getGenericList())
			System.out.print(o + " ");

		System.out.println("\nset values: ");
		for (Object o : customer.getGenericSet())
			System.out.print(o + " ");

		System.out.println("\nmap values: ");
		for (Entry<?, ?> entry : customer.getGenericMap().entrySet())
			System.out.print(entry.getKey() + " = " + entry.getValue() + " ");

		System.out.println("\n");

		FileNameGenerator fileNameGenerator = (FileNameGenerator) context
				.getBean("FileNameGenerator");
		System.out.println(fileNameGenerator);

		CustomerService custA = (CustomerService) context
				.getBean("customerService");
		custA.setMessage("Message by custA");
		System.out.println("Message : " + custA.getMessage());

		// retrieve it again
		CustomerService custB = (CustomerService) context
				.getBean("customerService");
		System.out.println("Message : " + custB.getMessage());

		// ---------------------------------//------------------------------------

		context = new AnnotationConfigApplicationContext(AppConfig.class);
		com.mkyong.hello.HelloWorld hello2 = (com.mkyong.hello.HelloWorld) context
				.getBean("helloBean");

		hello2.printHelloWorld("Spring3 Java Config");

		CustomerBo customerBo = (CustomerBo) context.getBean("customer");
		customerBo.printMsg("Hello 1");

		SchedulerBo schedulerBo = (SchedulerBo) context.getBean("scheduler");
		schedulerBo.printMsg("Hello 2");
	}
}