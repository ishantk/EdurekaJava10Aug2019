// Java Program : A Class with main 
public class Overloading {

	// Overloading 
		// Using same method name again and again but with different i.e. unique inputs
		// Rule to Overloading
		// 1. Same Function name
		// 2. Inputs must be unique 
		//    2.1 Number of inputs
		//    2.2 Type of Inputs
		//    2.3 Sequence of Inputs
		// 3. Return type has no role to play
	
	// Methods or Functions should be written within the class
	
	void addNumbers(int num1, int num2) { // 2 Inputs
		int result = num1 + num2;
		System.out.println(">>1. Result is: "+result);
	}
	
	void addNumbers(int num1, int num2, int num3) { // 3 Inputs
		int result = num1 + num2 + num3;
		System.out.println(">>2. Result is: "+result);
	}
	
	void addNumbers(double num1, double num2) { // change of Type of Inputs
		double result = num1 + num2;
		System.out.println(">>3. Result is: "+result);
	}
	
	void addNumbers(int num1, double num2) {	// Sequence of Inputs
		double result = num1 + num2;
		System.out.println(">>4. Result is: "+result);
	}
	
	void addNumbers(double num1, int num2) {
		double result = num1 + num2;
		System.out.println(">>5. Result is: "+result);
	}
	
	// Dont's in Overloading

	// Change in the names of input variables is not overloading 
	/*void addNumbers(int n1, int n2) { // 2 Inputs
		int result = n1 + n2;
		System.out.println(">>1. Result is: "+result);
	}*/
	
	// Return Type will not be helpful in overloading
	/*int addNumbers(int num1, int num2) { // 2 Inputs
		int result = num1 + num2;
		return result;
	}*/
	
	
	// main is a method which is executed when we run our program
	// whatever we write in main is executed in a sequence :)
	public static void main(String[] args) {
		
		// Execution of Overloaded Methods
		Overloading oRef = new Overloading(); // To Access i.e. execute non static methods we need to construct an Object
		oRef.addNumbers(10, 20); 		// Adding 2 integers
		oRef.addNumbers(10, 20, 30); 	// Adding 3 integers
		oRef.addNumbers(2.2, 3.3); 		// Adding 2 decimals
		oRef.addNumbers(12, 2.2);		// Adding integer and decimal
		oRef.addNumbers(1.2, 22);		// Adding decimal and integer
		

	}

}
