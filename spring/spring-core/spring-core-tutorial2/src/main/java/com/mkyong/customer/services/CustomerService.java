package com.mkyong.customer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkyong.customer.dao.CustomerDAO;

//@Component – Indicates a auto scan component.
//@Repository – Indicates DAO component in the persistence layer.
//@Service – Indicates a Service component in the business layer.
//@Controller – Indicates a controller component in the presentation layer.
@Service
public class CustomerService {
	@Autowired
	private CustomerDAO customerDAO;

	@Override
	public String toString() {
		return "CustomerService [customerDAO = " + customerDAO + "]";
	}
}