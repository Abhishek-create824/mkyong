package com.mkyong.common.action;

import com.opensymphony.xwork2.ActionSupport;
 
public class HelloAction extends ActionSupport{

	public String execute() throws Exception {		
		System.out.println("HelloAction execute() is called");
		
		return SUCCESS;		
	}
}