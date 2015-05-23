<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<head> 
		<style type="text/css">
		.welcome {background-color:#DDFFDD; border:1px solid #009900; width:200px;}
		.welcome li{list-style: none;}
		</style> 
	</head> 
	<body>
		<h1><s:property value="getText('title.app')" /></h1>
		 
		<h2><s:property value="getText('title.customer.details')" /></h2>
		
		<s:if test="hasActionMessages()">
		   <div class="welcome">
			  <s:actionmessage/>
		   </div>
		</s:if>
		
		<s:property value="getText('label.customer.name')" />: <s:property value="name" /><br>
		<s:property value="getText('label.customer.age')" />: <s:property value="age" /><br>	 
	</body>
</html>