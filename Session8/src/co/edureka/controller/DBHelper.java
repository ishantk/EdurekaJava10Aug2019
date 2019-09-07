package co.edureka.controller;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

import javax.jws.soap.SOAPBinding.Use;

import co.edureka.model.User;

/*
 
 	1. Download Type4 Jar file which is JDBC Driver for MySQL Database from MySQL Website
 	   1.1 Link the jar file in your program by updating build path of the project
 	   PS: You need to download jar file only once and when its in your computer you can re-use it 
 	   Links : https://dev.mysql.com/downloads/connector/j/
 	   		   https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.17
 	   		   
 	2. Use API Class.forname to programmatically load the Driver.class  
 	
 	3. Create Connection with DataBase
 	   3.1 Username password and dbname is required
 	   3.2 URL to database is required
 	   3.3 Connection and DriverManager APIs will be used to establish Connection		   
 
 	4. Execution of SQL Command
 	   4.1 Write SQL Command as a String
 	   4.2 User either Statement API or PreapredStatement API to execute SQL Command
 	   
 	5. Close Connection with DataBase
 	   
 	   
 
 */

// Design Pattern : DAO (Data Access Object) with which we are accessing the database

//Class Name DBHelper can be anyNameOfyourChoice
public class DBHelper {
	
	// must be imported from java.sql package
	Connection connection; 
	
	Statement statement;   
	PreparedStatement preparedStatement; // Just like Statement API
	
	CallableStatement callableStatement; // To Execute Stored Procedure
	
	
	public DBHelper() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(">> Driver Loaded :)");
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
			System.out.println(">> Connection Created :)");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	// We are taking User Object's Reference as Input to this method
	public void registerUser(User user) {
		try {
			
			
			/*
			//String sql = "insert into User values(null, 'John', '+91 99999 88888', 'john@example.com')";			// HardCoded
			String sql = "insert into User values(null, '"+user.name+"', '"+user.phone+"', '"+user.email+"')";		// Dynamic Substution from Object
			
			statement = connection.createStatement();
			int rows = statement.executeUpdate(sql); // executeUpdate method shall fire SQL Query on SQL Engine
			//System.out.println(">> Rows Inserted: "+rows);
			
			if(rows>0) {
				System.out.println(">> "+user.name+" Registered with Us :) "+rows);
			}else {
				System.out.println(">> "+user.name+" Not Registered with Us :( "+rows);
			}
			*/
			
			String sql = "insert into User values(null, ?, ?, ?)";
			preparedStatement = connection.prepareStatement(sql);
			
			// We are substituting the values on ?
			preparedStatement.setString(1, user.name);
			preparedStatement.setString(2, user.phone);
			preparedStatement.setString(3, user.email);
			
			int rows = preparedStatement.executeUpdate();
			
			if(rows>0) {
				System.out.println(">> "+user.name+" Registered with Us :) "+rows);
			}else {
				System.out.println(">> "+user.name+" Not Registered with Us :( "+rows);
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	// We are taking User Object's Reference as Input to this method
	public void updateUser(User user) {
		try {
			
			String sql = "update user set name = ?, phone = ?, email = ? where uid = ?";
			preparedStatement = connection.prepareStatement(sql);
			
			// We are substituting the values on ?
			preparedStatement.setString(1, user.name);
			preparedStatement.setString(2, user.phone);
			preparedStatement.setString(3, user.email);
			preparedStatement.setInt(4, user.uid);
			
			int rows = preparedStatement.executeUpdate();
			
			if(rows>0) {
				System.out.println(">> "+user.name+" Updated with Us :) "+rows);
			}else {
				System.out.println(">> "+user.name+" Not Updated with Us :( "+rows);
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	public void deleteUser(int uid) {
		try {
			
			String sql = "delete from User where uid = ?";
			preparedStatement = connection.prepareStatement(sql);
			
			// We are substituting the values on ?
			preparedStatement.setInt(1, uid);
			
			int rows = preparedStatement.executeUpdate();
			
			if(rows>0) {
				System.out.println(">> "+uid+" Deleted with Us :) "+rows);
			}else {
				System.out.println(">> "+uid+" Not Deleted with Us :( "+rows);
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
			e.printStackTrace();
		}
	}
	
	public ArrayList<User> fetchAllUsers() {
		
		ArrayList<User> users = new ArrayList<User>();
		
		try {
			
			
			String sql = "select * from User";
			preparedStatement = connection.prepareStatement(sql);
			

			// ResultSet shall have the data i.e. entire table data :)
			ResultSet rs = preparedStatement.executeQuery();  // For Select SQL Commands we need to use executeQuery method
			
			while(rs.next()) {
				
				User user = new User();
				user.uid = rs.getInt(1);		// 1st column of table
				user.name = rs.getString(2);	// 2nd column of table
				user.phone = rs.getString(3);	// 3rd column of table
				user.email = rs.getString(4);   // 4th column of table
				
				//user.showUser();
				
				users.add(user); // Read the record form Table -> Convert it as Object -> and add it to ArrayList
				
			}
			
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
			e.printStackTrace();
		}
		
		return users;
	}
	
	
	public void executeProcedure(User user) {
		
		try {
			
			String sql = "{ call addUser(?, ?, ?) }"; // SQL Query to execute addUser Procedure
			callableStatement = connection.prepareCall(sql);
			
			callableStatement.setString(1, user.name);
			callableStatement.setString(2, user.phone);
			callableStatement.setString(3, user.email);
			
			callableStatement.execute();
			System.out.println(">> Procedure is Executed :)");
			
		} catch (SQLException e) {
			System.out.println(">> Some Exception: "+e);
			e.printStackTrace();
		}
		
	}
	
	public void processBatchAsTransaction() {
		
		try {
			
			//String sql1 = "update User set name='Mike Watson', email='mike.w@example.com', phone='+91 99999 22222' where uid = 4";
			String sql1 = "delete from User where uid = 4";		// Correct SQL Statement
			String sql2 = "delete from User where userid = 6";  // SQL Statement will cause an exception as column userid doesn not exist
			
			statement = connection.createStatement();
			statement.addBatch(sql1);
			statement.addBatch(sql2);
			
			connection.setAutoCommit(false); // We need to manage batch as a Transaction(Everything should be executed without fail)
			
			int[] results = statement.executeBatch();
			connection.commit();             // Execute Batch as Transaction
			System.out.println(">> Batch Executed: "+Arrays.toString(results));
		} catch (Exception e) {
			System.out.println(">> Something Went Wrong: "+e);
			
			try {
				connection.rollback();
				System.out.println(">> Transaction Rolled Back :(");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		}
		
	}
	
	public void closeConnection() {
		try {
			connection.close();
			System.out.println(">> Connection Closed :)");
		} catch (Exception e) { // Polymorphic Structure : Exception is parent to all the Exceptions in Java
			System.out.println(">> Some Exception: "+e);
		}
	}

}
