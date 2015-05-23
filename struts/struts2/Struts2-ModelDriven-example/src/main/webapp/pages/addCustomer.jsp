<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<head> 
		<style type="text/css">
		.errors {background-color:#FFCCCC; border:1px solid #CC0000; width:400px; margin-bottom:8px;}
		.errors li{list-style: none;}
		</style> 
	</head> 
	<body>
		<h1><s:property value="getText('title.app')" /></h1>
		
		<s:if test="hasActionErrors()">
		   <div class="errors">
			  <s:actionerror/>
		   </div>
		</s:if>
		 
		<h2><s:property value="getText('title.add.customer')" /></h2>
		<s:form  action="customerAction" >
		  <s:textfield name="name" key="label.customer.name" />
		  <s:textfield name="age" key="label.customer.age" />
		  <s:submit name="save" key="btn.submit"/>
		</s:form>	 
	</body>
</html>