package co.edureka.model;

import java.util.List;

public class Customer {
	
	String name;
	String phone;
	String email;
	
	Address address; // HAS-A Relationship | One to One
	
	List<String> messages; // HAS-A Relationship	| One to Many
	
	public Customer() {
		System.out.println(">> Customer Object Constructed with Default Constructor");
		//address = new Address(); // HIGH COUPLING : When we will create object of Customer, object of Address will be created
	}
	
	// Dependency of Address Object Construction is not on Customer Object Construction :)
	public Customer(Address address) {
		System.out.println(">> Customer Object Constructed with Parameterized Constructor");
		System.out.println(">> Address Object Assignment using Constructor - CONSTRUCTOR INJECTION");
		this.address = address;		// LOW COUPLING :  We will pass reference of Address Object here :)
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	// Dependency of Address Object Construction is not on Customer Object Construction :)
	public void setAddress(Address address) {
		System.out.println(">> Address Object Assignment using Setter - SETTER INJECTION");
		this.address = address;
	}
	
	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", phone=" + phone + ", email=" + email + ", address=" + address + "]";
	}

}
