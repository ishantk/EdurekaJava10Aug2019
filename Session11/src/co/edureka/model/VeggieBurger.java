package co.edureka.model;

// Child
public class VeggieBurger extends FoodItem{
	
	String name;
	String description;
	
	public VeggieBurger() {
	
	}

	public VeggieBurger(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "VeggieBurger [name=" + name + ", description=" + description + ", itemId=" + itemId + ", price=" + price
				+ "]";
	}

	

}
