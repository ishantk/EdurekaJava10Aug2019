package co.edureka.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// import org.springframework.aop.framework.ProxyFactoryBean;

public class AOP {

	public static void main(String[] args) {
		
		/*
		 	AOP Procedure
		 	1. Configure Your Project with Spring Core and Spring AOP jars
		 	2. Create a Bean with Business method
		 	3. Create a class which implements MethodBeforeAdvice interface of Spring AOP
		 	4. Create a class which implements AfterReturningAdvice interface of Spring AOP
		 	5. Configure bean in xml file and API ProxyFactoryBean from Spring AOP also in XML file
		 	6. Use IOC Container to read the bean 
		 	
		 */
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
		Order order = context.getBean("orderProxy",Order.class);
		
		// We are executing our Business Method
		// As we have configure AOP in our Project
		// BeforeAdvice will execute before our processOrder method and AfterReturningAdvice will execute after our processOrder method 
		order.processOrder("PristineMagnum", "Evening 6:30 PM");
		
		

	}

}
