<%@page import="co.edureka.model.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="error.jsp" %>  
<%@ page isThreadSafe="true" %>  
<%@ page buffer="8kb" %>
<%@ include file="header.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Demo</title>
</head>
<body>
	
	
	
	
	<center>
	
		<%
			
			int[] arr = {10, 20, 30, 40, 50};
			out.print(arr[2]);
			/*
			try{
				out.print(arr[20]); // ArrayIndexOutOfboundsException
			}catch(Exception e){
				out.print(">> Some Exception: "+e);
			}
			*/
		%>
	
	
		<h3>Welcome to JSP Demo :)</h3>
		
		<%-- <h4>a is: <% out.print(a); %></h4> --%>
		<h4>PI is: <% out.print(pi); %></h4>
		<h4>Area of Circle with Radius 7.7 is: <% out.print(area(7.7)); %></h4>
		
		Scriptlet Demo:
		<%
			int a = 10;
			int b = 20;
			int c = a*b;
			out.print(">> c is:"+c); // out is reference variable of PrintWriter given to us implicitly
		%>
		
		<br/><br/>
		Declarative Demo:
		<%!
			double pi = 3.14;
			double area(double radius){
				double a = pi * radius * radius; 
				return a;		
			}
		%>
		<br/>
		*********************
		<br/>
		<%
			
			Product pRef = new Product();
			pRef.setPid(1001);
			pRef.setName("iPhoneX");
			pRef.setPrice(70000);
			
		%>
		
		Product Details: <%= pRef.getPid() %> | <%= pRef.getName() %> | <%= pRef.getPrice() %>
		
		<br/>
		*********************
		<br/>
		
		<jsp:include page="header.jsp"/>
		
	
		<h4>PI is: <% out.print(pi); %></h4>
		<h4>Area of Circle with Radius 5.5 is: <% out.print(area(5.5)); %></h4>
	
		Expression Demo:
		<h4>PI is: <%= pi %></h4>
		<h4>Area of Circle with Radius 9.99 is: <%= area(9.99) %></h4>
	
	
		<jsp:useBean id="qRef" class="co.edureka.model.Product"/>
		
		<jsp:setProperty property="pid" name="qRef" value="2001"/>
		<jsp:setProperty property="name" name="qRef" value="Alpha Bounce"/>
		<jsp:setProperty property="price" name="qRef" value="8000"/>
		
	
		Product Details: <jsp:getProperty property="pid" name="qRef"/> | <jsp:getProperty property="name" name="qRef"/> | <jsp:getProperty property="price" name="qRef"/>
	
	</center>
	
</body>
</html>