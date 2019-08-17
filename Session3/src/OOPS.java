/*
 	
 	OOPS : Object Oriented Programming Structure
 		   1. Object
 		   2. Class
 		   
 		   Object Oriented means Object is our central or core element to be discussed
 		   
 	> OOPS in Real Life
	 	> Object : Anything which we can see or touch is Object
	 		   	   Its a Reality. It exists in real !!
	 	> Class  : Drawing of an Object
	 			   Representation how an object will look like
	 			   
	 	What will you think of First ? Object or Class ?	
	 	Use Case: We wish to create a Chair !!	
	 	> We will think of Chair first !! How the chair should be !!
	 	> After thinking we will draw it on a paper
	 	> From the drawing we will create a new Chair :) 
	 	
	 	OOPS Principle :)
	 	1. Think of an Object
	 	2. Draw the Object i.e. Create Class
	 	3. Create the Real Object 
	 	
	 > OOPS in Computer Science
	 	> Object : Multi Value Container which shall hold data
	 			   > data can be homogeneous or hetrogenous
	 			   > data is stored as key value pairs, keys are attributes and values are the real data
	 	> Class  : Textual Representation how an object will be created in memory with what attributes and data
	 	
	 	OOPS Principle :)
	 	1. Think of an Object
	 	2. Draw the Object i.e. Create Class
	 	3. Create the Real Object 
	 	
	 	Use Case : We have to create an application to book a cab !!
	 			  
	 			   Model View Controller Architecture
	 			   ----------------------------------
	 			   Model 		: Data	(Object)
	 			   View  		: UI
	 			   Controller 	: Logic
	 			   
	 			   Firstly we shall focus on Model i.e. data required for our application
	 			   1. Data of Customer for Registration
	 			   2. Data of Driver for Registration
	 			   3. Data of Cab which Driver will drive
	 			   4. Data of Ride which Customer wish to book
	 			   .
	 			   ..
	 			   ....
	 			   
	 			   1. Think of an Object
	 			   	  All these Model Structures below i.e. Objects are in thinking phase
	 			   	
	 			   Customer | Object
	 			   	name	| Attributes 
	 			   	phone
	 			   	email
	 			   	gender
	 			   	age
	 			   	address
	 			   	
	 			   Driver	| Object	
	 			    name	| Attributes 
	 			   	phone
	 			   	email
	 			   	gender
	 			   	age
	 			   	address
	 			   	licenseNum
	 			   	yearsOfExp
	 			   	
	 			   Cab		| Object
	 			   	regNum	| Attributes 
	 			   	color
	 			   	type
	 			   	
	 			   Ride				| Object
	 			   	sourceLocation	| Attributes 
	 			   	destinationLocation
	 			   	customer
	 			   	driver
	 			   	cab
	 			   	
	 			    :)
 */

// Textual Representation of an Object which will be look like in the memory
// 2. Drawing of an Object
class Customer{
	
	// Attributes for Object
	String name;
	String phone;
	String email;
	char gender;
	int age;
	String address;
	
}

class Cab{
	String regNumber;
	String color;
	int type; // 1 means Sedan, 2 means SUV, 3 means Utility
}

public class OOPS {

	public static void main(String[] args) {
		
		// 3. Create the Real Object
		Customer c1 = new Customer(); // Object Construction Statement
		// c1 is a Reference Variable which will hold HashCode of Object
		// new is an operator which will create an object at run time in the Heap area with all the attributes
		
		Customer c2 = new Customer();
		
		Customer c3 = c1; // Reference Copy
		
		// Printing the Ref Varibale we Get HashCode
		System.out.println(">> c1 is: "+c1);
		System.out.println(">> c2 is: "+c2);
		System.out.println(">> c3 is: "+c3);
		
		// Performing Operations on Objects : [.] Operator to performing operations
		
		// 1. Write Operation : Writing data for Attributes in Object
		// Initial Write Operation when we have put no data in our Object
		c1.name = "John";
		c1.phone = "+91 99999 88888";
		c3.email = "john@example.com";
		c1.age = 26;
		c3.gender = 'M';
		c1.address = "Redwood Shores";
		
		c2.name = "Fionna";
		c2.phone = "+91 99999 11111";
		c2.email = "fionna@example.com";
		c2.age = 28;
		c2.gender = 'F';
		c2.address = "Country Homes";
		
		// 2. Update Operation : Updating values for attributes
		//    The next write Operation will update data in Object
		
		c1.name = "John Watson";
		c3.age = 33;
		
		c2.name = "Fionna Flynn";
		c2.email = "fionna.flynn@example.com";
		
		// 3. Read Operation : Printing Data of Object
		System.out.println(">> "+c1.name+" is "+c1.age+" years old and lives in "+c3.address);
		System.out.println(">> "+c3.name+" is "+c3.age+" years old and lives in "+c1.address);
		
		System.out.println();
		
		System.out.println(">> "+c2.name+" is "+c2.age+" years old and lives in "+c2.address);
		
		// 4. Delete Operation
		// Deletion Happens automatically from memory !!
		// Garbage Collector will be executed automatically after a certain interval of time and unused objects are removed from memory !!
		// GC is maintained or scheduled by JVM !!
		
		// If you wish to execute GC right away
		System.gc(); // GC will be executed on your request instantly !! but it will delete only un-used objects from memory !!
		
				

	}

}
