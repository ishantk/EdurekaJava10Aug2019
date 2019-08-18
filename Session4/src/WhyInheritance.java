/*
class Shoe{
	
	// Attributes: Property of Object
	int pid;
	String name;
	String brand;
	int price;
	String color;
	int size;
	
	void setShoeData(int pid, String name, String brand, int price, String color, int size) {
		this.pid = pid;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.size = size;
	}
	
	void showShoeData() {
		System.out.println("====Shoe Details====");
		System.out.println(">> pid: "+pid);
		System.out.println(">> name: "+name);
		System.out.println(">> brand: "+brand);
		System.out.println(">> price: "+price);
		System.out.println(">> color: "+color);
		System.out.println(">> size: "+size);
		System.out.println("====================");
	}
	
}

class MobilePhone{
	
	// Attributes: Property of Object
	int pid;
	String name;
	String brand;
	int price;
	String os;
	int ram;
	int memory;
	
	void setMobileData(int pid, String name, String brand, int price, String os, int ram, int memory) {
		this.pid = pid;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.os = os;
		this.ram = ram;
		this.memory = memory;
	}
	
	void showMobileData() {
		System.out.println("====Mobile Details====");
		System.out.println(">> pid: "+pid);
		System.out.println(">> name: "+name);
		System.out.println(">> brand: "+brand);
		System.out.println(">> price: "+price);
		System.out.println(">> OS: "+os);
		System.out.println(">> RAM: "+ram);
		System.out.println(">> Memory: "+memory);
		System.out.println("====================");
	}
}

class LEDTv{
	
	// Attributes: Property of Object
	int pid;
	String name;
	String brand;
	int price;
	int screenSize;
	String technology;
	
	void setLedTvData(int pid, String name, String brand, int price, int screenSize, String technology) {
		this.pid = pid;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.screenSize = screenSize;
		this.technology = technology;
	}
	
	void showLedTvData() {
		System.out.println("====LedTv Details====");
		System.out.println(">> pid: "+pid);
		System.out.println(">> name: "+name);
		System.out.println(">> brand: "+brand);
		System.out.println(">> price: "+price);
		System.out.println(">> screenSize: "+screenSize);
		System.out.println(">> technology: "+technology);
		System.out.println("====================");
	}
}

// Challenge : We have 4 attributes which are common in all these objects.
//			   Further statements within set and show methods are also common !!

// Solution  : Inheritance. We use Inheritance where we find such commonly repeated data and methods in multiple classes
*/

// Product class will be Parent with common attribute and common methods
class Product{
	
	int pid;
	String name;
	String brand;
	int price;
	
	Product(){
		System.out.println(">> Product Object Constructed");
	}
	
	void setProductData(int pid, String name, String brand, int price) {
		this.pid = pid;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	
	void showProductData() {
		System.out.println(">> pid: "+pid);
		System.out.println(">> name: "+name);
		System.out.println(">> brand: "+brand);
		System.out.println(">> price: "+price);
	}
	
}

class Shoe extends Product{ // Parent Child Relationship
	
	// Attributes: Property of Object
	String color;
	int size;
	
	Shoe(){
		System.out.println(">> Shoe Object Constructed");
	}
	
	void setShoeData(int pid, String name, String brand, int price, String color, int size) {
		super.setProductData(pid, name, brand, price);
		this.color = color;
		this.size = size;
	}
	
	void showShoeData() {
		System.out.println("====Shoe Details====");
		super.showProductData();
		System.out.println(">> color: "+color);
		System.out.println(">> size: "+size);
		System.out.println("====================");
	}
	
}

class MobilePhone extends Product{
	
	// Attributes: Property of Object
	String os;
	int ram;
	int memory;
	
	MobilePhone(){
		System.out.println(">> MobilePhone Object Constructed");
	}
	
	void setMobileData(int pid, String name, String brand, int price, String os, int ram, int memory) {
		super.setProductData(pid, name, brand, price);
		this.os = os;
		this.ram = ram;
		this.memory = memory;
	}
	
	void showMobileData() {
		System.out.println("====Mobile Details====");
		super.showProductData();
		System.out.println(">> OS: "+os);
		System.out.println(">> RAM: "+ram);
		System.out.println(">> Memory: "+memory);
		System.out.println("====================");
	}
}

class LEDTv extends Product{
	
	// Attributes: Property of Object
	int screenSize;
	String technology;
	
	LEDTv(){
		System.out.println(">> LEDTv Object Constructed");
	}
	
	
	void setLedTvData(int pid, String name, String brand, int price, int screenSize, String technology) {
		super.setProductData(pid, name, brand, price);
		this.screenSize = screenSize;
		this.technology = technology;
	}
	
	void showLedTvData() {
		System.out.println("====LedTv Details====");
		super.showProductData();
		System.out.println(">> screenSize: "+screenSize);
		System.out.println(">> technology: "+technology);
		System.out.println("====================");
	}
}


public class WhyInheritance {

	public static void main(String[] args) {
		
		Shoe s1 = new Shoe(); // Before Object of Shoe, Object of Product will be constructed in memory
		s1.setShoeData(101, "AlphaBounce", "Adidas", 8000, "Black", 8);
		
		System.out.println();
		
		MobilePhone m1 = new MobilePhone();
		m1.setMobileData(201, "iPhoneX", "Apple", 80000, "iOS", 4, 128);
		
		System.out.println();
		
		LEDTv l1 = new LEDTv();
		l1.setLedTvData(301, "Samsung OLED", "Samsung", 70000, 50, "OLED");
		
		System.out.println();
		
		s1.showShoeData();
		System.out.println();

		m1.showMobileData();
		System.out.println();
		
		
		l1.showLedTvData();
		
		

	}

}
