
public class Loops {

	public static void main(String[] args) {
		
		// Employees with thr salaries :)
		/*
		int johnsSalary = 30000;
		int jenniesSalary = 40000;
		int jimsSalary = 50000;
		int jacksSalary = 60000;
		int joesSalary = 70000;
		*/
		
		// Use Arrays to simpify storage technique
		// 0th Index : John, 1st Index : Jennie .. so on and so forth
		int[] salaries = {30000, 40000, 50000, 60000, 70000, 43000, 12000, 98700, 12300, 33000, 76500};
		
		// Observation Below : Same Task is Repeatedly done !!
		//					   Same Statements have been repeated :)
		// As of now we have written a program which only calculates hikes for 5 employees.
		// if employees increases we have to write code again
		// We will use Loops as rescue or Solution to the challenge :)
		/*
		double hike = salaries[0] + (salaries[0] * (20.0/100.0));
		System.out.println(">> Hike#0 is: "+hike);
		
		hike = salaries[1] + (salaries[1] * (20.0/100.0));
		System.out.println(">> Hike#1 is: "+hike);
		
		hike = salaries[2] + (salaries[2] * (20.0/100.0));
		System.out.println(">> Hike#2 is: "+hike);
		
		hike = salaries[3] + (salaries[3] * (20.0/100.0));
		System.out.println(">> Hike#3 is: "+hike);
		
		hike = salaries[4] + (salaries[4] * (20.0/100.0));
		System.out.println(">> Hike#4 is: "+hike);
		*/
		
		double hike = 0;
		int idx = 11; // starting index
		
		
		while(idx < salaries.length) { // idx < 5 i.e. idx from 0 to 4 | We check condition and enter loop
			hike = salaries[idx] + (salaries[idx] * (20.0/100.0));
			System.out.println(">> Hike#"+idx+" is: "+hike);
			idx++; // increment the index value by 1
		}
		
		
		/*
		do {
			hike = salaries[idx] + (salaries[idx] * (20.0/100.0));
			System.out.println(">> Hike#"+idx+" is: "+hike);
			idx++; // increment the index value by 1
		}while(idx < salaries.length); // Condition is checked in the end i.e. later
		*/

		// For Loop: Better Syntax as compared to while
		for(int i=0;i<salaries.length;i++) {
			hike = salaries[i] + (salaries[i] * (20.0/100.0));
			System.out.println(">> Hike#"+i+" is: "+hike);
		}
		
	}

}
