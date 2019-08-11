
public class ArraySyntaxes {

	public static void main(String[] args) {
		
		// Multi Value Container Creation
		
		// Syntax #1  								|  Implicit Syntax where new int[] is appended by compiler automatically on behalf of us
		int[] a1 = {10, 20, 30, 40, 50};
		System.out.println(">> a1[3] is: "+a1[3]); //40
		
		// Syntx #2 : add >> new int[] << extra		| Explicit Syntax, we append new int[] ourselves
		int[] a2 = new int[]{10, 20, 30, 40, 50};
		// new is operator which instructs JVM to create Array at Run Time :)
		System.out.println(">> a2[3] is: "+a2[3]); //40
		
		// But in above arrays a1 and a2 are called reference variables which contains HashCode of Arrays
		// Further, they are different reference variables and holds different HashCodes to different Arrays even though data is same
		
		System.out.println(">> a1 is: "+a1);
		System.out.println(">> a2 is: "+a2);
		
		// Syntax #3 | Bracket After
		int a3[] = {10, 20, 30, 40, 50};
		int a4[] = new int[]{10, 20, 30, 40, 50};
		
		// Syntax #4 | We Mention Size and not Element Values. Hence all element values will be 0 :)
		int[] a5 = new int[5]; // Array with 5 elements where all elements will be 0 in value
		
		a5[3] = 333;
		
		System.out.println(">> a5 Data: "+a5[0]+" "+a5[1]+" "+a5[2]+" "+a5[3]+" "+a5[4]);
		
		// DONTS on Array Syntaxes:
		// We cant club both approaches :(
		//int[] arr = new int[5] {1, 2, 3, 4, 5}; // error
		
		//System.out.println(">> a5[10] is: "+a5[10]); // Here, 10th index does not exist. 
		// not an error at compile time. but an error at run time :) | ArrayIndexOutOfBoundsException
		// Since Arrays are created at run time, we get errors at run time when you access a non available index :)
		
		double[] dArr = {2.2, 'A', 10};
		System.out.println(">> dArr Data: "+dArr[0]+" "+dArr[1]+" "+dArr[2]); // here we will see all doubles
		// Arrays are Homogeneous : i.e. Same Type of Data :)
		
		// Conclusion : Arrays are Multi Value Container (Homogeneous Containers) with indexed data :)
		
	}

}
