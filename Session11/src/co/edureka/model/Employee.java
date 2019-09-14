package co.edureka.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// Model or Bean or POJO (Plain Old Java Object)

@Entity
@Table(name = "MY_EMPLOYEES")
public class Employee {
	
	// Attributes of Employee Object
	
	@Id
	@GeneratedValue
	@Column(name = "EID")
	Integer eid;
	
	@Column(name = "NAME")
	String name;
	
	@Column(name = "PHONE")
	String phone;
	
	@Column(name = "EMAIL")
	String email;
	
	@Column(name = "DESIGNATION")
	String designation;
	
	@Column(name = "SALARY")
	Integer salary;
	
	public Employee() {
	
	}

	public Employee(Integer eid, String name, String phone, String email, String designation, Integer salary) {
		this.eid = eid;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.designation = designation;
		this.salary = salary;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", phone=" + phone + ", email=" + email + ", designation="
				+ designation + ", salary=" + salary + "]";
	}

}
