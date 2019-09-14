package co.edureka.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import co.edureka.model.Certificate;
import co.edureka.model.Student;

public class OneToManyApp {

	public static void main(String[] args) {
		
		
		Student s1 = new Student();
		s1.setName("Fionna");
		s1.setAge(21);
		
		Certificate c1 = new Certificate();
		c1.setName("OCJP");
		
		Certificate c2 = new Certificate();
		c2.setName("CCNA");
		
		Certificate c3 = new Certificate();
		c3.setName("AWS");

		List<Certificate> certificates = new ArrayList<Certificate>(); // Polymorphic Statement
		certificates.add(c1);	// 0
		certificates.add(c2);	// 1
		//certificates.add(c3);	// 2
		
		s1.setCertificates(certificates); // Fulfillment of Has-A Relationship | Linked Certificates with Student Here :)
		
		//System.out.println(s1);
		
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
			
			//session.save(s1);						// Saving Student Object will also save Certificates :)
			
			Student sRef = session.get(Student.class, 2);
			
			System.out.println("Student: "+sRef.getName());
			System.out.println("Certificates:");
			List<Certificate> certis = sRef.getCertificates();
			
			for(Certificate cRef : certis) {
				System.out.println(cRef);
			}
			
			transaction.commit();					// Ensure Transaction must be executed
			
			System.out.println(">> Hibernate Execution Done !!");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception "+e);
			e.printStackTrace();
		}		
		
	}

}
