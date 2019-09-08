package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.edureka.model.Customer;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet({ "/HomeServlet", "/Home", "/Welcome" })
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String customerName = "";
		String customerPhone = "";
		
		Date date = new Date();
		
		// Reading all the cookies from clients machine in browser which belongs to our application as Array
		/*
		Cookie[] cookies = request.getCookies();
		
		for(Cookie ck : cookies) {
			if(ck.getName().equals("customerName")) {
				customerName = ck.getValue();
			}
			
			if(ck.getName().equals("customerPhone")) {
				customerPhone = ck.getValue();
			}
		}
		*/
		
		// Read Data from URL 
//		customerName = request.getParameter("name");
//		customerPhone = request.getParameter("phone");
		
		// Read Data from Hidden Form
		//customerName = request.getParameter("txtName");
		//customerPhone = request.getParameter("txtPhone");
		
		HttpSession session = request.getSession();
		Customer customer = (Customer)session.getAttribute("keyCustomer");
		
		
//		String message = "Welcome, "+customerName+"<br/>Its: "+date+"<br/>Your Phone:"+customerPhone;
		String message = "Welcome, "+customer.name+"<br/>Its: "+date+"<br/>Your Details:"+customer.phone+" | "+customer.email;
		
		
		String htmlResponse = "<html>"
				+ "<body>"
				+ "<br/>"
				+ "<center>"
				+ "<h3>"+message+"</h3>"
				+ "<center>"
				+ "</body>"
				+ "</html>";

		response.setContentType("text/html"); // MIME
		PrintWriter out = response.getWriter(); // To Write Text or HTML Response back to client
		out.print(htmlResponse);
		
		
		
			
	}

}
