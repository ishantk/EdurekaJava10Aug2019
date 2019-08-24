package co.edureka.exceptions;

public class Test {

	public static void main(String[] args) {
		
		System.out.println(">> 1");
		
		int[] arr = {1, 2, 3, 4, 5};
		try {
			System.out.println(">> arr[4] is: "+arr[4]);
			System.out.println(">> arr[11] is: "+arr[11]);
		}catch(ArithmeticException ae) {
			System.out.println(">> 2");
		}finally {
			System.out.println(">> 3");
		}
		
		System.out.println(">> 4");
		

	}

}

// H  : 1, 5, 3, 4
// EG1: 1, 5, exception, 3
// harish: 1, 5, exeption
