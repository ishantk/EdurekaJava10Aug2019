interface Inf1{
	
	int x=10;	 		// public static final int x = 10; // static -> here means property of interface
	
	void show(int num); // public abstract void show(int num);
	void hello();		// public abstract void hello();
	
}

interface Inf2{
	
	void show(int num);
	void bye();
	
}

// Multiple Inheritance | Interface to Interface Inheritance
interface Inf3 extends Inf1, Inf2{ // All the rules of Parent can be accessed by Child
	
}

//class CA implements Inf1, Inf2{ // Multiple Implementation and not Multiple Inheritance :)

class CA implements Inf3{
	
	public void show(int num) {
		System.out.println(">> num is: "+num);
	}
	
	public void hello() {
		System.out.println(">> hello from CA");
	}
	
	public void bye() {
		System.out.println(">> bye from CA");
	}
}


public class InfOnceAgain {

	public static void main(String[] args) {
	
		
		/*
		Inf1 iRef1 = new CA(); // Polymorphic Statement : Reference Variable of Interface can point to the object which implements it 
		iRef1.show(777);
		iRef1.hello();
		
		// iRef1.bye(); // error | We can access only those methods in CA Object which are implemented from Inf1
		
		System.out.println();
		
		Inf2 iRef2 = new CA();
		iRef2.show(333);
		iRef2.bye();
		// iRef2.hello(); error | We can access only those methods in CA Object which are implemented from Inf2
		
		System.out.println();
		
		System.out.println(">> x is: "+Inf1.x);
		System.out.println(">> x is: "+CA.x);
		*/
		
		Inf3 iRef3 = new CA();
		iRef3.show(777);
		iRef3.hello();
		iRef3.bye();
		
		System.out.println(">> x is: "+Inf3.x);
		
		

	}

}
