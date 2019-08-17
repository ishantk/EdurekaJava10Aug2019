//import java.util.Scanner;
//import java.lang.String; // No need to write


public class StringAPIs {

	public static void main(String[] args) {
		
		//char gender = 'M';
		//char gender = 'Male';   //-> error
		//char gender = "Male";   //-> error
		
		// String is a Built In class available in a package called java.lang which we need not to import.
		// But we need not to import it !!
		//String gender = "Male";
		//String name = "John Watson";
		//String quote = "Be Exceptional !! Work hard and let Success be Your Noise !!";
		
		// Syntaxes to create String in Java
		// 1. Interned Way !!
		String s1 = "HelLo";
		String s2 = "Hello";
		
		// 2. Object Way !!
		String s3 = new String("Hello");
		String s4 = new String("HeLLO");
		
		// s1, s2, s3 and s4 are reference variables and shall hold HashCode

		// Comparing References Below:
		if(s1 == s2) {
			System.out.println(">> s1 == s2");
		}else {
			System.out.println(">> s1 != s2");
		}
		
		if(s3 == s4) {
			System.out.println(">> s3 == s4");
		}else {
			System.out.println(">> s3 != s4");
		}
		
		// Lets Read the Strings
		// We will get the values i.e. data rather than HashCodes
		System.out.println(">> s1 is: "+s1);
		System.out.println(">> s2 is: "+s2);
		System.out.println(">> s3 is: "+s3);
		System.out.println(">> s4 is: "+s4);
		
		// Why we can't see the HashCodes ?
		// Lets execute toString
		System.out.println(">> s1.toString() is: "+s1.toString());
		System.out.println(">> s2.toString() is: "+s2.toString());
		System.out.println(">> s3.toString() is: "+s3.toString());
		System.out.println(">> s4.toString() is: "+s4.toString());
		
		// Observation : with and without toString output is same !!
		// 			     even if you don't put toString, it is executed automatically for us !!
		
		// Let us compare values
		if(s1.equals(s2)) {
			System.out.println(">> s1 equals s2");
		}else {
			System.out.println(">> s1 not equals s2");
		}
		
		if(s3.equals(s4)) {
			System.out.println(">> s3 equals s4");
		}else {
			System.out.println(">> s3 not equals s4");
		}
		
		if(s3.compareTo(s4) == 0) {
			System.out.println(">> s3 comparedTo s4");
		}else {
			System.out.println(">> s3 not comparedTo s4");
		}
		
		if(s3.equalsIgnoreCase(s4)) {
			System.out.println(">> s3 equals Ignore Case s4");
		}else {
			System.out.println(">> s3 not equals Ignore Case s4");
		}
		
		if(s3.compareToIgnoreCase(s4) == 0) {
			System.out.println(">> s3 comparedTo Ignore Case s4");
		}else {
			System.out.println(">> s3 not comparedTo Ignore Case s4");
		}
				
	}

}
