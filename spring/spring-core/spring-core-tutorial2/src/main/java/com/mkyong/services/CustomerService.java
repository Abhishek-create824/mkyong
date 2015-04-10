package com.mkyong.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

	@Override
	public String toString() {
		return "CustomerService [customerDAO = " + dao1 + ", userDAO = " + dao2
				+ "]";
	}
}