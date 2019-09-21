package co.edureka.designpatterns;

import co.edureka.model.Connection;

public class SingletonApp {

	public static void main(String[] args) {
		
		// Now we cannot create objects below as constructor is marked as private
//		Connection con1 = new Connection();
//		Connection con2 = new Connection();
//		Connection con3 = new Connection();
		
		Connection con1 = Connection.getConnection();
		Connection con2 = Connection.getConnection();
		Connection con3 = Connection.getConnection();
		
		System.out.println(">> con1 is: "+con1);
		System.out.println(">> con2 is: "+con2);
		System.out.println(">> con3 is: "+con3);
				

	}

}
