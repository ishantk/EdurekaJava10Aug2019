package co.edureka.model;

/*
 
 JAVA : We Create Class which represents Object Structure
 class User {
	
	// Attributes of User Object
	public int uid;
	public String name;
	public String phone;
	public String email;
 }
 
 ORM : Object Relational Mapping
 	   Look your object structure and simply create its table
 	   
 	   Your Java Class Name -> MySQL Table
 	   Attribute Names      -> Table Column Names
 
 SQL : We create Table which shall store data of Object from JAVA Program
 
 // 1. SQL Command : Create Table
 create table User(
 	uid int primary key auto_increment,
 	name varchar(256),
 	phone varchar(256),
 	email varchar(256)
 )
 
 // 2. SQL Command : Insert Data in Table
 insert into User values(null, 'John', '+91 99999 88888', 'john@example.com') 
   
 // 3. SQL Command : Update Data in Table
 update User set name = 'John Watson', phone = '+91 99999 88888', email = 'john.w@example.com' where uid = 1
 
 // 4. SQL Command : Delete Data from Table
 delete from User where uid = 1  
 
 // 5. SQL Command : Fetch Table Data
 select * from User
 select name, phone from User
 select * from User where uid = 1
 select * from User where uid > 10
  
 */

public class User {
	
	// Attributes of User Object
	public int uid;
	public String name;
	public String phone;
	public String email;
	
	public User() {
	
	}

	public User(int uid, String name, String phone, String email) {
		this.uid = uid;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	public String toString() {
		return "Your Details: \nName=" + name + "\nPhone=" + phone + "\nEmail=" + email;
	}
	
	public void showUser() {
		
		System.out.println();
		
		System.out.println("====================");
		System.out.println("UID\t"+uid);
		System.out.println("NAME\t"+name);
		System.out.println("PHONE\t"+phone);
		System.out.println("EMAIL\t"+email);
		System.out.println("====================");
	}
	
}
