package com.example.assessment;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Language {
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	@Id
	private String id;
	private String lname;
	private String description;
	
	@ManyToOne
	private Employee employee;
	
	public Language(){}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	

	public Language(String id, String lname, String description, String empId) {
		super();
		this.id = id;
		this.lname = lname;
		this.description = description;
		this.employee = new Employee(empId,"","");
 }
	
	
	
}
