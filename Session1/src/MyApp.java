/*
 
 	Programming Language ?
	Q1 Why to learn it ?
	A1 To write a Software Application !!

	eg: we wish to develop a device driver software | C/C++

	Q2 Why Java ?
	A2 We wish to write Applications which can run on any OS !!


	Java is not just a PL, its a technology as well !!
		JSE	(Core Java)
			Java Standard Edition
			Desktop Application Development
		JEE (Advanced Java)
			Java Enterprise Edition
			Web Application Development
		JME
			Java Mobile Edition
			Applications for Feature Phones	


	When we create a Program we save it in a file. And every file has an extension.
	
	Oranges 		| Source

	Juicer  		| Process Oranges

	Liquid Juice 	| End Result

	============================

	MyApp.java	| Source Code 			High Level Language

	Compiler 	| Process Souce Code 	

	MyApp.class	| ByteCode 				Low Level Language | Assembly Code


	Compiler is a software !!
	 We install JDK | Java Development Kit !!
	It contains tools and some built in codes (java library) which we can use in our program
				compiler -> javac

	When we install JDK, JRE will automatically be installed !!
	JRE is Java Runtime Environment
	How .class i.e. Bytecode is suppose to be executed will be taken care by JRE			


	>>> 1. Install JDK		
		PS: Setup System Path :)
		Steps are attached in LMS Portal !! Or Just Google !!


	* JVM is a system software which is pre-installed by OS vendor for us !!
	* Since, JVM is available on all the paltforms (OS's eg: Mac, Linux, Windows...)
	  Hence, Java is Platform Independent and we can thrfore say Java is Portable
	* All Java Apps are executed by JVM and JVM ascts as Sandbox for them  


	>>> 2. Install Eclipse IDE (Java EE Edition)
		Pre-Requisite : Install JDK before Eclipse :)
		Integrated Development Environment !!
		It will internally user JDK so that developer can easily write program in Java !!
		Its a software which Java Developer will use to effectively create a Java Software !! 
 */

// High Level Language :)
public class MyApp {

	// Whatever we write in main will be executed for us !!
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Printing Statements/Instructions | Built In Code Snippet which comes as a part of JDK
		//    Eclipse used JDK and JRE both automatically
		System.out.println("Hello World");
		System.out.println("Be Exceptional !!");
		System.out.println("Search the CANDLE Rather than cursing the DARKNESS !!");
		// Output came up in a sequence i.e. Line # 10 > 11 > 12
		
		// 2. Creational Statements
		//    Storage Container Creation
		//    2.1. Single Value Storage Creation
		int johnsAge = 30;
		// johnsAge is name of storage container -> created in RAM allocated to our program
		// 30 is constant and we call it as literal
		// int is type of storage container which will also define the size i.e. 32bits
		// Type of Storage Container : Data Type
		// Data Type will define what kind of data fits in and what can be the size limits
		
		// 2.2 Update Storage Container
		johnsAge = 32; // Change the contents in the container
		
		// 2.3 Read the Container Contents
		System.out.println("Johns Age is: "+johnsAge);
	}

}
