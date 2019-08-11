
public class MethodSyntaxes {

	// Syntax #1
	// Non Static Method as their is no static keyword in front of method
	// It has 2 inputs and no acknowledgement i.e. void acknowledgement
	void addNumbers1(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(">> Sum of "+num1+" and "+num2+" is: "+sum);
	}
	
	// Syntax #2
	// Non Static Method as their is no static keyword in front of method
	// It has 2 inputs and int acknowledgement i.e. int acknowledgement which means must return integer at the end
	int addNumbers2(int num1, int num2) {
		int sum = num1 + num2;
		return sum; // must return int as last statement
	}
	
	// Syntax #3
	// Static Method as their is static keyword in front of method
	// It has 2 inputs and no acknowledgement i.e. void acknowledgement
	static void addNumbers3(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(">> Sum of "+num1+" and "+num2+" is: "+sum);
	}
	
	// Syntax #4
	// Static Method as their is static keyword in front of method
	// It has 2 inputs and int acknowledgement i.e. int acknowledgement which means must return integer at the end
	static int addNumbers4(int num1, int num2) {
		int sum = num1 + num2;
		return sum; // must return int as last statement
	}	

	public static void main(String[] args) {
		
		// 1. Accessing non static methods
		//    we need to create object of class
		MethodSyntaxes mRef = new MethodSyntaxes(); // Object Construction Statement
		
		mRef.addNumbers1(10, 20);
		int result = mRef.addNumbers2(33, 44);
		System.out.println(">> Result: "+result);
		
		System.out.println();
		
		// 2. Accessing static methods
		//    we just need to have the class name
		MethodSyntaxes.addNumbers3(11, 22);
		result = MethodSyntaxes.addNumbers4(44, 55);
		System.out.println(">> Result: "+result);

	}

}
