package co.edureka.designpatterns;

interface State{
	void showState();
}

class Ordered implements State{
	
	public void showState() {
		System.out.println(">> Order Placed");
	}
}

class Confirmed implements State{
	
	public void showState() {
		System.out.println(">> Order Confirmed");
	}
}

class Cancelled implements State{
	
	public void showState() {
		System.out.println(">> Order Cancelled");
	}
}

class Delivered implements State{
	
	public void showState() {
		System.out.println(">> Order Delivered");
	}
}

class Order{
	
	State state; // HAS-A Relationship | Order Has-A State
	
	void changeState(State newState) {
		state = newState;
	}
	
	void checkOrderStatus() {
		state.showState();
	}
}

public class StateApp {

	public static void main(String[] args) {
		
		State ordState = new Ordered();
		State conState = new Confirmed();
		State canState = new Cancelled();
		State delState = new Delivered();
		
		System.out.println(">> Customer Has Placed an Order");
		Order order = new Order();
		order.changeState(ordState);
		
		System.out.println(">> Checking Status..");
		order.checkOrderStatus();
		
		System.out.println();
		
		System.out.println(">> Customer Order has been confirmed at Restaurant");
		order.changeState(conState); // Restaurant Owner will change State :)
		
		System.out.println(">> Checking Status..");
		order.checkOrderStatus();
		
		System.out.println();
		
		System.out.println(">> Customer Order has been picked by delivery person");
		order.changeState(delState); // Delivery Person will change State :)
		
		System.out.println(">> Checking Status..");
		order.checkOrderStatus();

	}

}
