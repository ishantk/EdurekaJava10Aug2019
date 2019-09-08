<%@page import="co.edureka.dao.DBHelper"%>
<%@ page import="co.edureka.model.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="header.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>
</head>
<body>

	<%
		
		Customer customer = new Customer();
		customer.name = request.getParameter("txtName");
		customer.phone = request.getParameter("txtPhone");
		customer.email = request.getParameter("txtEmail");
		customer.password = request.getParameter("txtPassword");
		
		DBHelper db = new DBHelper();
		db.createConnection();
		int rows = db.registerCustomer(customer);
		db.closeConnection();
		
		if(rows>0){
	%>		
		<h3>Thank You For Registration</h3>
	<%		
		}else{
	%>
		<h3>OOPS!! Something Went Wrong !! Please Try Again !!</h3>
	<%		
		}
		
	%>

</body>
</html>