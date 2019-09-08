package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontControllerServlet
 */
@WebServlet({ "/FrontControllerServlet", "/FrontController", "/Front", "/Main" })
public class FrontControllerServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	
	// Handle any type of http request can be handled by service method itself
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String htmlResponse = "<html>"
				+ "<body>"
				+ "<br/>"
				+ "<center>"
				+ "<h3>We have Received Your Request in FrontController :)</h3>"
				+ "<center>"
				+ "</body>"
				+ "</html>";

		response.setContentType("text/html");   // MIME
		PrintWriter out = response.getWriter(); // To Write Text or HTML Response back to client
		out.print(htmlResponse);				// Write Response to the Client :)
		
		// Extract which client has sent request for which Servlet from hidden field txtType
		String type = request.getParameter("txtType");
		
		if(type.equals("Login")) {
			// We are going to forward request to the corresponding Servlet
			RequestDispatcher dispatcher = request.getRequestDispatcher("Auth");
			//dispatcher.forward(request, response);  // exclude response from this servlet		
			dispatcher.include(request, response);	  // include response from this servlet
		}else if(type.equals("Register")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("Register");
			dispatcher.forward(request, response);
		}else {
			
		}
		
		
	}

}
