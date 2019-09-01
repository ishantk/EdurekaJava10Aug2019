package co.edureka.main;

import java.util.ArrayList;
import java.util.Scanner;

import co.edureka.controller.DBHelper;
import co.edureka.model.User;

public class UberApp {

	public static void main(String[] args) {
		
		/*
		System.out.println(">> Welcome to Uber App");
		System.out.println(">> You can now book rides with us");
		System.out.println(">> Please Register Yourself First");
		
		Scanner scanner = new Scanner(System.in);
		
		User user = new User();
		System.out.println(">> Whats Your Name? ");
		user.name = scanner.nextLine();
		System.out.println(">> Whats Your Phone? ");
		user.phone = scanner.nextLine();
		System.out.println(">> Whats Your Email? ");
		user.email = scanner.nextLine();
		
		System.out.println(">> Please Confirm Your Details: ");
		System.out.println(user); // toString will be executed
		
		System.out.println(">> Shall we Register You? (Yes/No)");
		String choice = scanner.nextLine();
		
		if(choice.equalsIgnoreCase("Yes")) {
			// From here data must be saved in the database :)
			
			DBHelper db = new DBHelper(); // Constructor will be executed.
			db.createConnection();		  // Connection with DB Shall be Established
			db.registerUser(user);
			db.closeConnection();
				
			System.out.println(">> Thank You for registering with Us");
			
		}else {
			System.out.println(">> We are sorry for not having you with Us");
		}
		
		scanner.close(); // close the Scanner to release memory resources
		*/
		
		
		/*
		User user = new User();
		user.name = "Fionna Flynn";
		user.phone = "+91 99999 11111";
		user.email = "fionna.flynn@example.com";
		user.uid = 2;
		*/
		
		/*
		User user = new User(2, "Fionna Flynn", "+91 99999 11111", "fionna.flynn@example.com");
		
		DBHelper db = new DBHelper();
		db.createConnection();
		db.updateUser(user);
		db.closeConnection();
		*/
		
		/*
		DBHelper db = new DBHelper();
		db.createConnection();
		db.deleteUser(2);
		db.closeConnection();
		*/
		
		DBHelper db = new DBHelper();
		db.createConnection();
		ArrayList<User> users = db.fetchAllUsers();
		db.closeConnection();
		
		for(User user : users) {
			user.showUser();
		}
		
	}

}
