package com.mkyong.common.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
 
public class PrintMsgInterceptor implements Interceptor {

	public void destroy() {
		System.out.println("CustomInterceptor destroy() is called...");
	}

	public void init() {
		System.out.println("CustomInterceptor init() is called...");
	}

	public String intercept(ActionInvocation invocation) throws Exception {
		
		System.out.println("CustomInterceptor, before invocation.invoke()...");
		
		String result = invocation.invoke();
		
		System.out.println("CustomInterceptor, after invocation.invoke()...");
		
		return result;
	}		
}