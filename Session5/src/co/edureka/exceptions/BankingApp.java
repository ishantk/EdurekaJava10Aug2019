package co.edureka.exceptions;

import java.io.IOException; // built-In Checked Exception

// Custom Exception Classes in case you need to handle some logics :)

// CHECKED Exception
class MyBankingException extends Exception{
	MyBankingException(String message){
		super(message);
	}
}

//UN-CHECKED Exception
class YourBankingException extends RuntimeException{
	YourBankingException(String message){
		super(message);
	}
}

class CustomerAccount{
	
	int balance = 10000;
	int minBalance = 2000;
	int minAttempts = 0;
	
	void withdraw(int amount) throws IOException, MyBankingException { // compiler wants us to write in method signature what exception is being thrown !!
		
		balance = balance - amount;
		
		if(balance <= minBalance) {
			balance = balance + amount;
			System.out.println(">> Withdrawl Failed. Balance is Low: \u20b9"+balance);
			
			minAttempts++;
			
		}else {
			System.out.println(">> Withdrawl Success. New Balance is: \u20b9"+balance);
		}
		
		if(minAttempts == 3) {
			// We will now Crash our Program :)
			
			// UnChecked Exceptions are children of RuntimeException class
			// All others fall under Checked Exception category
			
			// 1. Throwing an Un-Checked Exception
			//ArithmeticException aRef = new ArithmeticException("Illegal Attempts !!");
			//throw aRef; // throw the exception programmatically to crash the Program :)
			
			// 2. 1. Throwing a Checked Exception
			//IOException iRef = new IOException("Illegal Attempts !!");
			//throw iRef; // throwing a checked exception, compiler gives an error | solution : use throws keyword in methods signature
			
			
			MyBankingException mRef = new MyBankingException("Illegal Attempts !!");
			throw mRef;
		}
		
	}
}

public class BankingApp {

	public static void main(String[] args) {
	
		System.out.println(">> Banking Started");
		
		CustomerAccount cRef = new CustomerAccount();
		
		try {
			for(int i=1;i<=1000;i++) {
				cRef.withdraw(3000);
			}
		}catch(Exception eRef) {
			System.out.println(">> OOPS!! Something Went Wrong !! "+eRef);
		}
		
		// if n number of customers they start attempting n number of times with invalid attempts, Bank's resources shall become occupied !!
		
		System.out.println(">> Banking Finished");
	}

}
