
public class DataTypes {

	// main is executed automatically when we execute our java program
	// so, whatever we write in main will be executed but in a sequence i.e. one after another
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Container Creation Statements
		
		// Integral Storage Container | negative and positives both
		
		byte age = 10; // byte is 8 bits of memory
		// its a small storage space as compared to integer
		// byte is 8 bits -> 2 power 8 -> 256
		// 256/2 -> 128 -> -128 to 0 to 127 is the range of storage container byte
		
		age = 127; // this works for us
		//age = 128; // error -> 128 is out of range
		
		// short : 16bits
		// int   : 32bits
		// long  : 64 bits
		
		// Floating Point Containers
		
		//float pi = 3.14f;  //32 bits
		double pi = 3.14;    //64 bits
		
		// Character Containers
		char ch = 'A';
		ch = 'Z';
		ch = 99; 		// ASCII Code
		ch = '\u0905'; 	// Unicode -> put \\u in the beginning and later Unicode
		System.out.println("ch is: "+ch);
		
		// Logical Container : boolean
		boolean isInternetOn = true;
		isInternetOn = false;
		
		System.out.println("Is Internet Connected : "+isInternetOn);
		
		// PS: As of now all the containers which we have created are Single Value Container -> PRIMITIVES in Java :)
	}

}
