import java.util.Scanner; // Scanner is a Built-In Class for reading data from Console entered by User

public class Query {

	public static void main(String[] args) {
		
		// integer array of 5 elements | Stack and Heap Model
		int[] numbers = new int[5];
		System.out.println(">> numbers is: "+numbers); // HashCode
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(">> Enter 5 Numbers Below: ");
		
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = scanner.nextInt(); // nextInt() -> reads integer number on console
		}

		System.out.println("Thank You For Entering Data Below:");
		
		/*for(int i=0;i<numbers.length;i++) {
			System.out.println(">> "+numbers[i]);
		}*/
		
		//int i = 0;
		
		/*while(i<numbers.length) {
			System.out.println(">> "+numbers[i]);
			i++;
		}*/
		
		/*do {
			System.out.println(">> "+numbers[i]);
			i++;
		}while(i<numbers.length);*/
		
		// Enhanced For Loop : Works with Arrays and Collections in Java :)
		// element can be any name of your choice
		// Automatically elements from indexes i.e. values will be copied into array
		// always works from 0th index till length-1 index
		for(int element : numbers) {
			System.out.println(">> "+element);
		}
		
	}

}
