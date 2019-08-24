/*
class Cab{
	
	// Whenever object is created in memory, constructor shall be executed
	Cab(){
		System.out.println(">> Cab Object Constructed");
	}
	
	void bookCab(String source, String destination){
		System.out.println(">> Cab Booked from "+source+" to "+destination);
	}
}*/

// Optimizing Run Time Polymorphism
// Since, Object of Cab was not a specific Object, so making it abstract user cannot create its objects any more :)
// >> We cannot create objects for abstract class
// >> But as per rule of inheritance, parent object is constructed before the child object
// >> in case of abstract classes this rule holds true and JVM will create parent object before child object
/*
abstract class Cab{
	
	// we can have constructor in abstract class because object of this can be created by JVM at RunTime to fulfill Rule of Inheritance
	Cab(){
		System.out.println(">> Cab Object Constructed");
	}
	
	// 1. abstract method is created in abstract class
	// 2. abstract method has no definition
	// 3. abstract method acts as a rule created by parent which all the children must define
	abstract void bookCab(String source, String destination);
	
	// In abstract class we can have normal methods with definitions and we can have n- number of abstract methods
	// If we have 3 abstract methods i.e. 3 rules are created by parent, which child must define all of them !!
}
*/



// We can optimize the same program further so as to eliminate Parent objects in memory which are of no use :)
// We will create interface
interface Cab{
	
	// Interfaces cannot have constructors, whereas abstract class can have it 
	// It means, for interface neither we not JVM can create its object :)
	// Interface is just a Rule Book which has to be implemented by Objects :)
	
	/*  // error
	Cab(){
		System.out.println(">> Cab Object Constructed");
	}
	*/
	
	// By default -> public abstract void bookCab(String source, String destination);
	void bookCab(String source, String destination);
	
	// If we have 3 abstract methods i.e. 3 rules are created by interface, which class implementing it must define and all of them !!
}

// Interfaces are not Inheritance technique :) No Parent Child Relationship as Rule of Inheritance cannot be fulfilled
// Its a Rule Book which may be implemented :)

class MicroCab implements Cab{//extends Cab{ // IS-A Relationship | Inheritance Relationship | Parent Child Relationship 

	MicroCab(){
		System.out.println(">> MicroCab Object Constructed");
	}
	
	// bookCab is Overrided
	public void bookCab(String source, String destination){
		System.out.println(">> MicroCab Booked from "+source+" to "+destination);
	}
}

class MiniCab implements Cab{//extends Cab{ // IS-A Relationship | Inheritance Relationship | Parent Child Relationship 

	MiniCab(){
		System.out.println(">> MiniCab Object Constructed");
	}
	
	public void bookCab(String source, String destination){
		System.out.println(">> MiniCab Booked from "+source+" to "+destination);
	}
}

class SedanCab implements Cab{// extends Cab{ // IS-A Relationship | Inheritance Relationship | Parent Child Relationship 

	SedanCab(){
		System.out.println(">> SedanCab Object Constructed");
	}
	
	public void bookCab(String source, String destination){
		System.out.println(">> SedanCab Booked from "+source+" to "+destination);
	}
}

class Bike implements Cab{//extends Cab{ // IS-A Relationship | Inheritance Relationship | Parent Child Relationship 

	Bike(){
		System.out.println(">> Bike Object Constructed");
	}
	
	public void bookCab(String source, String destination){
		System.out.println(">> Bike Booked from "+source+" to "+destination);
	}
}


public class RTP {

	public static void main(String[] args) {
		
		//Cab cRef = new Cab(); // Object Construction Statement
		//cRef.bookCab("Pristine Magnum", "Country Homes");
		
		//MicroCab mRef = new MicroCab();
		//mRef.bookCab("Pristine Magnum", "Country Homes");
		
		//Cab cRef = new MicroCab(); // Polymorphic Statement
		// Reference Variable of Parent is Pointing to Object of Child
		
		// Reference Variable of Interface can Point to the object which implements its rules :)
		Cab cRef;
		
		cRef = new MicroCab(); // We are constructing Object of MicroCab
		cRef.bookCab("Pristine Magnum", "Country Homes");
		
		System.out.println();
		
		cRef = new MiniCab();
		cRef.bookCab("Pristine Magnum", "Country Homes");
		
		System.out.println();
		
		cRef = new SedanCab();
		cRef.bookCab("Pristine Magnum", "Country Homes");
		
		System.out.println();
		
		cRef = new Bike();
		cRef.bookCab("Pristine Magnum", "Country Homes");
		
		// Reference Variable of Cab can point to any Child Object :) | More than 1 form -> Polymorphism
		// same bookCab method is used to book different type of cabs
		
		System.out.println();
		
		
		// Lets review below statements :)
		// Below statements shall create a Cab Object and bookCab will will book some generic Cab
		// Here, no specific type of Cab is known when we execute below code
		// cRef = new Cab();
		// cRef.bookCab("Pristine Magnum", "Country Homes");
		// So, we need to restrict user to write such statements :)

	}

}
