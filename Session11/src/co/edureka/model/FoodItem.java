package co.edureka.model;

// Parent :)
public class FoodItem {
	
	Integer itemId;
	Integer price;
	
	public FoodItem() {
	
	}

	public FoodItem(Integer itemId, Integer price) {
		this.itemId = itemId;
		this.price = price;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "FoodItem [itemId=" + itemId + ", price=" + price + "]";
	}

}
