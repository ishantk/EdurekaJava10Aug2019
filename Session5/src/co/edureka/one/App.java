package co.edureka.one;


public class App { // We are now creating this class in package : co.edureka.one

	public static void main(String[] args) {
		
		One oRef = new One();
		Two tRef = new Two();
		
		// private keyword : which cannot be accessed outside the class boundary :)
		//oRef.pvtShow();
		//tRef.pvtShow();
		
		oRef.defShow();
		oRef.protShow();
		oRef.pubShow();
		
		System.out.println();
		
		tRef.defShow();
		tRef.protShow();
		tRef.pubShow();
		

	}

}

/*
public class One{
	
}
*/
// In a single .java file i.e. source file we can have only 1 public class
// and the name of source file should be same name as that of public class
