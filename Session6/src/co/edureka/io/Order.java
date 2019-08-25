package co.edureka.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

//public class Order extends Object{ // By default every class in java is Child of Object class
public class Order{

	// Attributes of Order Object
	public int oid;
	public String customerName;
	public int price;
	
	public Order(){
		
	}

	public Order(int oid, String customerName, int price) {
		this.oid = oid;
		this.customerName = customerName;
		this.price = price;
	}
	
	
	// Override a built in toString method of Object class in Java
	public String toString() {
		return oid+", "+customerName+", "+price+"\n"; // Comma Separated Value which is returned back as a String
	}
	
	public void saveOrder() {
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/orders.csv"); // orders.csv is file name
			String dataToBeWritten = toString();
			
			// With FileOutputStream we need to write data in the form of bytes
			//FileOutputStream stream = new FileOutputStream(file);
			//FileOutputStream stream = new FileOutputStream(file, true); // true : append mode
			//stream.write(dataToBeWritten.getBytes());
			
			//stream.close();  // release memory resources
			
			
			// With FileWriter wesave the data as String directly
			//FileWriter writer = new FileWriter(file);
			FileWriter writer = new FileWriter(file, true); // true : append mode
			writer.write(dataToBeWritten);
			
			writer.close(); // release memory resources
			
			System.out.println(">> Order from "+customerName+" Saved :)");
			
		}catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
			//e.printStackTrace(); // to view the line numbers on which exception same in 
		}
	}
	
	public void readOrders() {
		
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/orders.csv"); // orders.csv is file name
			
			// FileInputStream reads data as bytes :)
			//FileInputStream stream = new FileInputStream(file);
			//int ch =  0;
			//while((ch = stream.read()) != -1) { // -1 means end of file
			//	System.out.print((char)ch); 	// cast byte as character
			//}
			
			//stream.close();
			
			FileReader reader = new FileReader(file);
			BufferedReader buffer = new BufferedReader(reader);
			String line = "";
			
			while( (line = buffer.readLine()) != null) { // null means no more line
				System.out.println(line);
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	public void totalAmountOfOrders() {
		
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/orders.csv"); // orders.csv is file name
			
			FileReader reader = new FileReader(file);
			BufferedReader buffer = new BufferedReader(reader);
			String line = "";
			
			int total = 0;
			
			while( (line = buffer.readLine()) != null) { // null means no more line
			
				String[] data = line.split(",");
				
				String strPrice = data[2].trim(); 
				int price = Integer.parseInt(strPrice);
				
				total += price;
			}
			
			System.out.println("=================");
			System.out.println(">> "+total);
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
}
