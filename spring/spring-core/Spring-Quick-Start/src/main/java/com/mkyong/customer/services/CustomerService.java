package com.mkyong.customer.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//singleton – Return a single bean instance per Spring IoC container
//prototype – Return a new bean instance each time when requested
//request – Return a single bean instance per HTTP request. *
//session – Return a single bean instance per HTTP session. *
//globalSession – Return a single bean instance per global HTTP session. *
@Service
// @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CustomerService implements InitializingBean, DisposableBean {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.beans.factory.DisposableBean#destroy()
	 */
	@Override
	public void destroy() throws Exception {
		System.out
				.println("destroy(): Spring Container is destroy! CustomerService clean up");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out
				.println("afterPropertiesSet(): Init method after properties are set message: "
						+ getMessage());
	}

	@PostConstruct
	public void initIt() throws Exception {
		System.out
				.println("initIt(): Init method after properties are set message: "
						+ getMessage());
	}

	@PreDestroy
	public void cleanUp() throws Exception {
		System.out
				.println("cleanUp(): Spring Container is destroy! CustomerService clean up");
	}
}