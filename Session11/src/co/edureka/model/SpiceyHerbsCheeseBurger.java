package co.edureka.model;

// GrandChild
public class SpiceyHerbsCheeseBurger extends VeggieBurger{
	
	String herbs;
	Integer spice; // 0 to 5
	
	public SpiceyHerbsCheeseBurger() {
	
	}

	public SpiceyHerbsCheeseBurger(String herbs, Integer spice) {
		this.herbs = herbs;
		this.spice = spice;
	}

	public String getHerbs() {
		return herbs;
	}

	public void setHerbs(String herbs) {
		this.herbs = herbs;
	}

	public Integer getSpice() {
		return spice;
	}

	public void setSpice(Integer spice) {
		this.spice = spice;
	}

	@Override
	public String toString() {
		return "SpiceyHerbsCheeseBurger [herbs=" + herbs + ", spice=" + spice + ", name=" + name + ", description="
				+ description + ", itemId=" + itemId + ", price=" + price + "]";
	}

}
