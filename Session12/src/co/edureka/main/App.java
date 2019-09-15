package co.edureka.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import co.edureka.model.Connection;
import co.edureka.model.Father;
import co.edureka.model.Son;

public class App {

	public static void main(String[] args) {
		
		// Traditional Way how we create an Object in Java :)
		
		// Below Connection Object is a Configuration Object
		// Configuration Object includes data which may change again and again :)
		
		/*
		Connection connection = new Connection();
		connection.setUrl("jdbc:mysql://localhost");
		connection.setUsername("john.watson");
		connection.setPassword("john123");
		connection.setDataBase("edureka");
		
		System.out.println(">> Connection Object Details:");
		System.out.println(">> "+connection);
		*/
		
		// Spring Core
		// IOC (Inversion Of Control) Principle
		// Let Spring FW Create Objects for You. 
		// You as developer configure Object's data in XML file and request for Object from Spring FW.
		// Spring Core Layer has IOC Container which will read XML file and create objects for us :)
		// We have 2 IOC Containers which can generate objects for us and shall also manage life-cycle of object
		// IOC Containers:
		// 1. BeanFactory
		// 2. ApplicationContext
		
		// Spring Core IOC Procedure:
		// 1. Configure Your Eclipse Java Project with Spring Core Jar Files | https://mvnrepository.com/artifact/org.springframework/spring-core
		// 2. Create a Bean i.e. Structure of Object
		// 3. Copy anyname.xml file in src directory which shall have configuration of Object
		// 4. User Spring Core FW's IOC Container i.e. either BeanFactory or ApplicationContext
		
		// 1. IOC Container -> BeanFactory
		/*
		Resource resource = new ClassPathResource("beans.xml"); // Parsing of XML File i.e. Reading the configurations
		BeanFactory factory = new XmlBeanFactory(resource);		// Creating Objects in memory will be taken care by BeanFactory
		
		Connection con1 = (Connection)factory.getBean("cRef1");
		Connection con2 = factory.getBean("cRef2", Connection.class);
		
		System.out.println(con1);
		System.out.println(con2);

		// PS: In IOC Container BeanFactory Objects will be created when we will say getBean method i.e. when you request for them :)
		*/
		
		// 2. IOC Container -> ApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		//Connection con1 = (Connection)context.getBean("cRef1");
		//Connection con2 = context.getBean("cRef2", Connection.class);
		
		//System.out.println(con1);
		//System.out.println(con2);
		
		// PS: In IOC Container ApplicationContext Objects will be created before hand even if you do not request for them :)
		// Spring Documentation Please refer : https://spring.io/docs
		
		
		// Below we are trying to fetch the same object again from IOC Container :)
		//Connection c1 = context.getBean("cRef1", Connection.class);
		//Connection c2 = context.getBean("cRef1", Connection.class);
		
		//System.out.println(c1);
		//System.out.println(c2);
		
		//ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		//cxt.close(); // close the IOC Container
		
		//Father f = context.getBean("fRef", Father.class);
		//System.out.println(f);
		
		Son s = context.getBean("sRef", Son.class);
		System.out.println(s);
		
	}

}
