package co.edureka.one;

// public class : we can create only 1 class in the same source file and name of source file should be same as that of class name
public class One {
	
	// In class we can have attributes and methods
	// they can be : private, default, protected or public
	
	private void pvtShow() {
		System.out.println(">> private show of One");
	}
	
	void defShow() {
		System.out.println(">> default show of One");
	}
	
	protected void protShow() {
		System.out.println(">> protected show of One");
	}
	
	public void pubShow() {
		System.out.println(">> public show of One");
	}

}


// default class : we can create n-number of default classes in the same source file
class Two{
	
	private void pvtShow() {
		System.out.println(">> private show of Two");
	}
	
	void defShow() {
		System.out.println(">> default show of Two");
	}
	
	protected void protShow() {
		System.out.println(">> protected show of Two");
	}
	
	public void pubShow() {
		System.out.println(">> public show of Two");
	}
	
}

/*
// private class : we can directly create a private class in our source file
private class Three{
	
}

//protected class : we can directly create a protected class in our source file
protected class Four{
	
}
*/

// PS: only public and default classes are allowed, private and protected are not allowed :)

