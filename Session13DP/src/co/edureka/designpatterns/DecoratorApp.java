package co.edureka.designpatterns;

interface FoodItem{
	String getDescription();
	int getPrice();
}

class VeggieBurger implements FoodItem{

	public String getDescription() {
		return "Veggie Burger loaded with Cheese and Herbs.";
	}

	public int getPrice() {
		return 200;
	}
}

abstract class FoodDecorator implements FoodItem{
	
	FoodItem item; // HAS-A Relationship | This is Food Item which shall be decorated
	
	FoodDecorator(FoodItem item){
		this.item = item;
	}
	
	public String getDescription() {
		return item.getDescription();
	}

	public int getPrice() {
		return item.getPrice();
	}
}

class VeggieMeal extends FoodDecorator{

	VeggieMeal(FoodItem item) {
		super(item);
	}
	
	public String getDescription() {
		return super.getDescription()+ " Upgraded to Meal with Fries and Coke.";
	}

	public int getPrice() {
		return super.getPrice() + 150;
	}
}

public class DecoratorApp {

	public static void main(String[] args) {
		
		FoodItem item = new VeggieBurger(); // RTP
		System.out.println(">> Description: "+item.getDescription());
		System.out.println(">> Price: "+item.getPrice());
		
		System.out.println("==Upgrading to a Meal==");
		
		VeggieMeal meal = new VeggieMeal(item); // Passed VeggieBurger into VeggieMeal
		System.out.println(">> Description: "+meal.getDescription());
		System.out.println(">> Price: "+meal.getPrice());
	}

}
