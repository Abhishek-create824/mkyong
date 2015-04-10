package com.mkyong.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkyong.config.AppConfig;
import com.mkyong.output.OutputHelper;

public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context1 = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");

		com.mkyong.core.HelloWorld hello1 = (com.mkyong.core.HelloWorld) context1
				.getBean("helloBean");
		hello1.printHello();

		OutputHelper output = (OutputHelper) context1.getBean("OutputHelper");
		output.generateOutput();

		@SuppressWarnings("resource")
		ApplicationContext context2 = new AnnotationConfigApplicationContext(
				AppConfig.class);
		com.mkyong.hello.HelloWorld hello2 = (com.mkyong.hello.HelloWorld) context2
				.getBean("helloBean");

		hello2.printHelloWorld("Spring3 Java Config");
	}
}