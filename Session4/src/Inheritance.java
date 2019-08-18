class Parent{
	
	// Attributes: Property of Object (Parent Object's Attributes)
	String fname;
	String lname;
	int wealth;
	
	// Constructor - Default : Property of Object
	Parent(){
		System.out.println(">> Parent Object Constructed");
		fname = "John";
		lname = "Watson";
		wealth = 100000;
	}
	
	// Method : Property of Object
	void showData() {
		System.out.println("====Parent Data====");
		System.out.println(">> Name: "+fname+" "+lname);
		System.out.println(">> Wealth: \u20b9"+wealth);
		System.out.println("===================");
	}
	
}

// If we dont write any attribute or method in our class it means nothing will be in the Object
// It represent an Empty Object

// If Child extends Parent : Inheritance Relationship
// Parent's data is accessible by Child but it is not like that data from Parent will come into Child
// If your Parent has a Car, you can access it and use it but its not yours !!
class Child extends Parent{
	
	// Attribute : Property of Object | (Child Object's Attributes)
	String fname;
	String lname;
	int wealth;
	
	Child(){
		System.out.println(">> Child Object Constructed");
	}
	
	void showChildData() {
		System.out.println(">> Wealth is: "+wealth);
	}
	
	// Overriding : We create the same method which was in the Parent, in the Child!!
	void showData() {
		
		super.showData(); // Execute Parent's showData with super reference variable from the Child
		
		System.out.println("==Child's showData==");
		System.out.println(">> Name: "+fname+" "+lname); // Since, Child has no attribute fname and lname, it will access its Parent's attributes
		System.out.println(">> Wealth is: "+wealth);
	}
}


public class Inheritance {

	public static void main(String[] args) {
		
		// Object Construction Statement
		//Parent pRef = new Parent(); //Default Constructor will be Executed
		//pRef.showParentData();
		
		// We are creating a Child Object
		Child cRef = new Child(); 
		
		// Rule #1
		// Before the Object of Child, Parent Object is Constructed in the Memory
		
		// Rule #2
		// Child can access attributes and methods of Parent if it does not have it !!
		// In case Child has it, it will access of its own !!
		
		//cRef.wealth = 200000;   // Update attribute wealth in the Parent Object
		cRef.wealth = 200000;     // Update attribute wealth in the Child Object
		cRef.fname = "Leo";
		cRef.showData();    	  // Execution of showData method of Parent Object if Child will not have it
							      // If Child also has the same method, Child's Method will be executed and Not Parent's
		//cRef.showChildData();   // Execution of showChildData method of Child Object
		
		// Rule #3
		// Inheritance is not that what ever is in the Parent comes into the Child
		// Inheritance here in our OOPS is whatever Child does not have, it can access in the Parent !!
		// If Child has its own then it will not access Parent's data

	}

}

/*
 
 	Types of Inheritance:
 	
 	1. Single Level
 	A
 	|
 	B
 	
 	class A{
 	
 	}
 	
 	class B extends A{
 	
 	}
 	
 	2. Multi Level
 	A
 	|
 	B
 	|
 	C
 	
 	class A{
 	
 	}
 	
 	class B extends A{
 	
 	}
 	
 	class C extends B{
 	
 	}
 	
 	3. Hierarchy
	 	A
	 	|
	  B   C	
	  
    class A{
 	
 	}
 	
 	class B extends A{
 	
 	}
 	
 	class C extends A{
 	
 	}
 	
 	4. Multiple
	 	A   B
	 	  |
	 	  C
 	  
 	class A{
 	
 	}
 	
 	class B{
 	
 	}
 	
 	class C extends A, B{ // ERROR : Not Supported :(
 	
 	}
 	
 	5. Hybrid
 	1+2+3
 	
 
 */
