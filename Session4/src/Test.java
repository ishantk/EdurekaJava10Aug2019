class Counter{
	
	// Attribute : Property of Object
	int count;
	// Attribute : Property of Class
	static int sCount; 
	
	// Constructor | Property of Object
	Counter(){
		count = 1;
		sCount = 1; // Property of class accessible by Object
	}
	
	// Methods
	void incrementCount() {
		count++;  // count = count + 1
		sCount++; // sCount = sCount + 1	
	}
	
	void showCount() {
		System.out.println(">> count is: "+count+ " and sCount is: "+sCount);
	}	
}

public class Test {

	// Whatever we write in main will be executed
	public static void main(String[] args) {
		
		Counter c1 = new Counter();	// Object 1  // c1: 1 | sc: 1
		Counter c2 = new Counter(); // Object 2  // c2: 1 | sc: 1
		Counter c3 = c1;			// Object 1 | c1 and c3 refers to the same object
		
		c1.incrementCount(); // c1: 2 | sc: 2
		c2.incrementCount(); // c2: 2 | sc: 3
		c3.incrementCount(); // c1: 3 | sc: 4
		
		c1.incrementCount(); // c1: 4 | sc: 5
		c2.incrementCount(); // c2: 3 | sc: 6
		c3.incrementCount(); // c1: 5 | sc: 7
		
		Counter c4 = new Counter(); // c4: 1 | sc: 1
		c4.incrementCount(); 		// c4: 2 | sc: 2
								
		c1.showCount(); // >> count is: 5 and sCount is: 8	
		c2.showCount(); // >> count is: 3 and sCount is: 8	 
		c3.showCount(); // >> count is: 5 and sCount is: 8
		c4.showCount(); // >> count is: 2 and sCount is: 8	 
		
	}

}
