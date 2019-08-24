final class Parent{ // which cannot be extended
	// Which cannot be overrided i.e. which cannot be further customized :)
	final void show() {
		System.out.println(">> This is show of Parent");
	}
}

class Child{ //extends Parent{
	// Overriding Parent's show in Child
	// Q. Why you need overriding ?
	// A. We have a theme in our phone. using that theme we can create our new theme.
	//    We are basically overriding the theme
	//    So that we can do customizations :)
	/*
	void show() {
		System.out.println(">> This is show of Child");
	}*/
}


public class FinalKeyword {

	public static void main(String[] args) {
		
		int x = 10;
		x = 100; // We can update data in x
		
		// final cannot be modified :) -> Constant
		final int y = 10;
		//y = 100; // We cannot update data in y
		

	}

}
