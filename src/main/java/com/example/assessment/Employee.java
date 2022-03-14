package com.example.assessment;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	@Id
	private String id;
	private  String ename;
	private String qualification;
	
	public Employee(){}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Employee(String id, String ename, String qualification) {
		super();
		this.id = id;
		this.ename = ename;
		this.qualification = qualification;
	}
	
	
	
}
