import java.util.Scanner;

public class Methods {
	
	
	// applyPromoCode is a Method which will always check for promotional discounts
	// applyPromoCode is name of the method which can be any name of your choice.
	// void is return type or acknowledgement
	// () -> input list
	// CREATIONAL STATEMENTS -> Which CREATES METHOD in MEMORY
 	void applyPromoCode() { // Method or Function or Procedure or Routine
		// Use Case : We have 3 Promo Codes : 10, 20 and 50.
		// No Other Promo Code is acceptable !!
		// 1. We need to validate if user has entered correct promo code or not
		// 2. Accordingly we must offer discount
		
		// Below written statements they correspond to a particular task in our program
		// Task is known as applyPromoCode :)
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(">> Enter Amount");
		double amount = scanner.nextDouble();
		
		System.out.println(">> Enter Promo Code");
		int promoCode = scanner.nextInt();
		
		if(promoCode == 10 || promoCode == 20 || promoCode == 50) {
			
			double finalAmount = amount - amount*(promoCode/100.0);
			System.out.println(">> You have to pay: \u20b9"+finalAmount);
			
		}else {
			System.out.println(">> Sorry !! This is not a Valid Promotional Code :( ");
		}
	}
	

	public static void main(String[] args) {
		
		// Let us Access applyPromoCode method here
		// Accessing the method means executing it
		
		// Create an Object of Your Class in main
		Methods mRef = new Methods(); // Object Construction Statement 
		// What's an Object? -> We will discuss later
		// Why we need it -> To access i.e. execute the method
		
		// We can repeatedly execute similar statements again and again by making them part of a Method
		mRef.applyPromoCode();
		mRef.applyPromoCode();
		mRef.applyPromoCode();
		
	}

}
