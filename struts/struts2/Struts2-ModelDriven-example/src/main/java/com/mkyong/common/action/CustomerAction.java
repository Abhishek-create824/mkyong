package com.mkyong.common.action;
 
import com.mkyong.common.Customer;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
 
public class CustomerAction extends ActionSupport 
	implements ModelDriven{
 
	//have to initialize it
	private Customer customer = new Customer();
 
	//business logic
	public String execute() throws Exception { 
		return SUCCESS; 
	}
	
	//simple validation
	public void validate(){		
		//if("".equals(customer.getName().trim())){
		//	addActionError(getText("msg.error.invalid.customer.name"));
		//}else{
			addActionMessage(getText("msg.info.valid.customer"));			
		//}		
	}
 
	public Object getModel() { 
		return customer; 
	}
}