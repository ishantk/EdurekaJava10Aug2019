<%@page import="co.edureka.model.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>

	<%
		
		String customerName = "";
		String customerPhone = "";
	
		/*
		Cookie[] cookies = request.getCookies();
	
		for(Cookie ck : cookies){
			if(ck.getName().equals("keyName")){
				customerName = ck.getValue();
			}
			
			if(ck.getName().equals("keyPhone")){
				customerPhone = ck.getValue();
			}
		}
		*/
		
		Customer cRef = (Customer)session.getAttribute("keyCustomer");
		
	%>

	<center>
		<%-- <h3>Welcome Home Dear <%= customerName %></h3>
		<h3>Your Phone: <%= customerPhone %></h3> --%>
		
		<h3>Welcome Home Dear <%= cRef.name %></h3>
		<h3>Your Details: <%= cRef.phone %> | <%= cRef.email %></h3>
	
	</center>

</body>
</html>