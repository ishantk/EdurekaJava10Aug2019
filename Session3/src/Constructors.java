// Amazon e-Commerce Platform
// We must list Products on Amazon

// 1. Think of an Object with attributes i.e. about data | MODEL
// Product : productId, name, brand, price


public class Constructors {

	public static void main(String[] args) {
		
		// 3. Create Product Object in Real
		Product p1 = new Product(); //Product(); -> execution of default constructor
		// Immediately after object is created in memory -> constructor will be executed automatically
		
		// Without writing anything we will print data of an Object
		// We will see default values for attributes which will be automatically taken care of !!
		System.out.println(">> "+p1.productId+" belongs to "+p1.name+" of "+p1.brand+" avaialble at price \u20b9"+p1.price);
		
		Product p2 = new Product(101, "iPhoneX", "Apple", 80000);
		System.out.println(">> "+p2.productId+" belongs to "+p2.name+" of "+p2.brand+" avaialble at price \u20b9"+p2.price);

	}

}

//2. Create class which is textual representation of an Object
class Product{
	
	// Attribute : Property of Object and not of Class
	int productId;
	String name;
	String brand;
	int price;
	
	// Default Constructor : Same name as that of class name
	// no return type
	// no input to it
	/* // Compiler will create such a constructor in our class with some default data for our attributes 
	Product(){
		productId = 0;
		name = null;
		brand = null;
		price = 0;
	}
	*/
	
	// Property of Object and not of class
	// Writing the data in HardCoded format !!
	Product(){
		productId = 0;
		name = "NA";
		brand = "NA";
		price = 100;
	}
	
	// Overloaded Constructor : With Inputs
	// Writing the data in dynamic way !! by taking the values from User at the time of Object Construction !!
	Product(int id, String nm, String bd, int pr){
		productId = id;
		name = nm;
		brand = bd;
		price = pr;
	}
	
	
	// We create constructors so as to write some initial values to our object's attributes :)
	
}

