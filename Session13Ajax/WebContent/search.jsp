<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.Statement"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	
	try{
		
		String name = request.getParameter("name");
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String user = "root";
		String password = "";
		String dbName = "edureka";
		String url = "jdbc:mysql://localhost/"+dbName;
		
		Connection connection = DriverManager.getConnection(url, user, password);
		
		String sql = "Select * from Employee where name like '"+name+"%'";
		
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery(sql);
		
		while(rs.next()){
			out.print(rs.getString(2)+" "+rs.getString(4)+"<br/>");
		}
		
		connection.close();
		
	}catch(Exception e){
		out.print("Something Went Wrong.."+e);
	}
	

%>    