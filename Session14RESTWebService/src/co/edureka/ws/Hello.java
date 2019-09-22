package co.edureka.ws;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.servlet.ServletContainer;

@Path("/hello")		 // URL Mapping
public class Hello { // Web Service

	//ServletContainer (Servlet to be configured in the web.xml file)
	
	// Create Web Methods Here
	
	@GET
	@Produces(MediaType.TEXT_PLAIN) // Type of Response
	public String sayPlainHello() {
		Date date = new Date();
		String response = "Hello, Its: "+date;
		return response; // Plain Text :)
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML) // Type of Response
	public String sayHTMLHello() {
		Date date = new Date();
		String response = "<html><body><center><h3>Hello, Its: "+date+"</h3></center></body></html>";
		return response; // HTML :)
	}
	
	@GET
	@Produces(MediaType.TEXT_XML) // Type of Response
	public String sayXMLHello() {
		Date date = new Date();
		String response = "<?xml version='1.0' charset='UTF-8'?><message>Hello, Its: "+date+"</message>";
		return response; // XML :)
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON) // Type of Response
	public String sayJSONHello() {
		Date date = new Date();
		String response = "{'message': 'Hello, Its: "+date+"' }";
		return response; // JSON :)
	}
	
}
