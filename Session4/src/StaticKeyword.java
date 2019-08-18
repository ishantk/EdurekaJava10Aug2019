class Student{
	
	// Attributes: Property of Object
	int roll;
	String name;
	
	// Static Attribute : Property of Class and not of Object :)
	static String schoolName;
	
	// Method : Property of Object
	void showStudent() {
		System.out.println(">> "+roll+" belongs to "+name);
	}
	
	// Method : Property of Class and not of Object :)
	static void showSchool() {
		System.out.println("==="+schoolName+"===");
	}
}


public class StaticKeyword {

	public static void main(String[] args) {
	
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.roll = 101;
		s1.name = "John";
		
		s2.roll = 201;
		s2.name = "Fionna";
		
		s1.showStudent();
		s2.showStudent();
		
		// Data of Class is accessed with class name
		Student.schoolName = "ABC International";
		Student.showSchool();

		// References and Objects can access the data of class
		s1.schoolName = "XYZ International";
		s1.showSchool();
		
		s2.showSchool();
		Student.showSchool();
		
		// But Class cannot access data of Object :)
		//Student.roll = 111;  // error
		//Student.showStudent(); // error
		
	}

}

// PS: static     : Property of Class which is accessible by all the Objects as common data
//     non static : Property of Object and not accessible by class
