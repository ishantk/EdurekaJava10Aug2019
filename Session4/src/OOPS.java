/*
 		
 		OOPS Principle !!
 		1. Think of an Object
 		2. Create its Class
 		3. From Class create a Real Object in memory
 	
 		Q. How shall we think of an object ?
 		A. Study deeply requirements of the project !!
 		   From the requirements pick up data !!
 		   
 		Requirement:
 			   Develop a Food Delivery App !!
 		
 		
 		>> 1. Think of an Object
 		FoodItem -> Object or Model
 		   name	 -> Attributes or State of an Object
 		   price
 		   description
 		   category
 	
*/

// >> 2. Create its Class
// Textual Representation of an Object
// Whatever we write in class is basically property of object i.e. it will be a part of Object !!
class FoodItem{
	
	// Attributes : Property of Object
	String name;
	int price;
	String description;
	String category;
	
	// Constructor - Default | Property of Object
	FoodItem(){
		name = "NA";
		price = 0;
		description = "NA";
		category = "Veg";
	}

	// Constructor - Parameterized or Non Default  | Property of Object
	FoodItem(String nm, int pr, String ds, String ct){
		name = nm;
		price = pr;
		description = ds;
		category = ct;
	}
	
	// Method : Property of Object and not of Class
	void setFoodItemData(String name, int price, String description, String category) {
		this.name = name;
		this.price = price;
		this.description = description;
		this.category = category;
		
		// this is a reference variables which holds hash code of current object in action
		// LHS | this.name -> Attribute
		// RHS | name      ->input to the method setFoodItemData
	}
	
	// Method : Property of Object and not of Class
	void showFoodItem() {
		System.out.println("======="+name+"=======");
		System.out.println(">> Price: "+price);
		System.out.println(">> Description: "+description);
		System.out.println(">> Category: "+category);
		System.out.println("======================");
	}
	
	// Method : Property of Object and not of Class
	int calculateDiscount() {
		
		int discount = 0;
		
		if(price>100) {
			discount = 20;
		}
		
		return discount;
	}
}

public class OOPS {

	// main will execute the statements which we write in it !!
	public static void main(String[] args) {
			
		// >> 3. From Class create a Real Object in memory
		
		// Attributes will have default data
		FoodItem item1 = new FoodItem();  // Object is constructed with default constructor
		
		// Attributes will data as per our choice
		FoodItem item2 = new FoodItem("Chocolate Ice Cream", 100, "Choco Chip Filled Ice Cream", "Dessert");  // Object is constructed with Parameterized constructor
		
		// item1 and item2 are not objects !!
		// They are reference variables, holding HashCode of Objects. Objects here have no name !! 
		
		// Printing Reference Variables
		System.out.println(">> item1 is: "+item1);
		System.out.println(">> item2 is: "+item2);
		
		System.out.println();
		
		// Updating the data
//		item1.name = "Jumbo Burger";
//		item1.price = 200;
//		item1.description = "Burger with loaded patties and cheese";
//		item1.category = "Meals";
		
		item1.setFoodItemData("Jumbo Burger", 200, "Burger with loaded patties and cheese", "Meals");
		
		// Challenge in above statements. 
		// If we have lets say 20 attributes, writing 20 lines of code to update the data will be difficult
		// Moving ahead below we are printing data for 2 objects and if we have to print data for n number of objects we have to write n number printing of statements
		
		// Printing the data in an Object
//		System.out.println(">> item1 data: ");
//		System.out.println(">> "+item1.name+" is priced at \u20b9"+item1.price);
		
		item1.showFoodItem();
		
		System.out.println();
		
//		System.out.println(">> item2 data: ");
//		System.out.println(">> "+item2.name+" is priced at \u20b9"+item2.price);
		
		item2.showFoodItem();
		
		System.out.println("Discount on "+item1.name+" is: "+item1.calculateDiscount());
		System.out.println("Discount on "+item2.name+" is: "+item2.calculateDiscount());

		
		
		
	}

}
