package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import co.edureka.model.FoodItem;
import co.edureka.model.SpiceyHerbsCheeseBurger;
import co.edureka.model.VeggieBurger;

public class InheritanceApp {

	public static void main(String[] args) {
		
		FoodItem item = new FoodItem();
		item.setPrice(100);
		
		VeggieBurger burger = new VeggieBurger();
		burger.setPrice(200);
		burger.setName("Special Veg Burger");
		burger.setDescription("Fresh Vegetable Burger with Seasonings");
		
		SpiceyHerbsCheeseBurger cheeseBurger = new SpiceyHerbsCheeseBurger();
		cheeseBurger.setPrice(300);
		cheeseBurger.setName("Spicey Herby Cheesy");
		cheeseBurger.setDescription("Fresh Vegetable and herbs Burger with Mexican Spices");
		cheeseBurger.setHerbs("Oregano");
		cheeseBurger.setSpice(3);
		
		System.out.println(item);
		System.out.println(burger);
		System.out.println(cheeseBurger);
		
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
			
			// Save three Objects i.e. Parent, Child and GrandChild all together in single Table
			session.save(item);
			session.save(burger);
			session.save(cheeseBurger);
			
			transaction.commit();					// Ensure Transaction must be executed
			
			System.out.println(">> Hibernate Execution Done !!");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception "+e);
			e.printStackTrace();
		}
		

	}

}
