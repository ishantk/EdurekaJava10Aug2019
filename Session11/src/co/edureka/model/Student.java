package co.edureka.model;

import java.util.List;

public class Student {

	Integer roll;
	String name;
	Integer age;
	
	List<Certificate> certificates; // HAS-A Relationship | One to Many | One Student can have many Certificates in the form of List
	
	public Student() {
	
	}

	public Student(Integer roll, String name, Integer age, List<Certificate> certificates) {
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.certificates = certificates;
	}

	public Integer getRoll() {
		return roll;
	}

	public void setRoll(Integer roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public List<Certificate> getCertificates() {
		return certificates;
	}

	public void setCertificates(List<Certificate> certificates) {
		this.certificates = certificates;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", age=" + age + ", certificates=" + certificates + "]";
	}
	
}
