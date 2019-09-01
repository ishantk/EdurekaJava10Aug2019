package co.edureka.model;

// Model or Bean or POJO
public class Restaurant {

	// Attributes : Property of Object
	public String name;
	public String phone;
	public String address;
	public String category;
	public String openingHours;
	public String closingHours;
	public int priceForTwoPeople;
	
	public Restaurant() {
		
	}
	
	public Restaurant(String name, String phone, String address, String category, String openingHours,
			String closingHours, int priceForTwoPeople) {
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.category = category;
		this.openingHours = openingHours;
		this.closingHours = closingHours;
		this.priceForTwoPeople = priceForTwoPeople;
	}

	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", phone=" + phone + ", address=" + address + ", category=" + category
				+ ", openingHours=" + openingHours + ", closingHours=" + closingHours + ", priceForTwoPeople="
				+ priceForTwoPeople + "]";
	}
	
}
