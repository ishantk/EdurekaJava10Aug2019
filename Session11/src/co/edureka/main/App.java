package co.edureka.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.criterion.Restrictions;

import co.edureka.model.Employee;

/*
 	
 	Hibernate Procedure:
 	1. Configure Eclipse Project with Hibernate Jars and Type4 JDBC Driver Jar
 	   PS: https://hibernate.org/orm/releases/5.4/
 	2. Create a Java Class which represents model to be saved in database  
 	3. Copy hbm xml file in src directory to configure mapping of Java Class with MySQL Table
 	4. Copy hibernate.cfg.xml file in src directory and shall configure DataBase Parameters 
 	5. In App i.e. Class with main method where execution shall happen we must write our Hibernate Code
 	
 	Hibernate API Documentation : https://docs.jboss.org/hibernate/orm/3.2/api/
 	
 */

public class App {

	public static void main(String[] args) {
		
		
		Employee eRef1 = new Employee(null, "Mike", "+91 99999 11111", "mike@example.com", "Sr. Engr", 40000);
		Employee eRef2 = new Employee(null, "Kim", "+91 98999 12345", "kim@example.com", "Asst. Manager", 60000);
		
		System.out.println(eRef1);
		System.out.println(eRef2);
		
		
		
		// We wish to save data in database permanently !!
		// Challenge : Data is in Object which is temporary !!
		// Solution  : Hibernate : It will fire SQL Queries for us automatically
		
		
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
			}
			
			session = sessionFactory.openSession(); // Obtain Connection to the DataBase
			transaction = session.getTransaction(); // Reference to Transaction Object
			transaction.begin();					// Begin Transaction
			
			// 1. Insert Data in DataBase (Automatically SQL Query will be fired for us by extracting values of attributes in object referred by eRef1)
			session.save(eRef1);
			session.save(eRef2);
			
			// 2. Fetch Single Record from Table
			// Fetches record from Table and converts it to the Object as well :)
			//Employee emp = session.get(Employee.class, 2); // 2 is Employee ID i.e. Primary Key value on our Table
			//System.out.println(">> Fetched Record:");
			//System.out.println(">> "+emp);
			
			// 3. Update Data in Table
			// Fetch Data before you update
			//emp.setName("Mike Watson");
			//emp.setEmail("mike.watson@example.com");
			//emp.setSalary(79980);
			
			//session.update(emp);
			
			// 4. Delete Data from Table
			//Employee emp = new Employee();
			//emp.setEid(2);
			
			//session.delete(emp);
			
			// 5. Fetch All Records from Table
			// 5.1 Use Hibernate Query Language | Refer : https://docs.jboss.org/hibernate/core/3.3/reference/en/html/queryhql.html
			
			//String hql = "From Employee";
			//String hql = "From Employee where salary > 50000";
			
			//List<Employee> employees = session.createQuery(hql).list();
			
			// 5.2 Criteria API (Shall internally manage HQL for us)
			//Criteria criteria = session.createCriteria(Employee.class); // -> Explore new API
			//criteria.add(Restrictions.gt("salary", 50000));
			
			//List<Employee> employees = criteria.list();
			
			//for(Employee emp : employees) {
			//	System.out.println(emp);
			//	System.out.println("-----------------------------");
			//}
			
			// 6. Batch Operation : Fire multiple SQL Queries in a Transaction
			
			/*for(int i=1;i<=100;i++) {
				Employee emp = new Employee(null, "Employee"+i, "+91 99999 98"+i, "employee"+i+"@example.com", "SW Engr", 30000+i);
				session.save(emp); // 100 Employee Objects shall be saved here in session
			}*/
			
			transaction.commit();					// Ensure Transaction must be executed
			
			System.out.println(">> Hibernate Execution Done !!");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception "+e);
			e.printStackTrace();
		}
		
	}

}
