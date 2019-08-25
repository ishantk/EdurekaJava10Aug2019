package co.edureka.lang;

public class Wrapper {

	public static void main(String[] args) {
		
		// 1. Converting/Representing Primitive as Object 
		
		// Primitive Type
		int i = 10;
		// Object Type
		Integer iRef = new Integer(i); // Primitive to Object Conversion | BOXING
		
		char ch = 'A';
		Character cRef = new Character(ch);
		
		double d = 2.2;
		Double dRef = new Double(d);

		// AUTO-BOXING
		Integer iRef1 = i; // -> Integer iRef1 = new Integer(i); 
		Character cRef1 = ch;
		Double dRef1 = d;
		
		
		// 2. Extracting Primitive from Object
		int j = iRef.intValue();	// Object to Primitive | UNBOXING
		char dh = cRef.charValue();
		double e = dRef.doubleValue();
		
		
		// AUTO-UNBOXING
		int j1 = iRef1;  // -> int j1 = iRef1.intValue(); 
		char dh1 = cRef1;
		double e1 = dRef1;
	}

}
