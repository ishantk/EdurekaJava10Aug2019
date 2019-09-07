package co.edureka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import co.edureka.model.Customer;

public class DBHelper {
	
	// must be imported from java.sql package
	Connection connection; 
	PreparedStatement preparedStatement; // Just like Statement API

	public DBHelper() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//System.out.println(">> Driver Loaded :)");
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	// Method Name createConnection can be anyNameOfyourChoice
	public void createConnection() {
		try {
			
			String user = "root";
			String password = "";
			String dbName = "edureka";
			String url = "jdbc:mysql://localhost/"+dbName;
			
			connection = DriverManager.getConnection(url, user, password);
			//System.out.println(">> Connection Created :)");
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	// We are taking User Object's Reference as Input to this method
	public int registerCustomer(Customer customer) {
		
		int rows = 0;
		
		try {
			
			String sql = "insert into Customer values(null, ?, ?, ?, ?)";
			preparedStatement = connection.prepareStatement(sql);
			
			// We are substituting the values on ?
			preparedStatement.setString(1, customer.name);
			preparedStatement.setString(2, customer.phone);
			preparedStatement.setString(3, customer.email);
			preparedStatement.setString(4, customer.password);
			
			rows = preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
		
		return rows;
	}
	
	public Customer loginCustomer(Customer customer) {
		
		Customer cRef = null;
		
		try {
			
			String sql = "select * from Customer where email = ? and password = ?";
			preparedStatement = connection.prepareStatement(sql);
			
			// We are substituting the values on ?
			preparedStatement.setString(1, customer.email);
			preparedStatement.setString(2, customer.password);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			if(rs.next()) {
				cRef = new Customer();
				cRef.cid = rs.getInt(1);
				cRef.name = rs.getString(2);
				cRef.phone = rs.getString(3);
				cRef.email = rs.getString(4);
				cRef.password = rs.getString(5);
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
		
		return cRef;
	}
	
	public void closeConnection() {
		try {
			connection.close();
			//System.out.println(">> Connection Closed :)");
		} catch (Exception e) { // Polymorphic Structure : Exception is parent to all the Exceptions in Java
			System.out.println(">> Some Exception: "+e);
		}
	}

}
