public class ValueVsRef {

	// Passing the Value
	void squareOfNum(int num) {
		num = num * num; // we are updating num
		System.out.println(">> Square is: "+num); // 25
	}
	
	// Passing the Reference (HashCode)
	void squareOfNumbers(int[] nums) { // Array as Input : nums is a reference variable
		System.out.println(">> nums is: "+nums);
		
		for(int i=0;i<nums.length;i++) {
			nums[i] = nums[i] * nums[i];  // squaring each element in array
		}
	}
	
	// main will be executed automatically when we run our program
	// whatever we write in main will be executed in a sequence.
	public static void main(String[] args) {
		
		ValueVsRef vRef = new ValueVsRef(); // Object Construction Statement
		
		/*
		int number = 5;
		System.out.println(">> number before method execution is: "+number); // 5
		
		vRef.squareOfNum(number); // execution of method
		
		//System.out.println(">> num is: "+num); // error : because num is not creates in main, it is part of squareOfNum
		
		System.out.println(">> number after method execution is: "+number); // 5
		*/
		
		int[] numbers = {1, 2, 3, 4, 5};
		System.out.println(">> numbers is: "+numbers);
		vRef.squareOfNumbers(numbers);
		
		for(int i=0;i<numbers.length;i++) {
			System.out.println(">> "+numbers[i]);
		}
		
	}

}
