package com.mkyong.core;

import java.io.IOException;
import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkyong.core.model.Customer;

public class App {
	private static final String XML_FILE_NAME = "C:/Users/cams7/desenv/github/mkyong/temp/customer.xml";

	private static final String DOT = ".";

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"App.xml");
		XMLConverter converter = (XMLConverter) appContext
				.getBean("XMLConverter");

		Customer customer = new Customer();
		customer.setName("mkyong");
		customer.setAge(30);
		customer.setFlag(true);
		customer.setAddress("This is address");

		String fileName = getFileName(XML_FILE_NAME);

		System.out.println("Convert Object to XML!");
		// from object to XML file
		converter.convertFromObjectToXML(customer, fileName);
		System.out.println("Done \n");

		System.out.println("Convert XML back to Object!");
		// from XML to object
		customer = (Customer) converter.convertFromXMLToObject(fileName);
		System.out.println(customer);

		System.out.println("Done");
	}

	private static String getFileName(String fileName) {
		String newFileName = fileName.substring(0, fileName.lastIndexOf(DOT));
		final String FILE_EXTENSION = fileName.substring(fileName
				.lastIndexOf(DOT) + 1);

		newFileName += "_" + Calendar.getInstance().getTimeInMillis() + DOT
				+ FILE_EXTENSION;
		return newFileName;
	}
}