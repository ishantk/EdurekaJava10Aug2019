package co.edureka.ws;

import java.util.Date;

// Class Created Here is Web Service for Us !!
// Web Service will have Web Methods which takes inputs and sends back responses
// Methods must be public so that they may be accessed by clients
public class ConversionService {

	// Web Method : Which can interact with DataBase
	public String registerUser(String name, String phone, String email) {
		// Save details in DB either with JDBC/Hibernate/Spring
		String response = name+" registered successfully for email "+email;
		return response;
	}
	
	// Web Method
	public int feetToInches(int feet) {
		int inches = feet * 12;
		return inches;
	}
	
	// Web Method
	public int dollarToINR(int dollar) {
		int inr = dollar * 70;
		return inr;
	}
	
	// Web Method
	public String getDateTimeInfo(String name) {
		Date date = new Date();
		String response = "Hello, "+name+" Its: "+date.toString();
		return response;
	}
	
}
