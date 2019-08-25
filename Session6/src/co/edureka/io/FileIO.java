package co.edureka.io;

import java.util.Scanner;

public class FileIO {

	public static void main(String[] args) {
		
		/*
		// Object Construction Statements
		Order oRef1 = new Order(1, "John", 500);	// Hard-Coded Values | We can make it dynamic by taking input from user :)
		Order oRef2 = new Order(2, "Fionna", 700);
		Order oRef3 = new Order(3, "George", 1200);

		// Challenge : These Order objects will be available in RAM and are temporary.
		//			   We must save them for further future reference or usage in a file :)
		
		System.out.println(oRef1); // Printing oRef1, oRef2 and oRef3 will automatically executed toString method now 
		System.out.println(oRef2);
		System.out.println(oRef3);
		
		oRef1.saveOrder();
		*/
		
		/*
		Scanner scanner = new Scanner(System.in);
		
		Order order = new Order();
		
		System.out.println(">> Enter Order Id:");
		order.oid = scanner.nextInt();
		
		System.out.println(">> Enter Order Price:");
		order.price = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println(">> Enter Customer Name");
		order.customerName = scanner.nextLine();
		
		System.out.println(">> Would you like to save this order(yes/no):");
		String choice = scanner.nextLine();
		
		if(choice.equals("yes")) {
			order.saveOrder();
		}
		*/
		
		Order oRef = new Order();
		oRef.readOrders();
		oRef.totalAmountOfOrders();
		
	}

}
