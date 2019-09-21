package co.edureka.model;

/*
public class Connection {
	
	public Connection() {
		System.out.println(">> Connection Object Constructed: "+this); // this will print HashCode of Object 
	}

}*/

public class Connection {
	
	private static Connection con = new Connection(); // We create object here in the class itself
	
	private Connection() {
		System.out.println(">> Connection Object Constructed: "+this); // this will print HashCode of Object 
	}
	
	public static Connection getConnection() {
		return con;
	}

}
