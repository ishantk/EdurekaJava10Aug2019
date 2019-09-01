package co.edureka.main;

import co.edureka.controller.RestaurantHelper;
import co.edureka.model.Restaurant;

public class App {

	public static void main(String[] args) {
		
		// Object Construction Statements Below:

		Restaurant restaurant1 = new Restaurant("Veggies Delight", "+91 99999 88888", 
				"Country Homes", "Veg", "10:00", "23:30", 600);

//		Restaurant restaurant2 = new Restaurant("Mc Donalds", "+91 989898 88888", 
//				"Redwood Shores", "Veg/NonVeg", "10:00", "24:00", 200);

		
//		System.out.println(restaurant1);
//		
//		System.out.println();
//		
//		System.out.println(restaurant2);
		
		// Objects are created in RAM. Data within them is temporary :)
		// We need to save the Data permanently.
		// Data Persistence
		// 1. Files using java.io APIs
		// 2. Files i.e. XML Files with XML APIs
		// 3. DataBase
		
		// >> 2. Files i.e. XML Files with XML APIs
		RestaurantHelper helper = new RestaurantHelper();
		helper.saveRestaurant(restaurant1);

	}

}
