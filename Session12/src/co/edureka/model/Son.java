package co.edureka.model;

public class Son extends Father{ // IS-A Relationship
	
	int vehicles;
	String companyName;
	
	public Son() {
	
	}

	public Son(int vehicles, String companyName) {
		this.vehicles = vehicles;
		this.companyName = companyName;
	}

	public int getVehicles() {
		return vehicles;
	}

	public void setVehicles(int vehicles) {
		this.vehicles = vehicles;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Son [vehicles=" + vehicles + ", companyName=" + companyName + ", fname=" + fname + ", lname=" + lname
				+ ", wealth=" + wealth + "]";
	}

}
