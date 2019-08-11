
public class Arrays {

	// main is a method
	// in main method whatever we will write will be executed in a sequence
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3 storage containers created below:
		// These are SINGLE VALUE CONTAINERS
		int physicsMarks = 90;
		int chemistryMarks = 85;
		int mathsMarks = 88;
		
		// A MULTI VALUE CONTAINER : Array (More than 1 Value)
		// Arrays are created at RUN-TIME in Java and hence are constructed in the Heap Area :)
		int[] marks = {90, 85, 88};
		
		// Print data in storage containers
		System.out.println(">> Physics Marks: "+physicsMarks);		// 90
		System.out.println(">> Chemistry Marks: "+chemistryMarks);	// 85
		System.out.println(">> Maths Marks: "+mathsMarks);			// 88
		System.out.println(">> Marks: "+marks);						// HashCode

		// marks is a reference variable and not an array
		// marks ref variable shall point to array in the Heap Area
		
		// Update Data in Array
		marks[1] = 93;
		
		// Let us read data in array
		System.out.println(">> marks[0] is: "+marks[0]);
		System.out.println(">> marks[1] is: "+marks[1]);
		System.out.println(">> marks[2] is: "+marks[2]);
		
		// Show the data all together !!
		System.out.println(">> marks is: "+marks[0]+" "+marks[1]+" "+marks[2]);

	}

}
