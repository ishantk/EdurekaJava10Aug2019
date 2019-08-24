package co.edureka.two;

import co.edureka.one.One;
//import co.edureka.one.Two; // error


// Parent Child Relationship i.e. Inheritance (Outside the package)
// Child can access only public and protected in Parent
// Child cannot access private and default
class CA extends One{
	
	void show() {
		//pvtShow(); // err
		//defShow(); // err
		protShow();
		pubShow(); 
	}
}

public class App {

	public static void main(String[] args) {
		
		One oRef = new One();
		//oRef.pvtShow(); // was accessible within class only
		//oRef.defShow(); // was accessible within package only
		//oRef.protShow();// was accessible within package only
		oRef.pubShow(); // accessible everywhere
		
		System.out.println();
		
		CA cRef = new CA();
		cRef.show();
	}

}


// PS: private is accessible within the class
//     default is accessible within the package
//     protected is also accessible within the package
//	   public is also accessible within the package and outside the package
//	   * protected is accessible outside the package only when inherited

// Access Specification
// Least Accessible to the Most Accessible
// private -> default -> protected -> public :)
