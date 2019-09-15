package co.edureka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.model.Customer;

public class DIApp {

	public static void main(String[] args) {
		
		// Objects will be constructed automatically by IOC container [ApplicationContext] in Spring FW
		ApplicationContext context = new ClassPathXmlApplicationContext("di.xml"); 
		Customer customer = context.getBean("cRef", Customer.class);
		
		System.out.println(customer);
		System.out.println(">> Messages: ");
		System.out.println(customer.getMessages());
		

	}

}
