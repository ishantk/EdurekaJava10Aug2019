
public class MutableStrings {

	public static void main(String[] args) {
		
		String s1 = new String("Hello");
		
		// Strings are IMMUTABLE. Any Modification shall produce a new String :)
		String s2 = s1.concat(" World");
		
		System.out.println(">> s1 is: "+s1); // Hello
		System.out.println(">> s2 is: "+s2); // Hello World
		
		// StringBuffer is MUTABLE. Any modification shall happen in the existing String !!
		// StringBuffer is THREAD-SAFE
		// We can use it only as Object way !! Not interned way
		//StringBuffer s3 = "Hello"; // error
		StringBuffer s3 = new StringBuffer("Hello");
		s3.append(" World"); 
		System.out.println(">> s3 is: "+s3);
		
		
		// StringBuilder is MUTABLE
		// StringBuilder is NOT THREAD-SAFE
		// We can use it only as Object way !! Not interned way
		StringBuilder s4 = new StringBuilder("Hello");
		s4.append(" World");
		System.out.println(">> s4 is: "+s4);
		
		// Explore the similar Built In Methods on StringBuffer and StringBuilder :)

	}

}
