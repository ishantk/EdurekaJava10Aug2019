package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.edureka.dao.DBHelper;
import co.edureka.model.Customer;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet({ "/LoginServlet", "/Login", "/Auth" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// doPost is similar to service method
	// but will be executed only and only if request from client is post method
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// 1. We are extracting data from Request :)
		Customer customer = new Customer();
		customer.email = request.getParameter("txtEmail");
		customer.password = request.getParameter("txtPassword");
		
		// We are printing data in Object
		System.out.println(">> "+customer);
		
		// 2. Save Object's data in DataBase
		DBHelper db = new DBHelper();
		db.createConnection();
		Customer cRef = db.loginCustomer(customer);
		db.closeConnection();
		
		// 3. Lets share response back to the Customer
		String message = "";
		
		if(cRef!=null) {
			
			// Session Tracking
			// 1. Cookies: Will be created as key value pairs on Clients Machine
			//Cookie ck1 = new Cookie("customerName", cRef.name);
			//Cookie ck2 = new Cookie("customerPhone", cRef.phone);
			
			//ck1.setMaxAge(expiry);
			
			// Now Cookies shall be added on Clients Machine in Browser data 
			//response.addCookie(ck1);
			//response.addCookie(ck2);
			
			// 2. URL ReWriting
			//    Writing data in the URL
			//String url = "Welcome?name="+cRef.name+"&phone="+cRef.phone; // Data is Passed in the URL
			
			//message = "Welcome Dear, "+cRef.name+" Phone: "+cRef.phone+""
			//		+ "<br/><br/><a href='"+url+"'>Visit My Home Page</a>";
			
			// 3. Hidden Form Field
			/*message = "<form action='Welcome' method='post'>"
						+ "<input type='hidden' name='txtName', value='"+cRef.name+"'/>"
						+ "<input type='hidden' name='txtPhone', value='"+cRef.phone+"'/>"
						+ "<input type='submit' value='Visit My Home Page'/>"
					+ "</form"; */

			
			String url = "Welcome";
			message = "Welcome Dear, "+cRef.name+" Phone: "+cRef.phone+""
					+ "<br/><br/><a href='"+url+"'>Visit My Home Page</a>";
			
			// 4. HttpSession Object
			HttpSession session = request.getSession();
			session.setAttribute("keyCustomer", cRef);
			
		}else {
			message = "Login Failed !! Please Try Again !!";
			//response.sendRedirect("https://google.co.in"); // Re-Direct User to Google :) 
		}
		
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
