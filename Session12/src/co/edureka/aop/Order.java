package co.edureka.aop;


public class Order {
	
	int oid;
	String customerName;
	int price;
	boolean status;
	
	public Order() {
	
	}
	
	public Order(int oid, String customerName, int price, boolean status) {
		this.oid = oid;
		this.customerName = customerName;
		this.price = price;
		this.status = status;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	// Business Method with some Core Logic
	public void processOrder(String where, String when) {
		
		// 1. check for Stock of the Item which is ordered			[ Pre Condition ]
		// 2. process the order by taking payment from Customer		[ Core Logic ]
		// 3. Notify Customer Via some Email or SMS					[ Post Condition ]
		
		// With AOP we can break this logic into 3 steps | API : Advice
		
		if(status) {
			System.out.println("..........................");
			System.out.println(">> processOrder executed");
			System.out.println(">> Payment Collected from Customer");
			System.out.println("..........................");
		}else {
			System.out.println(">> Sorry !! We are Out of Stock");
		}
		
		System.out.println();
		
	}

	@Override
	public String toString() {
		return "Order [oid=" + oid + ", customerName=" + customerName + ", price=" + price + "]";
	}

}
