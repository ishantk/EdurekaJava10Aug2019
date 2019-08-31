package co.edureka.collections;

class Outer{
	
	void show() {
		System.out.println(">> This is show of Outer");
	}
	
	// Nested class or Inner Class
	class Inner{
		void show() {
			System.out.println(">> This is show of Inner");
		}
	}
}


class User{
	
	String name;
	String phone;
	String email;
	
	// Code Maintainability and readability becomes easier and a level of encapsulation is also increased
	// We got Object in an Object :) Containment Relationship
	class Adress{
		String adrsLine;
		String city;
		String state;
		int zipCode;
	}
	
}

public class NestedClass {

	public static void main(String[] args) {
		
		Outer oRef = new Outer();
		oRef.show();
		
		System.out.println();
		
		Outer.Inner iRef = oRef.new Inner();
		iRef.show();

	}

}
