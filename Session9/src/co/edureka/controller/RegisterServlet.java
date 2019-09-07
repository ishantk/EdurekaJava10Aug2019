package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edureka.dao.DBHelper;
import co.edureka.model.Customer;


@WebServlet({ "/RegisterServlet", "/Register" })
public class RegisterServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	// init will be executed when our server will create the object of RegisterServlet. It acts as Constructor.
	public void init(ServletConfig config) throws ServletException {
		System.out.println(">> RegisterServelt init executed");
	}

	// destroy will be executed when Object of this Servlet is no longer required on Server
	public void destroy() {
		System.out.println(">> RegisterServelt destroy executed");
	}
	
	// PS: init and destroy happens once and automatically for us
	
	
	// service is executed whenever client will send a request
	// in service method we have HttpServletRequest and HttpServletResponse
	// HttpServletRequest to read data sent by client
	// HttpServletResponse to send information or data back to client
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">> RegisterServelt service executed");
		
		// 1. We are extracting data from Request :)
		Customer customer = new Customer();
		customer.name = request.getParameter("txtName");
		customer.phone = request.getParameter("txtPhone");
		customer.email = request.getParameter("txtEmail");
		customer.password = request.getParameter("txtPassword");
		
		// We are printing data in Object
		System.out.println(">> "+customer);
		
		// 2. Save Object's data in DataBase
		DBHelper db = new DBHelper();
		db.createConnection();
		int rows = db.registerCustomer(customer);
		db.closeConnection();
		
		// 3. Lets share response back to the Customer
		String message = "";
		
		if(rows>0) {
			message = "Dear, "+customer.name+" Registration Successful !! Thank you for OnBoarding !!";
		}else {
			message = "Dear, "+customer.name+" Registration Failed !! Please Try Again !!";
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
