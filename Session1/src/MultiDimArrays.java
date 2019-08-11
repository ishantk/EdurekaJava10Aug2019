
public class MultiDimArrays {

	public static void main(String[] args) {
		
		// 5 multi value containers below
		// Arrays
		int[] johnsMarks = {90, 88, 77};
		int[] jenniesMarks = {70, 55, 77};
		int[] jimsMarks = {88, 99, 65};
		int[] joesMarks = {97, 76, 87};
		int[] jacksMarks = {67, 55, 45};
		
		// Club up all the multi value container in a multi value container
		// Array of Arrays :)
		// 2-D Array :)
		int[][] marks = {
							{90, 88, 77},	//0
							{70, 55, 77},	//1
							{88, 99, 65},	//2
							{97, 76, 87},	//3
							{67, 55, 45}	//4
					    };
		
		System.out.println(">> johnsMarks is: "+johnsMarks);					// HashCode
		System.out.println(">> Length of johnsMarks is: "+johnsMarks.length);	// 3
		System.out.println(">> johnsMarks[0] is: "+johnsMarks[0]); 				// 90
		
		System.out.println(">> marks is: "+marks);								// HashCode of marks 			
		System.out.println(">> Length of marks is: "+marks.length);				// 5 
		System.out.println(">> marks[0] is: "+marks[0]);						// HashCode of marks[0]th array 
		System.out.println(">> Length of marks[0] is: "+marks[0].length);		// 3
		
		System.out.println(">> marks[0][1] is: "+marks[0][1]);					// 88
		
		// 2-D Array represents an Image :)
		// Image is a collection of Pixel
		// Pixel is a collection of RGB Values
					  // R,  G,   B	
		int[] pixel1 = {128, 100, 145};
		int[] pixel2 = {128, 100, 145};
		int[] pixel3 = {128, 100, 145};
		
		int[][] image = {pixel1, pixel2, pixel3}; // :)
	}

}
