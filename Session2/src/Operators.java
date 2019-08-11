
public class Operators {

	// main is a method
	// main will be executed when we execute i.e. run our java program
	// whatever we write in main is executed in a sequence :)
	public static void main(String[] args) {
		
		int x = 12; // 1 1 0 0
		int y = 4;  // 0 1 0 0
		
		int z = x & y; // & is bitwise AND Operation
					// 0 1 0 0	-> 4
		
		z = x | y;	// 1 1 0 0
		System.out.println(">> z is: "+z); // 12

	}

}
