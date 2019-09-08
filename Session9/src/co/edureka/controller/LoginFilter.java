package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter("/LoginFilter")
public class LoginFilter implements Filter {

    
	public void destroy() {
		System.out.println(">> LoginFilter destroy");
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// Request will be coming to the filter and this method i.e. doFilter method will be executed 
		// PreProcessing of data in request can be done here
		
		out.print("<center><h4>==PreProcessing==</h4></center>");
		
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		if(email.isEmpty() || password.isEmpty()) {
			out.print("<center><h4>Email or Password Missing</h4></center>");
		}else {
			chain.doFilter(request, response); // Forward Request to corresponding Servlet
		}
		
		
		// PostProcessing of data in response can be done here
		out.print("<center><h4>==PostProcessing==</h4></center>");
		
	}
	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println(">> LoginFilter init");
	}

}
