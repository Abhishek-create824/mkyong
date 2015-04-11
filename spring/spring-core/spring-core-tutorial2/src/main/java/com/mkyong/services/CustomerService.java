package com.mkyong.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.mkyong.dao.DAO;

//@Component – Indicates a auto scan component.
//@Repository – Indicates DAO component in the persistence layer.
//@Service – Indicates a Service component in the business layer.
//@Controller – Indicates a controller component in the presentation layer.
@Service
public class CustomerService {
	@Autowired
	@Qualifier("customerDAO")
	private DAO dao1;

	@Autowired
	@Qualifier("userDAO")
	private DAO dao2;

	@Value("#{'Yong Mook Kim'}")
	private String name;

	@Value("#{'http://www.mkyong.com'}")
	private String url;

	public CustomerService() {
		super();
	}

	@Override
	public String toString() {
		return this.getClass().getName() + " [dao1 = " + dao1 + ", dao2 = "
				+ dao2 + ", name = " + name + ", url = " + url + "]";
	}

	public void printName() {
		System.out.println("Customer name : " + name);
	}

	public void printURL() {
		System.out.println("Customer website : " + url);
	}

	public void printThrowException() {
		throw new IllegalArgumentException();
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}