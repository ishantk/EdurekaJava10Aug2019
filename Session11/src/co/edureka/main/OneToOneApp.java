package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import co.edureka.model.Address;
import co.edureka.model.Person;

public class OneToOneApp {

	public static void main(String[] args) {
		
		Person pRef = new Person();
		pRef.setName("Fionna Flynn");
		pRef.setEmail("fionna@example.com");
		
		Address aRef = new Address();
		aRef.setAdrsLine("Country Homes");
		aRef.setCity("Bengaluru");
		aRef.setState("Karnataka");
		aRef.setZipCode(520001);

		// Linked One To One Relationship Below:
		pRef.setAddress(aRef);
		aRef.setPerson(pRef);
		
		// Implement Hibernate APIs
		
		// SessionFactory API Creates Session
		SessionFactory sessionFactory = null;
		// Session is a Connection to the DataBase
		Session session = null;
		// Atomicity -> Execution happens at once and if anything fails database rolls back to original state
		Transaction transaction = null;
		
		try {
			
			// Parsing hibernate.cfg.xml file to read necessary information
			StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
			
			try {
				sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
			} catch (Exception e) {
				StandardServiceRegistryBuilder.destroy(registry);
				e.printStackTrace();
			}
			
			session = sessionFactory.openSession(); // Obtain Connection to the DataBase
			transaction = session.getTransaction(); // Reference to Transaction Object
			transaction.begin();					// Begin Transaction
			
			session.save(pRef);						// Saving Person Object will also save Address Object automatically
			
			transaction.commit();					// Ensure Transaction must be executed
			
			System.out.println(">> Hibernate Execution Done !!");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception "+e);
			e.printStackTrace();
		}

	}

}
