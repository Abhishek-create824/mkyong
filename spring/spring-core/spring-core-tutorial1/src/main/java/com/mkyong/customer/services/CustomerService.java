package com.mkyong.customer.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

//singleton – Return a single bean instance per Spring IoC container
//prototype – Return a new bean instance each time when requested
//request – Return a single bean instance per HTTP request. *
//session – Return a single bean instance per HTTP session. *
//globalSession – Return a single bean instance per global HTTP session. *
@Service
// @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CustomerService {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}