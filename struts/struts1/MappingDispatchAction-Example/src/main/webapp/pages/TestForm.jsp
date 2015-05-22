<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<html>
<head>
</head>
<body>
 
<h2>Struts - DispatchAction Example</h2>
 
<h2>html:link</h2>
<p>
   <html:link action="/CustomDispatchActionXML">Generate XML File</html:link>
   |
   <html:link action="/CustomDispatchActionExcel">Generate Excel File</html:link>
</p> 
 
<h2>a href</h2>
<p>
   <a href="CustomDispatchActionXML.do">Generate XML File</a>
   |
   <a href="CustomDispatchActionExcel.do">Generate Excel File</a>
</p> 
 
</body>
</html>