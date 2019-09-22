<%@ page import="javax.ws.rs.core.MediaType"%>
<%@ page import="javax.ws.rs.client.WebTarget"%>
<%@ page import="javax.ws.rs.core.UriBuilder"%>
<%@ page import="javax.ws.rs.client.ClientBuilder"%>
<%@ page import="javax.ws.rs.client.Client"%>
<%@ page import="org.glassfish.jersey.client.ClientConfig"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>

	<center>
		<br/>
		<h3>Welcome to REST Web Service Demo</h3>
		<br/>
		
		<%
			// Code to Access Web Service Goes Here :)
			ClientConfig clientConfig = new ClientConfig();
			Client client = ClientBuilder.newClient(clientConfig);
			WebTarget target = client.target(UriBuilder.fromUri("http://localhost:8080/Session14RESTWebService").build());
			
			// With WebTarget API we can access Web Service Methods :)
						// rest/hello
			String plainText = target.path("rest").path("hello").request().accept(MediaType.TEXT_PLAIN).get(String.class);
			String htmlText = target.path("rest").path("hello").request().accept(MediaType.TEXT_HTML).get(String.class);
			String xmlText = target.path("rest").path("hello").request().accept(MediaType.TEXT_XML).get(String.class);
			String jsonText = target.path("rest").path("hello").request().accept(MediaType.APPLICATION_JSON).get(String.class);

		
		%>
		
		Plain Response : <%= plainText %>
		<br/>
		HTML Response : <%= htmlText %>
		<br/>
		XML Response : <%= xmlText %>
		<br/>
		JSON Response : <%= jsonText %>
		<br/>
		
		
	</center>

</body>
</html>


<!-- 1. Try to implement Database with Hibernate or Spring Hibernate :)
2. Try to create neat and clean models in your Project
3. Focus on creating packages and give a proper comment for your implementations
4. Using WebService i.e. REST Architecture will be appreciated
5. Zip your project and submit the same :) -->