<%@page import="co.edureka.dao.DBHelper"%>
<%@page import="co.edureka.model.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="header.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Login</title>
</head>
<body>

	<h3>logging in ${param.txtEmail} ..... </h3>

	<%		
		Customer customer = new Customer();
		customer.email = request.getParameter("txtEmail");
		customer.password = request.getParameter("txtPassword");
		
		DBHelper db = new DBHelper();
		db.createConnection();
		Customer cRef = db.loginCustomer(customer);
		db.closeConnection();
		
		if(cRef!=null){
			
			/*
			Cookie ck1 = new Cookie("keyName",cRef.name);
			Cookie ck2 = new Cookie("keyPhone",cRef.phone);
					
			response.addCookie(ck1);
			response.addCookie(ck2);
			*/
			
			session.setAttribute("keyCustomer", cRef);
			//pageContext.setAttribute("keyCustomer", cRef, PageContext.SESSION_SCOPE);
			
			
						
	%>		
		<jsp:forward page="home.jsp"/>
		
		<%-- <h3>Thank You For Login, <%= cRef.name %></h3>
		<a href="home.jsp">Visit My Home Page</a> --%>
	<%		
		}else{
	%>
		<h3>OOPS!! Something Went Wrong !! Please Try Again !!</h3>
	<%	
		response.sendRedirect("https://google.co.in");
		}
		
	%>

</body>
</html>