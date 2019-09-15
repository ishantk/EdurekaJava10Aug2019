package co.edureka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.model.CB;

public class AutowireApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire.xml");
		CB cRef = context.getBean("cb", CB.class);
		
		cRef.getCa().sayHello("Fionna Flynn");

	}

}
