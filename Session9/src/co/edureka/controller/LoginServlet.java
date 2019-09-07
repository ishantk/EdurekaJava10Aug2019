package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
			message = "Welcome Dear, "+cRef.name+" Phone: "+cRef.phone;
		}else {
			message = "Login Failed !! Please Try Again !!";
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
