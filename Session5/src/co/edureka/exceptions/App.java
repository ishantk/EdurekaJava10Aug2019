package co.edureka.exceptions;

public class App {

	public static void main(String[] args) {
		
		System.out.println(">> App Started");

		int[] arr = {10, 20, 30, 40, 50};
		int a=10, b=0, c=0;
		
		try { // surround the erroneous statements with try block
			//System.out.println(">> arr[11] is: "+arr[11]); // Line# 13 here represents an error which will occur at run time
			System.out.println(">> arr[1] is: "+arr[1]);
			c = a/b;
		}/*catch(ArrayIndexOutOfBoundsException aRef) { // catch shall catch the error and make programs execution normal :)
			System.out.println(">> OOPS!! Something went wrong !! "+aRef);
		}catch(ArithmeticException aRef) {
			System.out.println(">> OOPS Some Arithmetic Exception: !! "+aRef);
		}*/
		catch(Exception eRef) { // Polymorphic Structure : Ref Var of Parent can point to any Child Object
			System.out.println(">> OOPS!! Something went wrong !! "+eRef);
		}
		finally { // finally is executed in case you have handled or not handled the exception
			System.out.println(">> This has to be executed at any cost !!");
		}
		
		// Once control from try will jump into the catch, the lines written in try will be skipped
		/*
		try {
			try {
				
			}catch() {
				
			}finally{
			
			}
		}catch() {
			try {
				
			}catch() {
				
			}finally{
			
			}
		}finally{
			try {
				
			}catch() {
				
			}finally{
			
			}
		}
		
		*/
		
		System.out.println(">> c is: "+c);
		
		System.out.println(">> App Finished");
	}

}


// When from 1st line till the last line, main is executed -> Normal Termination of Program (main executes all of the instructions)
// When from main is not executed fully 				   -> Abnormal Termination of Program (main will not execute all of the instructions)
// 													    	  Further, program crashes !!

// Having a crash in program is no good as its issue with performance of OS !!
// OS will start giving message to the User to un-install this App !! :(


// PS: ArrayIndexOutOfBoundsException, ArithmeticException etc are the built in Exception classes
//     They are Child of Exception class in Java
// 	   Exception is Parent class to all the Exceptions in Java
//     class Exception{ } | Parent to all the errors at run time




