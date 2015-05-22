package com.mkyong.common.action;
 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;
 
public class MyCustomDispatchAction extends MappingDispatchAction{
 
	public ActionForward generateXML(ActionMapping mapping,ActionForm form,
		HttpServletRequest request,HttpServletResponse response) 
        throws Exception {
 
		request.setAttribute("method", "generateXML is called");
 
	        return mapping.findForward("success");
	}
 
	public ActionForward generateExcel(ActionMapping mapping,ActionForm form,
		HttpServletRequest request,HttpServletResponse response) 
	throws Exception {
 
		request.setAttribute("method", "generateExcel is called");
 
		return mapping.findForward("success");
	}
}