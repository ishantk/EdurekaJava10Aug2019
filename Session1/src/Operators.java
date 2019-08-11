
public class Operators {

	public static void main(String[] args) {
		
		// So Far we have learnt:
		// 1. Printing Statements
		// 2. Creational Statements
		// 2.1 Single Value Container 
		// 2.2 Multi Value Container
		// 3. Updation Statements
		// 4. Computational Statements : Compute data in containers for some result :)
		
		int customerCount = 100;
		int productOfPrice = 7500;
		int customerCountWhoPurchasedProduct = 63;
		
		int revenue = customerCountWhoPurchasedProduct * productOfPrice;
		System.out.println(">> We generated a revenue of \u20b9"+revenue);
		System.out.println(">> We need to follow up "+(customerCount-customerCountWhoPurchasedProduct)+" Customers to buy our product");
		
		// Arithmetic Operators : +, -, *, /, %
		// Increment and Decrement ++ and --
		
		int x = 10;
		
		// Postfix Increment
		x++;	// x = x + 1	// 11
		// Prefix Increment
		++x;	// x = x + 1	// 12
		++x;					// 13
		x--;					// 12
		--x;					// 11
		System.out.println(">> x is: "+x); // 11
		
		// Explore : PostFix and PreFix Difference 
		
		// Assignment Operators
		// =, +=, -=, *=, /=, %=
		
		x+=3; // x = x + 3;  // x = 11 + 3 -> 14
		System.out.println(">> x now is: "+x);
		
		x%=3;	// x = x % 3; // x = 14 % 3 // % means remainder 
		System.out.println(">> x now is: "+x); // ?
				
		// Relational Operators | Gives true or false as a result  
		// >, <, >=, <=, ==, !=
		int p = 10;
		int q = 10;
		int r = 20;
		
		System.out.println(">> is p graeter than q? " + (p > q) );
		System.out.println(">> is p equal to than q? " + (p == q) );
		
		// Conditional | Gives true or false as a result
		// && ||
		
		System.out.println(">> is r graeter than p and q? " + ( (r > p) && (r > q) ) );

	}

}
