package com.mkyong.common.action;

import com.opensymphony.xwork2.ActionSupport;
 
public class LongProcessAction extends ActionSupport{

	public String execute() throws Exception {
	
		for(int i =0; i<1000000; i++){
			System.out.println(i);
		}
		return SUCCESS;
		
	}
}