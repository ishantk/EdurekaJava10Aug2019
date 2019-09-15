package co.edureka.model;

import org.springframework.beans.factory.annotation.Autowired;

public class CB {
	
	// 1 Attribute below:
	CA ca; // HAS-A Relationship
	
	public CB() {
	
	}

	//@Autowired	// Constructor Injection
	public CB(CA ca) {
		System.out.println(">> CONSTRUCTOR INJECTION");
		this.ca = ca;
	}

	public CA getCa() {
		return ca; // We will get Reference to CA Object
	}

	@Autowired	// Setter Injection
	public void setCa(CA ca) {
		System.out.println(">> SETTER INJECTION");
		this.ca = ca;
	}

}
