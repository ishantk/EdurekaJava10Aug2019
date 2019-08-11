import java.util.Scanner; // Scanner class in Java has to be imported for usage

public class Conditions {

	public static void main(String[] args) {
		
		int amount = 5000;
		// We wish to offer a discount of 10% in case amount is greater than or equal to 500
		
		/*
		// Regular if/else
		if(amount >= 500) {
			double finalAmount = amount - (10.0/100.0)*amount;
			System.out.println(">> Congratulations !! You have got a 10% off. Please pay \u20b9"+finalAmount);
		}else {
			System.out.println(">> Sorry !! No Discounts for you. Please pay \u20b9"+amount);
		}
		*/
		
		// We wish to offer a discount of 10% in case amount > 500 and < 1000
		// We wish to offer a discount of 20% in case amount > 1000 and < 3000
		// We wish to offer a discount of 40% in case amount > 3000 
		
		// Ladder if/else
		
		double finalAmount = 0;
		
		if(amount >= 500 && amount < 1000) { 		// 500 to 999
			finalAmount = amount - (10.0/100.0)*amount;
		}else if(amount >= 1000 && amount < 3000) { // 1000 to 2999
			finalAmount = amount - (20.0/100.0)*amount;
		}else if(amount >= 3000) { 					// >= 3000
			finalAmount = amount - (40.0/100.0)*amount;
		}else {
			finalAmount = amount;
		}
		
		System.out.println(">> Please pay \u20b9"+finalAmount);
		
		// Nested if/else
		
		// In our phone we got internet and gps turned on
		boolean internet = false;
		boolean gps = true;
		
		if(internet) {
			if(gps) {
				System.out.println(">> You can browse Google Maps and Navigate");
			}else {
				System.out.println(">> To Navigate you need to turn GPS on");
			}
		}else {
			System.out.println(">> To browse Google Maps you need to turn Internet on");
		}
		
		System.out.println();
		System.out.println(">> CAB OPTIONS");
		System.out.println("================");
		System.out.println(">> 1. OLA Micro");
		System.out.println(">> 2. OLA Mini");
		System.out.println(">> 3. OLA Sedan");
		System.out.println(">> 4. OLA Shared");
		System.out.println(">> 5. OLA Bike");
		
		//int typeOfCab = 4; // Lets take this as input from User
		
		Scanner scanner = new Scanner(System.in); // Scanner is class in Java which is Built In to read from Console
		System.out.println(">> Enter Your Choice of Cab: ");
		int typeOfCab = scanner.nextInt(); // nextInt will read integer which we will type on the console
		int baseFare = 100;
		
		switch(typeOfCab) {
			case 1:
				baseFare += 50; //baseFare = baseFare + 50;
				System.out.println(">> OLA Micro Booked");
				break;
				
			case 2:
				baseFare += 100; 
				System.out.println(">> OLA Mini Booked");
				break;
				
			case 3:
				baseFare += 200; 
				System.out.println(">> OLA Sedan Booked");
				break;
				
			case 4:
				baseFare -= 20; 
				System.out.println(">> OLA Shared Booked");
				break;
				
			case 5:
				baseFare -= 50; 
				System.out.println(">> OLA Bike Booked");
				break;
				
			default: 
				System.out.println(">> Invalid Choice");
				break;
		}
		
		System.out.println(">> You need to pay minimum of \u20b9"+baseFare+" to book the Cab !!");
		
	}

}
